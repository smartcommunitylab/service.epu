package it.smartcampuslab.epu.controller;

import it.infotn.epu.AmbitoTerritorialeType;
import it.infotn.epu.ComuneType;
import it.infotn.epu.DomandaEPU;
import it.infotn.epu.DomandaEpuFault_Exception;
import it.infotn.epu.DomandaWSAmbitiTerritorialiInput;
import it.infotn.epu.DomandaWSAmbitiTerritorialiOutput;
import it.infotn.epu.DomandaWSCaricaInput;
import it.infotn.epu.DomandaWSCaricaOutput;
import it.infotn.epu.DomandaWSComuniInput;
import it.infotn.epu.DomandaWSComuniOutput;
import it.infotn.epu.DomandaWSConsolidaInput;
import it.infotn.epu.DomandaWSConsolidaOutput;
import it.infotn.epu.DomandaWSEdizioniFinanziateInput;
import it.infotn.epu.DomandaWSEdizioniFinanziateOutput;
import it.infotn.epu.DomandaWSEliminaInput;
import it.infotn.epu.DomandaWSEliminaOutput;
import it.infotn.epu.DomandaWSModificaInput;
import it.infotn.epu.DomandaWSModificaOutput;
import it.infotn.epu.DomandaWSRegistraInput;
import it.infotn.epu.DomandaWSRegistraOutput;
import it.infotn.epu.DomandaWSRicercaInput;
import it.infotn.epu.DomandaWSRicercaOutput;
import it.infotn.epu.DomandaWSStampaInput;
import it.infotn.epu.DomandaWSStampaOutput;
import it.infotn.epu.EdizioneFinanziataType;
import it.infotn.epu.Esito;
import it.infotn.epu.TipoStampa;
import it.smartcampuslab.epu.model.CPSData;
import it.smartcampuslab.epu.model.CreazionePratica;
import it.smartcampuslab.epu.model.ElenchiItem;
import it.smartcampuslab.epu.model.ElenchiOutput;
import it.smartcampuslab.epu.model.PDFData;
import it.smartcampuslab.epu.model.ProtocollaResult;
import it.smartcampuslab.epu.model.UploadAttachment;
import it.smartcampuslab.epu.model.UploadOutput;
import it.smartcampuslab.epu.storage.DomandaInfo;
import it.smartcampuslab.epu.storage.PagamentoInfo;
import it.smartcampuslab.epu.storage.PraticaData;
import it.smartcampuslab.epu.storage.PraticaStorage;
import it.smartcampuslab.epu.storage.ProtocolloInfo;
import it.smartcampuslab.epu.storage.Status;
import it.smartcampuslab.p3.Dichiarazioni;
import it.smartcampuslab.p3.TypeAutocertificazione;
import it.smartcampuslab.p3.TypeEsenzionemarcabollo;
import it.smartcampuslab.p3.TypeMarcabollo;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.Holder;

import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.adobe.idp.services.approvalpdf.ModulisticaOnlineApprovalPDF;
import com.adobe.idp.services.formupload.ModulisticaOnlineFormUpload;
import com.adobe.idp.services.formupload.XML;
import com.adobe.idp.services.getpdf.BLOB;
import com.adobe.idp.services.getpdf.ModulisticaOnlineGetPDF;

@Controller
public class EPUController {

	private static final String DOMANDA_CONTRIBUTO_O_LOCAZIONE_ALLOGGIO = "DOMANDA CONTRIBUTO O LOCAZIONE ALLOGGIO";

	private static final String ID_ENTE = "24";

	@Autowired
	@Value("${epu_endpoint}")
	private String epuEndpoint;

	@Autowired
	@Value("${u_n}")
	private String username;

	@Autowired
	@Value("${p_v}")
	private String password;

	@Autowired
	@Value("${p3_u}")
	private String p3Username;

	@Autowired
	@Value("${p3_p}")
	private String p3Password;

	@Autowired
	private PraticaStorage storage;

	@Autowired
	private AdobeHelper adobeHelper;

	@Autowired
	private EPUHelper epuHelper;

	@Autowired
	@Value("${server}")
	private String server;

	private static final String PROD = "prod";
	private static final String DEV = "dev";
	private static final String TEST = "test";

	private Logger log = Logger.getLogger(this.getClass());

	@Value("${myweb.mail.host}")
	private String mailHost;
	@Autowired
	@Value("${myweb.mail.port}")
	private String mailPort;
	@Autowired
	@Value("${myweb.mail.user}")
	private String mailUser;
	@Autowired
	@Value("${myweb.mail.password}")
	private String mailPassword;
	@Autowired
	@Value("${myweb.mail.from}")
	private String mailFrom;
	@Autowired
	@Value("${myweb.mail.to}")
	private String mailTo;

	public EPUController() {
		// System.setProperty("javax.net.debug", "all");
	}

	@RequestMapping(method = RequestMethod.GET, value = "/Ping")
	public @ResponseBody
	void ping(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
//		sendEmail("ping", "pong");
	}

	private void sendError(String source, Exception exception, String message, String userIdentity, String idDomanda) {
		String body = buildErrorMessage(source, exception, message, userIdentity, idDomanda);
		sendEmail("Problema MyWeb", body);
	}
	
	private void sendEmail(String subject, String msg) {
		try {

			PasswordAuthentication pa = new PasswordAuthentication(mailUser, mailPassword);

			Properties properties = System.getProperties();
			properties.put("mail.transport.protocol", "smtp");
			properties.put("mail.smtp.auth", "true");
			properties.setProperty("mail.smtp.host", mailHost);
			properties.setProperty("mail.smtp.port", mailPort);

			Session session = Session.getInstance(properties, new Authenticator() {
				public PasswordAuthentication getPasswordAuthentication() {
					try {
						return new PasswordAuthentication(mailUser, mailPassword);
					} catch (Exception e) {}
					return null;
				}
			});

			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(mailFrom));
			String to[] = mailTo.split(",");
			for (String t: to) {
				message.addRecipient(Message.RecipientType.TO, new InternetAddress(t));
			}
			message.setSubject(subject);
			message.setText(msg);
			Transport.send(message);
			System.out.println("Email sent.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private String buildErrorMessage(String source, Exception exception, String message, String userIdentity, String idDomanda) {
		StringBuilder sb = new StringBuilder();
		sb.append("Errore in: \"" + source + "\"\n");
		DateFormat dateFormatter =	new SimpleDateFormat("MM/dd/yyyy HH:mm:ss", Locale.ITALY);
		String date = dateFormatter.format(new Date());
		sb.append("Orario: " + date + "\n");
		sb.append("userIdentity: " + ((userIdentity != null)?userIdentity:"-") + "\n");
		sb.append("idDomanda: " + ((idDomanda != null)?idDomanda:"-") + "\n\n");
		sb.append((message != null)?("\nMessaggio: " + message):"");
//		sb.append((exception != null)?("\nException: " + exception):"");
		if (exception != null) {
			sb.append("Exception:\n");
			sb.append(exception.getClass().getName() + ": " + exception.getMessage() + "\n");
			for (StackTraceElement ste: exception.getStackTrace()) {
				sb.append(ste + "\n");
			}
		}
		
		return sb.toString();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/Pingepu")
	public @ResponseBody
	String pingEpu(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws Exception {
		return epuHelper.ping();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/Pingp3")
	public @ResponseBody
	String pingP3(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws Exception {
		return adobeHelper.ping();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/CreaPratica")
	public @ResponseBody
	DomandaWSRegistraOutput creaPratica(HttpServletRequest request, HttpServletResponse response, HttpSession session, @RequestBody CreazionePratica creazionePratica) {
		try {
			log.info("Crea Pratica");

			DomandaWSRegistraInput wsInput = creazionePratica.getInput();

			DomandaWSRegistraOutput result = null;

			try {
				result = epuHelper.getPort().registra(wsInput);
			} catch (DomandaEpuFault_Exception e) {
				String msg = e.getFaultInfo().getUserMessage();
				log.error(msg);
//				sendError("Epu - registra", e.getClass().getName(), msg, creazionePratica.getInput().getUserIdentity(), null);
				response.sendError(HttpServletResponse.SC_BAD_REQUEST, msg);
				return null;
			} catch (Exception e) {
				e.printStackTrace();
				sendError("Epu - registra", e, null, creazionePratica.getInput().getUserIdentity(), null);
				response.sendError(HttpServletResponse.SC_BAD_REQUEST, "");
				return null;
			}

			PraticaData pd = new PraticaData();
			String token = generateToken(creazionePratica.getCpsData());
			pd.setToken(token);
			pd.setEmail(creazionePratica.getCpsData().getEmail());
			pd.setStatus(Status.EDITABILE);

			pd.setIdDomanda(result.getDomanda().getIdObj());
			pd.setUserIdentity(wsInput.getUserIdentity());
			pd.setData(System.currentTimeMillis());
			pd.setEpuTime(pd.getData());
			
			if (!storage.store(pd)) {
				log.warn("Gia' presente: " + pd.getIdDomanda());
				response.setStatus(HttpServletResponse.SC_FORBIDDEN);
				return null;
			}

			return result;

		} catch (Exception e) {
			e.printStackTrace();
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			return null;
		}

	}

	@RequestMapping(method = RequestMethod.GET, value = "/GetDatiPratica")
	public @ResponseBody
	DomandaWSCaricaOutput getDatiPratica(HttpServletRequest request, HttpServletResponse response, HttpSession session, @RequestParam long idDomanda, @RequestParam String idEnte, @RequestParam String userIdentity) {
		try {
			log.info("Get Pratica");

			DomandaWSCaricaOutput result = null;
			try {
				result = getDatiPratica(idDomanda, idEnte, userIdentity);
			} catch (DomandaEpuFault_Exception e) {
				String msg = e.getFaultInfo().getUserMessage();
				log.error(msg);
//				sendError("Epu - carica", e.getClass().getName(), msg, userIdentity, "" + idDomanda);
				response.sendError(HttpServletResponse.SC_BAD_REQUEST, msg);
			} catch (Exception e) {
				e.printStackTrace();
				sendError("Epu - carica", e, null, userIdentity, "" + idDomanda);
				response.sendError(HttpServletResponse.SC_BAD_REQUEST, "");
				return null;
			}

			return result;

		} catch (Exception e) {
			e.printStackTrace();
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			return null;
		}
	}
	
	private DomandaWSCaricaOutput getDatiPratica(long idDomanda, String idEnte, String userIdentity) throws Exception {
		DomandaWSCaricaInput wsInput = new DomandaWSCaricaInput();
		wsInput.setIdDomanda(idDomanda);
		wsInput.setIdEnte(idEnte);
		wsInput.setUserIdentity(userIdentity);

		DomandaWSCaricaOutput result = null;
		result = epuHelper.getPort().carica(wsInput);

		return result;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/EliminaPratica")
	public @ResponseBody
	DomandaWSEliminaOutput elimina(HttpServletRequest request, HttpServletResponse response, HttpSession session, @RequestBody DomandaInfo domandaInfo) {
		try {
			log.info("Elimina Pratica");

			PraticaData pd = storage.getPratica(domandaInfo.getIdDomanda());

			if (pd == null) {
				response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Domanda non trovata: " + domandaInfo.getIdDomanda());
				return null;
			}			
			
			if (doChecks()) {
				if (pd.getStatus().ordinal() != Status.EDITABILE.ordinal()) {
					response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Domanda non cancellabile: " + domandaInfo.getIdDomanda());
					return null;
				}
			}

			DomandaWSEliminaInput eliminaInput = new DomandaWSEliminaInput();
			eliminaInput.setIdDomanda(domandaInfo.getIdDomanda());
			eliminaInput.setIdEnte(ID_ENTE);
			eliminaInput.setUserIdentity(domandaInfo.getUserIdentity());
			eliminaInput.setVersione(domandaInfo.getVersion());

			DomandaWSEliminaOutput result = null;
			try {
				result = epuHelper.getPort().elimina(eliminaInput);
			} catch (DomandaEpuFault_Exception e) {
				String msg = e.getFaultInfo().getUserMessage();
				log.error(msg);
//				sendError("Epu - elimina", e.getClass().getName(), msg, domandaInfo.getUserIdentity(), "" + domandaInfo.getIdDomanda());
				response.sendError(HttpServletResponse.SC_BAD_REQUEST, msg);
			} catch (Exception e) {
				e.printStackTrace();
				sendError("Epu - elimina", e, null , domandaInfo.getUserIdentity(), "" + domandaInfo.getIdDomanda());
				response.sendError(HttpServletResponse.SC_BAD_REQUEST, "");
				return null;
			}

			storage.updateField(pd.getIdDomanda(), "deleted", true);

			return result;

		} catch (Exception e) {
			e.printStackTrace();
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			return null;
		}
	}

	@RequestMapping(method = RequestMethod.POST, value = "/AggiornaEmail")
	public @ResponseBody
	void aggiornaEmail(HttpServletRequest request, HttpServletResponse response, HttpSession session, @RequestParam Long idDomanda, @RequestParam String email) {
		try {
			log.info("Aggiorna Email");
			
			PraticaData pd = storage.getPratica(idDomanda);

				if (pd == null) {
					response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Domanda non trovata: " + idDomanda);
				}
			
				storage.updateField(idDomanda, "email", email);
				
		} catch (Exception e) {
			e.printStackTrace();
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(method = RequestMethod.GET, value = "/RicercaPratiche")
	public @ResponseBody
	DomandaWSRicercaOutput ricercaPratiche(HttpServletRequest request, HttpServletResponse response, HttpSession session, @RequestParam String idEnte, @RequestParam String userIdentity, @RequestParam(required = false) Boolean online) {
		try {
			log.info("Get Pratiche");

			DomandaWSRicercaInput ricercaInput = new DomandaWSRicercaInput();
			ricercaInput.setIdEnte(idEnte);
			ricercaInput.setUserIdentity(userIdentity);
			ricercaInput.setOnline(online!=null?online:true);

			DomandaWSRicercaOutput result = null;
			try {
				result = epuHelper.getPort().ricerca(ricercaInput);
			} catch (DomandaEpuFault_Exception e) {
				String msg = e.getFaultInfo().getUserMessage();
				log.error(msg);
//				sendError("Epu - ricerca", e.getClass().getName(), msg, userIdentity, null);
				response.sendError(HttpServletResponse.SC_BAD_REQUEST, msg);
			} catch (Exception e) {
				e.printStackTrace();
				sendError("Epu - carica", e, null, userIdentity, null);
				response.sendError(HttpServletResponse.SC_BAD_REQUEST, "");
				return null;
			}

			return result;

		} catch (Exception e) {
			e.printStackTrace();
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			return null;
		}
	}

	@RequestMapping(method = RequestMethod.GET, value = "/GetPraticheMyWeb")
	public @ResponseBody
	List<PraticaData> getPratiche(HttpServletRequest request, HttpServletResponse response, HttpSession session, @RequestParam(required = false) String userIdentity) {
		try {
			log.info("Get Pratiche MyWeb");

			List<PraticaData> result = storage.getPratiche(userIdentity, false);

			return result;

		} catch (Exception e) {
			e.printStackTrace();
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			return null;
		}
	}
	
//	@RequestMapping(method = RequestMethod.GET, value = "/GetPraticheMyWeb")
//	public @ResponseBody
//	List<PraticaData> getPratiche(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
//		try {
//			log.info("Get Pratiche MyWeb");
//
//			List<PraticaData> result = storage.getPratiche(null, false);
//
//			return result;
//
//		} catch (Exception e) {
//			e.printStackTrace();
//			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
//			return null;
//		}
//	}	

	@RequestMapping(method = RequestMethod.GET, value = "/GetPraticaMyWeb")
	public @ResponseBody
	PraticaData getPratica(HttpServletRequest request, HttpServletResponse response, HttpSession session, @RequestParam Long idDomanda) {
		try {
			log.info("Get Pratiche MyWeb");

			PraticaData result = storage.getPratica(idDomanda);

			return result;

		} catch (Exception e) {
			e.printStackTrace();
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			return null;
		}
	}

	@RequestMapping(method = RequestMethod.POST, value = "/AggiornaPratica")
	public @ResponseBody
	DomandaWSModificaOutput aggiornaPratica(HttpServletRequest request, HttpServletResponse response, HttpSession session, @RequestBody DomandaWSModificaInput wsInput) {
		try {
			log.info("Aggiorna");

			PraticaData pd = storage.getPratica(wsInput.getDomandaType().getIdDomanda());

			if (pd == null) {
				response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Domanda non trovata: " + wsInput.getDomandaType().getIdDomanda());
				return null;
			}			
			
			if (doChecks()) {
				if (pd.getStatus().ordinal() >= Status.CONSOLIDATA.ordinal()) {
					response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Domanda gia' inviata: " + wsInput.getDomandaType().getIdDomanda());
					return null;
				}
			}

			if (pd.getP3Hash() != null || pd.getP3Id() != null) {
				log.info("Removing p3 hash=" + pd.getP3Hash() + " id=" + pd.getP3Id());
			}
			pd.setP3Hash("");
			pd.setP3Id(null);
			storage.store(pd);
			storage.updateStatus(pd.getIdDomanda(), Status.EDITABILE);

			DomandaWSModificaOutput result = null;
			try {
				result = epuHelper.getPort().modifica(wsInput);
			} catch (DomandaEpuFault_Exception e) {
				String msg = e.getFaultInfo().getUserMessage();
				log.error(msg);
//				sendError("Epu - modifica", e.getClass().getName(), msg, wsInput.getUserIdentity(), "" + wsInput.getDomandaType().getIdDomanda());
				response.sendError(HttpServletResponse.SC_BAD_REQUEST, msg);
			} catch (Exception e) {
				e.printStackTrace();
				sendError("Epu - modifica", e, null , wsInput.getUserIdentity(), "" + wsInput.getDomandaType().getIdDomanda());
				response.sendError(HttpServletResponse.SC_BAD_REQUEST, "");
				return null;
			}

			storage.updateEPUTime(wsInput.getDomandaType().getIdDomanda());

			return result;

		} catch (Exception e) {
			e.printStackTrace();
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			return null;
		}
	}

	@RequestMapping(method = RequestMethod.POST, value = "/Pagamento")
	public void pagamento(HttpServletRequest request, HttpServletResponse response, HttpSession session, @RequestBody PagamentoInfo pagamentoInfo) {
		try {
			log.info("Pagamento");

			PraticaData pd = storage.getPratica(pagamentoInfo.getIdDomanda());

			if (pd == null) {
				response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Domanda non trovata: " + pagamentoInfo.getIdDomanda());
				return;
			}			
			
			if (doChecks()) {
				if (pd.getStatus().ordinal() >= Status.CONSOLIDATA.ordinal()) {
					response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Domanda gia' inviata: " + pagamentoInfo.getIdDomanda());
					return;
				}
			}

			storage.updatePagamento(pagamentoInfo);

		} catch (Exception e) {
			e.printStackTrace();
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(method = RequestMethod.POST, value = "/StampaJSON")
	public @ResponseBody
	String stampaJSON(HttpServletRequest request, HttpServletResponse response, HttpSession session, @RequestBody DomandaInfo domandaInfo) {
		try {
			log.info("Stampa JSON");

			DomandaWSStampaInput wsInput = new DomandaWSStampaInput();
			wsInput.setIdDomanda(domandaInfo.getIdDomanda());
			wsInput.setIdEnte(ID_ENTE);
			wsInput.setUserIdentity(domandaInfo.getUserIdentity());
			wsInput.setTipoStampa(TipoStampa.SCHEDA_DOMANDA);

			DomandaWSStampaOutput stampaResult1 = null;
			try {
				stampaResult1 = epuHelper.getPort().stampa(wsInput);
			} catch (DomandaEpuFault_Exception e) {
				String msg = e.getFaultInfo().getUserMessage();
				log.error(msg);
//				sendError("Epu - stampa (domanda)", e.getClass().getName(), msg, domandaInfo.getUserIdentity(), "" + domandaInfo.getIdDomanda());
				response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
				return null;
			} catch (Exception e) {
				e.printStackTrace();
				sendError("Epu - stampa (domanda)", e, null , domandaInfo.getUserIdentity(), "" + domandaInfo.getIdDomanda());
				response.sendError(HttpServletResponse.SC_BAD_REQUEST, "");
				return null;
			}

			wsInput.setTipoStampa(TipoStampa.SCHEDA_PUNTEGGIO);
			DomandaWSStampaOutput stampaResult2 = null;
			try {
				stampaResult2 = epuHelper.getPort().stampa(wsInput);
			} catch (DomandaEpuFault_Exception e) {
				String msg = e.getFaultInfo().getUserMessage();
				log.error(msg);
//				sendError("Epu - stampa (punteggio)", e.getClass().getName(), msg, domandaInfo.getUserIdentity(), "" + domandaInfo.getIdDomanda());
				response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
				return null;
			} catch (Exception e) {
				e.printStackTrace();
				sendError("Epu - stampa (punteggio)", e, null , domandaInfo.getUserIdentity(), "" + domandaInfo.getIdDomanda());
				response.sendError(HttpServletResponse.SC_BAD_REQUEST, "");
				return null;
			}

			String dom = new String(stampaResult1.getStampa(), "UTF-8").replaceAll("&#[^;]*;", "").replace("<?xml version=\"1.0\" encoding=\"UTF-8\"?>", "").trim();
			String punt = new String(stampaResult2.getStampa(), "UTF-8").replaceAll("&#[^;]*;", "").replace("<?xml version=\"1.0\" encoding=\"UTF-8\"?>", "").trim();

			String merged = "<domanda>" + dom + punt + "</domanda>";

			return xml2json(merged).replace("\"@", "\"");

		} catch (Exception e) {
			e.printStackTrace();
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			return null;
		}
	}

	private String xml2json(String xml) {
		String json = org.json.XML.toJSONObject(xml).toString();

		return json;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/SalvaAutocertificazione")
	public @ResponseBody
	ProtocollaResult salvaAutocertificazione(HttpServletRequest request, HttpServletResponse response, HttpSession session, @RequestBody PDFData pdfData) {
		ProtocollaResult result = new ProtocollaResult();

		try {
			log.info("Salva autocertificazione");

			PraticaData pd = storage.getPratica(pdfData.getDomandaInfo().getIdDomanda());

			if (pd == null) {
				result.setError("Domanda non trovata: " + pdfData.getDomandaInfo().getIdDomanda());
				return result;
			}

			storage.updateAutocertificazione(pdfData);
		} catch (Exception e) {
			e.printStackTrace();
			result.setException(e.getMessage());
		}

		return result;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/GetPDF")
	public @ResponseBody
	void getPDF(HttpServletRequest request, HttpServletResponse response, HttpSession session, @RequestBody PDFData pdfData) {
		ProtocollaResult result = new ProtocollaResult();
		try {
			log.info("Stampa PDF");

			PraticaData pd = storage.getPratica(pdfData.getDomandaInfo().getIdDomanda());

			if (pd == null) {
				result.setError("Domanda non trovata: " + pdfData.getDomandaInfo().getIdDomanda());
				returnGetPDFResult(result, null, response);
				return;
			}

			if (doChecks()) {
				if (pd.getStatus().ordinal() < Status.PAGATA.ordinal()) {
					result.setError("Domanda non pagata: " + pdfData.getDomandaInfo().getIdDomanda());
					returnGetPDFResult(result, null, response);
					return;
				}
			}

			DomandaWSStampaInput wsInput = new DomandaWSStampaInput();
			wsInput.setIdDomanda(pdfData.getDomandaInfo().getIdDomanda());
			wsInput.setIdEnte(ID_ENTE);
			wsInput.setUserIdentity(pdfData.getDomandaInfo().getUserIdentity());
			wsInput.setTipoStampa(TipoStampa.SCHEDA_DOMANDA);

			DomandaWSStampaOutput stampaResult1 = null;
			try {
				stampaResult1 = epuHelper.getPort().stampa(wsInput);
			} catch (DomandaEpuFault_Exception e) {
				String msg = e.getFaultInfo().getUserMessage();
				log.error(msg);
//				sendError("Epu - stampa (domanda)", e.getClass().getName(), msg, pdfData.getDomandaInfo().getUserIdentity(), "" + pdfData.getDomandaInfo().getIdDomanda());
				result.setError(msg);
				returnGetPDFResult(result, null, response);
				return;
			} catch (Exception e) {
				e.printStackTrace();
				sendError("Epu - stampa (domanda)", e, null , pdfData.getDomandaInfo().getUserIdentity(), "" + pdfData.getDomandaInfo().getIdDomanda());
				result.setException(e.getMessage());
				returnGetPDFResult(result, null, response);
			}

			wsInput.setTipoStampa(TipoStampa.SCHEDA_PUNTEGGIO);
			DomandaWSStampaOutput stampaResult2 = null;
			try {
				stampaResult2 = epuHelper.getPort().stampa(wsInput);
			} catch (DomandaEpuFault_Exception e) {
				String msg = e.getFaultInfo().getUserMessage();
				log.error(msg);
//				sendError("Epu - stampa (punteggio)", e.getClass().getName(), msg, pdfData.getDomandaInfo().getUserIdentity(), "" + pdfData.getDomandaInfo().getIdDomanda());
				result.setError(msg);
				returnGetPDFResult(result, null, response);
				return;
			} catch (Exception e) {
				e.printStackTrace();
				sendError("Epu - stampa (punteggio)", e, null , pdfData.getDomandaInfo().getUserIdentity(), "" + pdfData.getDomandaInfo().getIdDomanda());
				result.setException(e.getMessage());
				returnGetPDFResult(result, null, response);
			}

			String dom = new String(stampaResult1.getStampa()).replace("<?xml version=\"1.0\" encoding=\"UTF-8\"?>", "").trim();
			String punt = new String(stampaResult2.getStampa()).replace("<?xml version=\"1.0\" encoding=\"UTF-8\"?>", "").trim();

			String merged = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<stampaSchedaPunteggio>";
			merged += dom + punt;
			merged += "</stampaSchedaPunteggio>";

			String s = convertXML(merged, pdfData.getAutocertificazione(), pdfData.getDomandaInfo().getIdDomanda());

			// TODO token
			String tokenString = pd.getToken();
			tokenString = completeToken(tokenString, pdfData.getDomandaInfo().getIdDomanda());

			com.adobe.idp.services.formupload.XML doc = new com.adobe.idp.services.formupload.XML();
			
//			sendEmail(pdfData.getDomandaInfo().getUserIdentity() + " / " + pdfData.getDomandaInfo().getIdDomanda(), s);
			
			doc.setDocument("<![CDATA[" + s + "]]>");
			com.adobe.idp.services.formupload.XML token = new com.adobe.idp.services.formupload.XML();
			token.setDocument(tokenString);
			Holder<XML> out = new Holder<XML>();
			Holder<XML> res = new Holder<XML>();
			
			try {
			ModulisticaOnlineFormUpload port = adobeHelper.getUpload();
			port.invoke(DOMANDA_CONTRIBUTO_O_LOCAZIONE_ALLOGGIO, doc, token, out, res);
			} catch (Exception e) {
				e.printStackTrace();
				sendError("Adobe - upload", e, null , pdfData.getDomandaInfo().getUserIdentity(), "" + pdfData.getDomandaInfo().getIdDomanda());
				result.setException(e.getMessage());
				returnGetPDFResult(result, null, response);					
			}			

			String o = (out.value == null) ? null : out.value.getDocument();
			String r = (res.value == null) ? null : res.value.getDocument();

			Map ur = adobeHelper.parseUpload(r, o);

			if ("0".equals(ur.get("CodiceOutput"))) {
				UploadOutput uo = new UploadOutput();
				UploadAttachment ua = new UploadAttachment();
				ua.setHash((String) ur.get("hash"));
				ua.setId_attachment(Integer.parseInt((String) ur.get("id_attachment")));
				ua.setName((String) ur.get("name"));
				ua.setType((String) ur.get("type"));
				uo.setAttachment(ua);

				Holder<BLOB> form = new Holder<BLOB>();
				Holder<BLOB> pdf = new Holder<BLOB>();

				try {
				ModulisticaOnlineGetPDF port2 = adobeHelper.getPDFBinary();
				port2.invoke(ua.getId_attachment(), ua.getHash(), form, pdf);
				} catch (Exception e) {
					e.printStackTrace();
					sendError("Adobe - getpdf", e, null , pdfData.getDomandaInfo().getUserIdentity(), "" + pdfData.getDomandaInfo().getIdDomanda());
					result.setException(e.getMessage());
					returnGetPDFResult(result, null, response);					
				}
				
				ProtocolloInfo pi = new ProtocolloInfo();
				pi.setIdDomanda(pdfData.getDomandaInfo().getIdDomanda());
				pi.setHash(ua.getHash());
				pi.setId(ua.getId_attachment());

				storage.updateProtocollo(pi);

				Map ur2 = adobeHelper.parseGetPDFResult(new String(form.value.getBinaryData()));

				if ("0".equals(ur2.get("CodiceOutput"))) {
					returnGetPDFResult(null, pdf, response);
					return;
				} else {
					String error = (String) ur2.get("DescrizioneOutput");
					result.setError(error);
//					sendError("Adobe - getpdf", null, error, pdfData.getDomandaInfo().getUserIdentity(), "" + pdfData.getDomandaInfo().getIdDomanda());
					returnGetPDFResult(result, null, response);
					return;
				}

			} else {
				String error = (String) ur.get("DescrizioneOutput");
				result.setError(error);
//				sendError("Adobe - upload", null, error, pdfData.getDomandaInfo().getUserIdentity(), "" + pdfData.getDomandaInfo().getIdDomanda());
				returnGetPDFResult(result, null, response);
				return;
			}

		} catch (Exception e) {
			e.printStackTrace();
			result.setException(e.getMessage());
			try {
				returnGetPDFResult(result, null, response);
				return;
			} catch (Exception e2) {}
		}

	}

	private void sendAccettaFailedMail(PraticaData data, String info) {
		String s = "Errore di protocollazione durante accettazione domanda: " + info + "\n";
		s += "Stato domanda numero " + data.getIdDomanda() + ": " + data.getStatus();
		sendEmail("Accetta", s);
	}

	private void returnGetPDFResult(ProtocollaResult result, Holder<BLOB> pdf, HttpServletResponse response) throws Exception {
		// if (result.getError() != null || result.getException() != null) {
		// String msg = (result.getError() != null) ? ("Errore: " +
		// result.getError() + "\n"):"";
		// msg += (result.getException() != null) ? ("Eccezione: " +
		// result.getException() + "\n"):"";
		// sendEmail("GetPDF", msg);
		// }

		if (result == null) {
			response.setContentType("application/pdf");
			response.getOutputStream().write(pdf.value.getBinaryData());
		} else {
			ObjectMapper mapper = new ObjectMapper();
			String json = mapper.writeValueAsString(result);
			response.setContentType("application/json");
			response.getOutputStream().write(json.getBytes());
		}
	}

	@RequestMapping(method = RequestMethod.POST, value = "/Accetta")
	public @ResponseBody
	ProtocollaResult accetta(HttpServletRequest request, HttpServletResponse response, HttpSession session, @RequestBody DomandaInfo domandaInfo) {
		ProtocollaResult result = new ProtocollaResult();
		try {
			log.info("Accetta Domanda");

			PraticaData pd = storage.getPratica(domandaInfo.getIdDomanda());

			if (pd == null) {
				result.setError("Domanda non trovata: " + domandaInfo.getIdDomanda());
				return result;
			}

			if (doChecks()) {
				if (pd.getStatus().ordinal() < Status.PAGATA.ordinal()) {
					// if (!pd.getStatus().isInviabile()) {
					result.setError("Domanda non inviabile: " + domandaInfo.getIdDomanda() + " = " + pd.getStatus().toString());
					return result;
				}
			}

			if (pd.getStatus().ordinal() == Status.PAGATA.ordinal()) {
				try {
					DomandaWSConsolidaOutput consResult = consolida(domandaInfo);
					if (consResult.getEsito().equals(Esito.KO)) {
						System.out.println("Errore in consolidazione di " + domandaInfo.getIdDomanda());
						sendError("Epu - consolida", null, consResult.getEsito().toString(), domandaInfo.getUserIdentity(), "" + domandaInfo.getIdDomanda());
						result.setSegnalazioni(consResult.getSegnalazione());
						return result;
					}
					pd = storage.updateStatus(domandaInfo.getIdDomanda(), Status.CONSOLIDATA);
					result.setResult("Consolidata");
				} catch (DomandaEpuFault_Exception e) {
					String msg = e.getFaultInfo().getUserMessage();
					System.out.println(msg);
					sendError("Epu - consolida", null, msg, domandaInfo.getUserIdentity(), "" + domandaInfo.getIdDomanda());
					result.setError(msg);
					return result;
				} catch (Exception e) {
					System.out.println("Errore in consolidazione di " + domandaInfo);
					e.printStackTrace();
					result.setException(e.getMessage());
					sendError("Epu - consolida", e, null , domandaInfo.getUserIdentity(), "" + domandaInfo.getIdDomanda());					
					return result;
				}
			}

			if (pd.getStatus().equals(Status.CONSOLIDATA)) {
				try {

					ModulisticaOnlineApprovalPDF port = adobeHelper.getApproval();

					com.adobe.idp.services.approvalpdf.XML xml = port.invoke(0, pd.getP3Id(), pd.getP3Hash(), "ACCETTATO");

					String xmlS = (xml != null) ? xml.getDocument() : null;

					Map pr = adobeHelper.parseApproval(xmlS);
					if ("0".equals((String) pr.get("CodiceOutput"))) {
						storage.updateStatus(domandaInfo.getIdDomanda(), Status.ACCETTATA);
						result.setResult("Accettata");
					} else if (pr.containsKey("faultstring")) {
						String error = (String) pr.get("faultstring");
						sendError("Adobe - approval  (ACCETTATO)", null, error, domandaInfo.getUserIdentity(), "" + domandaInfo.getIdDomanda());
						result.setError(error);
					}

				} catch (Exception e) {
					log.error("Errore in protocollazione di " + domandaInfo);
					e.printStackTrace();
					sendError("Adobe - approval (ACCETTATO)", e, null , domandaInfo.getUserIdentity(), "" + domandaInfo.getIdDomanda());
					result.setException(e.getMessage());
					return result;
				}
			}

			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.setException(e.getMessage());
		}

		return result;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/Rifiuta")
	public @ResponseBody
	ProtocollaResult rifiuta(HttpServletRequest request, HttpServletResponse response, HttpSession session, @RequestBody DomandaInfo domandaInfo) {
		ProtocollaResult result = new ProtocollaResult();
		try {
			log.info("Rifiuta Domanda");

			PraticaData pd = storage.getPratica(domandaInfo.getIdDomanda());

			if (pd == null) {
				result.setError("Domanda non trovata: " + domandaInfo.getIdDomanda());
				return result;
			}

			if (doChecks()) {
				if (pd.getStatus().ordinal() < Status.PAGATA.ordinal()) {
					result.setError("Domanda non inviabile: " + domandaInfo.getIdDomanda() + " = " + pd.getStatus().toString());
					return result;
				}
			}

			if (pd.getStatus().ordinal() == Status.PAGATA.ordinal()) {
				pd = storage.updateStatus(domandaInfo.getIdDomanda(), Status.CONSOLIDATA);
				result.setResult("Consolidata");
			}

			if (pd.getStatus().equals(Status.CONSOLIDATA)) {
				try {

					ModulisticaOnlineApprovalPDF port = adobeHelper.getApproval();

					com.adobe.idp.services.approvalpdf.XML xml = port.invoke(0, pd.getP3Id(), pd.getP3Hash(), "RIFIUTATO");

					String xmlS = (xml != null) ? xml.getDocument() : null;

					Map pr = adobeHelper.parseApproval(xmlS);

					if ("0".equals((String) pr.get("CodiceOutput"))) {
						storage.updateStatus(domandaInfo.getIdDomanda(), Status.RIFIUTATA);
						result.setResult("Rifiutata");
					} else if (pr.containsKey("faultstring")) {
						String error = (String) pr.get("faultstring");
						result.setError(error);
						sendError("Adobe - approval  (RIFIUTATO)", null, error, domandaInfo.getUserIdentity(), "" + domandaInfo.getIdDomanda());
					}

				} catch (Exception e) {
					log.error("Errore in protocollazione di " + domandaInfo);
					e.printStackTrace();
					sendError("Adobe - approval (RIFIUTATO)", e, null , domandaInfo.getUserIdentity(), "" + domandaInfo.getIdDomanda());
					result.setException(e.getMessage());
					return result;
				}
			}

			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.setException(e.getMessage());
		}

		return result;
	}

	private DomandaWSConsolidaOutput consolida(DomandaInfo domandaInfo) throws Exception {

		DomandaWSConsolidaInput wsInput = new DomandaWSConsolidaInput();
		DomandaWSConsolidaOutput result = null;

		wsInput.setIdDomanda(domandaInfo.getIdDomanda());
		wsInput.setIdEnte(ID_ENTE);
		wsInput.setUserIdentity(domandaInfo.getUserIdentity());
		wsInput.setVersione(domandaInfo.getVersion());

		result = epuHelper.getPort().consolida(wsInput);

		return result;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/Elenchi")
	public @ResponseBody
	ElenchiOutput elenchi(HttpServletRequest request, HttpServletResponse response, HttpSession session, @RequestParam String idEnte, @RequestParam String userIdentity) {
		try {
			DomandaEPU port = epuHelper.getPort();

			DomandaWSAmbitiTerritorialiOutput at = null;
			DomandaWSComuniOutput c = null;
			DomandaWSEdizioniFinanziateOutput ef = null;

			DomandaWSAmbitiTerritorialiInput dat = new DomandaWSAmbitiTerritorialiInput();
			dat.setIdEnte(idEnte);
			dat.setUserIdentity(userIdentity);

			DomandaWSComuniInput dc = new DomandaWSComuniInput();
			dc.setIdEnte(idEnte);
			dc.setUserIdentity(userIdentity);

			DomandaWSEdizioniFinanziateInput efi = new DomandaWSEdizioniFinanziateInput();
			efi.setIdEnte(idEnte);
			efi.setUserIdentity(userIdentity);

			try {
				at = port.elencoAmbitiTerritoriali(dat);
				c = port.elencoComuni(dc);
				ef = port.elencoEdizioniFinanziate(efi);
			} catch (DomandaEpuFault_Exception e) {
				String msg = e.getFaultInfo().getUserMessage();
				log.error(msg);
				response.sendError(HttpServletResponse.SC_BAD_REQUEST, msg);
			}

			ElenchiOutput result = new ElenchiOutput();
			if (at != null) {
				for (AmbitoTerritorialeType att : at.getAmbitoTerritoriale()) {
					ElenchiItem ei = new ElenchiItem();
					ei.setDescrizione(att.getDescrizione());
					ei.setIdObj(att.getIdObj());
					result.getAmbitiTerritoriali().add(ei);
				}
			}
			if (c != null) {
				for (ComuneType ct : c.getComune()) {
					ElenchiItem ei = new ElenchiItem();
					ei.setDescrizione(ct.getDescrizione());
					ei.setIdObj(ct.getIdObj());
					result.getComuni().add(ei);
				}
			}

			if (ef != null) {
				GregorianCalendar gregorianCalendar = new GregorianCalendar();
				DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
				XMLGregorianCalendar calendar = datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);

				for (EdizioneFinanziataType eft : ef.getEdizioneFinanziata()) {
					XMLGregorianCalendar apertura = eft.getEdizione().getDataApertura();
					XMLGregorianCalendar chiusura = eft.getEdizione().getDataChiusura();
					if (calendar.compare(apertura) >= 0 && calendar.compare(chiusura) <= 0) {
						ElenchiItem ei = new ElenchiItem();
						ei.setDescrizione(eft.getEdizione().getStrumento().getDescrizione() + ", " + eft.getCategoria().toString().toLowerCase());
						ei.setIdObj("" + eft.getIdObj());
						result.getEdizioniFinanziate().add(ei);
					}
				}
			}

			return result;

		} catch (Exception e) {
			e.printStackTrace();
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			return null;
		}
	}

	private String convertXML(String epuXml, TypeAutocertificazione autocertificazione, Long idDomanda) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String date = sdf.format(new Date());

		String rep = epuXml.replaceAll(">\\s*<", "><");

		Pattern pattern = Pattern.compile("<dettaglio chiave=\"TOTALE\" calcolo=\"(.+?)\"/>");
		Matcher matcher = pattern.matcher(rep);
		Double dval = null;
		if (matcher.find()) {
			String val = matcher.group(1);
			String val2 = val.replaceAll("[\\.]", "").replaceAll("[,]", ".");
			dval = Double.parseDouble(val2) / 100;
			rep = rep.replaceAll("<dettaglio chiave=\"TOTALE\" calcolo=\"" + val + "\"/>", "<dettaglio chiave=\"TOTALE\" calcolo=\"" + dval + "\"/>");
		}

		TransformerFactory factory = TransformerFactory.newInstance();
		Source xslt = new StreamSource(Thread.currentThread().getContextClassLoader().getResourceAsStream("epu2p3.xslt"));
		Transformer transformer = factory.newTransformer(xslt);

		Source text = new StreamSource(new StringReader(rep));
		StringWriter sw = new StringWriter();
		StreamResult sr = new StreamResult(sw);

		transformer.transform(text, sr);

		JAXBContext jc = JAXBContext.newInstance("it.smartcampuslab.p3");
		Unmarshaller u = jc.createUnmarshaller();

		String s = sw.getBuffer().toString();
		StringBuilder sb = new StringBuilder();
		sb.append("<dichiarazioni xmlns=\"http://schemas.sygest.it/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://schemas.sygest.it/ \">");
		sb.append("<dichiarazione>");
		sb.append(s.replace("<?xml version=\"1.0\" encoding=\"UTF-8\"?>", "").trim());
		sb.append("<hash></hash>");
		sb.append("<modalita_invio>Tramite Portale</modalita_invio>");
		sb.append("<luogo>Rovereto</luogo>");
		sb.append("<data>" + date + "</data>");

		Marshaller m1 = jc.createMarshaller();
		m1.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		sw = new StringWriter();

		m1.marshal(new JAXBElement<TypeAutocertificazione>(new QName("uri", "local"), TypeAutocertificazione.class, autocertificazione), sw);

		String s1 = sw.getBuffer().toString();

		s1 = s1.replace("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>", "").trim();
		s1 = s1.replace("<ns2:local xmlns:ns2=\"uri\" xmlns=\"http://schemas.sygest.it/\">", "");
		s1 = s1.replace("</ns2:local>", "");

		sb.append("<autocertificazione>" + s1 + "</autocertificazione>");

		sb.append("</dichiarazione>");
		sb.append("</dichiarazioni>");

		String s2 = sb.toString();

		Dichiarazioni d = (Dichiarazioni) u.unmarshal(new StringReader(s2));
		if (dval != null) {
			d.getDichiarazione().getStampaSchedaPunteggio().getAssegnazioneAlloggio().getDatiIdentificativiDomanda().setPunteggioTotale(dval.toString().replace(".", ","));
		}

		d.getDichiarazione().getStampaSchedaPunteggio().getAssegnazioneAlloggio().setRecapito(autocertificazione.getRecapito());
		d.getDichiarazione().getAutocertificazione().setRecapito(null);
		
		PraticaData pd = storage.getPratica(idDomanda);

		if (pd.getEsenzione() != null && pd.getEsenzione().booleanValue()) {
			TypeEsenzionemarcabollo emb = new TypeEsenzionemarcabollo();
			emb.setEsenzione(pd.getEsenzione());
			emb.setMotivo(pd.getMotivo());
			d.getDichiarazione().setEsenzioneMarcaBollo(emb);
		}
		TypeMarcabollo mb = new TypeMarcabollo();
		mb.setGiornoEmissione(pd.getGiornoEmissione());
		mb.setOraEmissione(pd.getOraEmissione());
		mb.setIdentificativo(pd.getIdentificativo());
		d.getDichiarazione().setMarcabollo(mb);

		fix(d, idDomanda);

		Marshaller m2 = jc.createMarshaller();

		sw = new StringWriter();
		m2.marshal(d, sw);
		String s3 = sw.getBuffer().toString();

		s3 = s3.replace("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>", "").trim();
		s3 = s3.replace("<dichiarazioni xmlns=\"http://schemas.sygest.it/\">", "<dichiarazioni>");
		return s3;
	}

	private void fix(Dichiarazioni d, Long idDomanda) {
		PraticaData pd = storage.getPratica(idDomanda);

		if (doFix()) {
			d.getDichiarazione().getStampaSchedaPunteggio().getAssegnazioneAlloggio().getNucleoFamiliare().setCodiceFiscale(pd.getUserIdentity());
		}
		d.getDichiarazione().getStampaSchedaPunteggio().getAssegnazioneAlloggio().getNucleoFamiliare().setEmail(pd.getEmail());
	}

	private String generateToken(CPSData cps) throws Exception {
		String s = "-----BEGIN CERTIFICATE-----\n" + cps.getCertBase64() + "\n-----END CERTIFICATE-----";

		ByteArrayInputStream is = new ByteArrayInputStream(s.getBytes(Charset.forName("UTF-8")));
		BufferedInputStream bis = new BufferedInputStream(is);

		CertificateFactory cf = CertificateFactory.getInstance("X.509");

		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");

		X509Certificate cert = null;
		while (bis.available() > 0) {
			cert = (X509Certificate) cf.generateCertificate(bis);

		}

		String from = sdf.format(cert.getNotBefore());
		String to = sdf.format(cert.getNotAfter());

		StringBuilder sb = new StringBuilder();
		sb.append("<istanzeonline>");
		sb.append("	<serviceprovider value=\"MYWEB\">");
		sb.append("<dataautenticazione>%s</dataautenticazione>");
		sb.append("<oraautenticazione>%s</oraautenticazione>");
		sb.append("<nome>" + cps.getNome() + "</nome>");
		sb.append("<cognome>" + cps.getCognome() + "</cognome>");
		sb.append("<codicefiscale>" + cps.getCodiceFiscale() + "</codicefiscale>");
		sb.append("<numerocertificato>" + cert.getSerialNumber() + "</numerocertificato>");
		sb.append("<hashcertificato>" + cert.hashCode() + "</hashcertificato>");
		sb.append("<certificationauthority>" + cert.getIssuerX500Principal() + "</certificationauthority>");
		sb.append("<datarilasciocertificato>" + from + "</datarilasciocertificato>");
		sb.append("<datascadenzacertificato>" + to + "</datascadenzacertificato>");
		sb.append("<moduloId>DOMANDA CONTRIBUTO O LOCAZIONE ALLOGGIO</moduloId>");
		sb.append("<hashmodulo></hashmodulo>");
		sb.append("</serviceprovider>");
		sb.append("</istanzeonline>");

		return sb.toString();
	}

	private String completeToken(String token, long idDomanda) {
		PraticaData pd = storage.getPratica(idDomanda);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String authDate = sdf.format(new Date());
		sdf = new SimpleDateFormat("HH:mm");
		String authTime = sdf.format(new Date());

		String result = token.format(token, authDate, authTime);
		return result;
	}

	private boolean doChecks() {
		return TEST.equals(server) || PROD.equals(server);
	}

	private boolean doFix() {
		return TEST.equals(server) || DEV.equals(server);
	}

}
