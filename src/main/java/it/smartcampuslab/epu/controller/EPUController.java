package it.smartcampuslab.epu.controller;

import it.infotn.epu.AmbitoTerritorialeType;
import it.infotn.epu.ComuneType;
import it.infotn.epu.DomandaEPU;
import it.infotn.epu.DomandaEPUService;
import it.infotn.epu.DomandaEpuFault_Exception;
import it.infotn.epu.DomandaWSAmbitiTerritorialiInput;
import it.infotn.epu.DomandaWSAmbitiTerritorialiOutput;
import it.infotn.epu.DomandaWSCaricaInput;
import it.infotn.epu.DomandaWSCaricaOutput;
import it.infotn.epu.DomandaWSComuniInput;
import it.infotn.epu.DomandaWSComuniOutput;
import it.infotn.epu.DomandaWSConsolidaInput;
import it.infotn.epu.DomandaWSConsolidaOutput;
import it.infotn.epu.DomandaWSModificaInput;
import it.infotn.epu.DomandaWSModificaOutput;
import it.infotn.epu.DomandaWSRegistraInput;
import it.infotn.epu.DomandaWSRegistraOutput;
import it.infotn.epu.DomandaWSStampaInput;
import it.infotn.epu.DomandaWSStampaOutput;
import it.smartcampuslab.epu.model.ElenchiItem;
import it.smartcampuslab.epu.model.ElenchiOutput;
import it.smartcampuslab.epu.storage.DomandaInfo;
import it.smartcampuslab.epu.storage.PagamentoInfo;
import it.smartcampuslab.epu.storage.PraticaData;
import it.smartcampuslab.epu.storage.PraticaStorage;
import it.smartcampuslab.epu.storage.ProtocolloInfo;
import it.smartcampuslab.epu.storage.Status;
import it.smartcampuslab.p3.Dichiarazioni;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import net.sf.json.xml.XMLSerializer;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EPUController {

	@Autowired
	@Value("${endpoint}")
	private String endpoint;

	@Autowired
	@Value("${u_n}")
	private String username;

	@Autowired
	@Value("${p_v}")
	private String password;

	@Autowired
	private PraticaStorage storage;

	private Logger log = Logger.getLogger(this.getClass());

	public EPUController() {
	}

	@RequestMapping(method = RequestMethod.GET, value = "/Ping")
	public @ResponseBody
	void ping(HttpServletRequest request, HttpServletResponse response, HttpSession session) {

	}

	@RequestMapping(method = RequestMethod.POST, value = "/CreaPratica")
	public @ResponseBody
	DomandaWSRegistraOutput creaPratica(HttpServletRequest request, HttpServletResponse response, HttpSession session, @RequestBody DomandaWSRegistraInput wsInput) {
		try {
			log.info("Crea Pratica");

			DomandaWSRegistraOutput result = null;
			PraticaData pd = new PraticaData();

			try {
				result = getPort().registra(wsInput);
			} catch (DomandaEpuFault_Exception e) {
				String msg = e.getFaultInfo().getUserMessage();
				log.error(msg);
				response.sendError(HttpServletResponse.SC_BAD_REQUEST, msg);
				return null;
			} catch (Exception e) {
				e.printStackTrace();
				response.sendError(HttpServletResponse.SC_BAD_REQUEST, "");
				return null;
			}

			pd.setId(result.getDomanda().getIdObj());
			pd.setUserIdentity(wsInput.getUserIdentity());

			if (!storage.store(pd)) {
				log.warn("Already present: " + pd.getId());
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
			DomandaWSCaricaInput wsInput = new DomandaWSCaricaInput();
			wsInput.setIdDomanda(idDomanda);
			wsInput.setIdEnte(idEnte);
			wsInput.setUserIdentity(userIdentity);

			DomandaWSCaricaOutput result = null;
			try {
				result = getPort().carica(wsInput);
			} catch (DomandaEpuFault_Exception e) {
				String msg = e.getFaultInfo().getUserMessage();
				log.error(msg);
				response.sendError(HttpServletResponse.SC_BAD_REQUEST, msg);
			} catch (Exception e) {
				e.printStackTrace();
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

	@RequestMapping(method = RequestMethod.POST, value = "/AggiornaPratica")
	public @ResponseBody
	DomandaWSModificaOutput aggiornaPratica(HttpServletRequest request, HttpServletResponse response, HttpSession session, @RequestBody DomandaWSModificaInput wsInput) {
		try {
			log.info("Aggiorna");
			DomandaWSModificaOutput result = null;
			try {
				result = getPort().modifica(wsInput);
			} catch (DomandaEpuFault_Exception e) {
				String msg = e.getFaultInfo().getUserMessage();
				System.out.println(msg);
				response.sendError(HttpServletResponse.SC_BAD_REQUEST, msg);
			}

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

			if (!storage.updatePagamento(pagamentoInfo)) {
				System.out.println("Not present for payment: " + pagamentoInfo);
				return;
			}

		} catch (Exception e) {
			e.printStackTrace();
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(method = RequestMethod.POST, value = "/Stampa")
	public @ResponseBody
	String stampa(HttpServletRequest request, HttpServletResponse response, HttpSession session, @RequestBody DomandaWSStampaInput wsInput) {
		try {
			log.info("Stampa");
			DomandaWSStampaOutput result = null;
			try {
				result = getPort().stampa(wsInput);
			} catch (DomandaEpuFault_Exception e) {
				String msg = e.getFaultInfo().getUserMessage();
				System.out.println(msg);
				response.sendError(HttpServletResponse.SC_BAD_REQUEST, msg);
			}

			String s = complete(new String(result.getStampa()), true);

			return s;

		} catch (Exception e) {
			e.printStackTrace();
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			return null;
		}
	}

	@RequestMapping(method = RequestMethod.POST, value = "/StampaJSON")
	public @ResponseBody
	String stampaJSON(HttpServletRequest request, HttpServletResponse response, HttpSession session, @RequestBody DomandaWSStampaInput wsInput) {
		try {
			log.info("Stampa JSON");
			DomandaWSStampaOutput result = null;
			try {
				result = getPort().stampa(wsInput);
			} catch (DomandaEpuFault_Exception e) {
				String msg = e.getFaultInfo().getUserMessage();
				System.out.println(msg);
				response.sendError(HttpServletResponse.SC_BAD_REQUEST, msg);
			}

			String s = complete(new String(result.getStampa()), false);

			return xml2json(s).replace("\"@", "\"");

		} catch (Exception e) {
			e.printStackTrace();
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			return null;
		}
	}

	private String xml2json(String xml) {
		XMLSerializer ser = new XMLSerializer();
		String json = ser.read(xml).toString();

		return json;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/StampaPDF")
	public @ResponseBody
	String stampaPDF(HttpServletRequest request, HttpServletResponse response, HttpSession session, @RequestBody DomandaInfo domandaInfo) {
		try {
			log.info("Stampa PDF");

			// consolida

			storage.updateStatus(domandaInfo.getId(), Status.CONSOLIDATA);

			// call P3

			ProtocolloInfo pi = new ProtocolloInfo();
			pi.setId(domandaInfo.getId());
			pi.setProtocollo("#" + domandaInfo.getId());

			if (!storage.updateProtocollo(pi)) {
				System.out.println("Not present for protocol: " + domandaInfo);
				response.sendError(HttpServletResponse.SC_BAD_REQUEST, "");
			}

			return "http://p3.it/" + domandaInfo.getId() + ".pdf";
		} catch (Exception e) {
			e.printStackTrace();
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		}

		return null;
	}

	// was Consolida
	@RequestMapping(method = RequestMethod.POST, value = "/Protocolla")
	public void protocolla(HttpServletRequest request, HttpServletResponse response, HttpSession session, @RequestBody DomandaInfo domandaInfo) {
		try {
			log.info("Protocolla");

			DomandaWSConsolidaInput wsInput = new DomandaWSConsolidaInput();
			wsInput.setIdDomanda(domandaInfo.getId());
			wsInput.setIdEnte("24");
			wsInput.setUserIdentity("");

			DomandaWSConsolidaOutput result = null;
			// try {
			// result = getPort().consolida(wsInput);
			storage.updateStatus(domandaInfo.getId(), Status.PROTOCOLLATA);
			// } catch (DomandaEpuFault_Exception e) {
			// String msg = e.getFaultInfo().getUserMessage();
			// System.out.println(msg);
			// response.sendError(HttpServletResponse.SC_BAD_REQUEST, msg);
			// }

		} catch (Exception e) {
			e.printStackTrace();
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(method = RequestMethod.GET, value = "/Elenchi")
	public @ResponseBody
	ElenchiOutput elenchi(HttpServletRequest request, HttpServletResponse response, HttpSession session, @RequestParam String idEnte, @RequestParam String userIdentity) {
		try {
			DomandaEPU port = getPort();

			DomandaWSAmbitiTerritorialiOutput at = null;
			DomandaWSComuniOutput c = null;

			DomandaWSAmbitiTerritorialiInput dat = new DomandaWSAmbitiTerritorialiInput();
			dat.setIdEnte(idEnte);
			dat.setUserIdentity(userIdentity);

			DomandaWSComuniInput dc = new DomandaWSComuniInput();
			dc.setIdEnte(idEnte);
			dc.setUserIdentity(userIdentity);

			try {
				at = port.elencoAmbitiTerritoriali(dat);
				c = port.elencoComuni(dc);
			} catch (DomandaEpuFault_Exception e) {
				String msg = e.getFaultInfo().getUserMessage();
				System.out.println(msg);
				response.sendError(HttpServletResponse.SC_BAD_REQUEST, msg);
			}

			ElenchiOutput result = new ElenchiOutput();
			for (AmbitoTerritorialeType att : at.getAmbitoTerritoriale()) {
				ElenchiItem ei = new ElenchiItem();
				ei.setDescrizione(att.getDescrizione());
				ei.setIdObj(att.getIdObj());
				result.getAmbitiTerritoriali().add(ei);
			}
			for (ComuneType ct : c.getComune()) {
				ElenchiItem ei = new ElenchiItem();
				ei.setDescrizione(ct.getDescrizione());
				ei.setIdObj(ct.getIdObj());
				result.getComuni().add(ei);
			}

			return result;

		} catch (Exception e) {
			e.printStackTrace();
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			return null;
		}
	}

	private DomandaEPU getPort() throws EPUException {
		try {
			DomandaEPUService des = new DomandaEPUService();
			DomandaEPU port = des.getDomandaEPUPort();

			Map<String, Object> req_ctx = ((BindingProvider) port).getRequestContext();
			req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpoint);

			Map<String, List<String>> headers = new HashMap<String, List<String>>();
			headers.put("username", Collections.singletonList(username));
			headers.put("password", Collections.singletonList(password));
			req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);

			return port;
		} catch (Exception e) {
			throw new EPUException(e);
		}
	}

	public String complete(String stampa, boolean wrap) throws DatatypeConfigurationException, JAXBException {
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
		XMLGregorianCalendar calendar = datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);

		JAXBContext jc = JAXBContext.newInstance("it.smartcampuslab.p3");
		Unmarshaller u = jc.createUnmarshaller();

		StringBuffer sb = new StringBuffer();
		if (wrap) {
		sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		sb.append("<dichiarazioni xmlns=\"http://schemas.sygest.it/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://schemas.sygest.it/ ../../main/resources/p3.xsd \">");
		sb.append("<dichiarazione>");
		sb.append("<hash></hash>");
		sb.append("<modalita_invio>Tramite portale</modalita_invio>");
		sb.append("<versione></versione>");
		sb.append("<luogo></luogo>");
		sb.append("<data>" + calendar.toXMLFormat() + "</data>");
		sb.append("<stampaSchedaPunteggio>");
		}
		sb.append(stampa.replace("<?xml version=\"1.0\" encoding=\"UTF-8\"?>", ""));
		if (wrap) {
		sb.append("</stampaSchedaPunteggio>");
		sb.append("</dichiarazione>");
		sb.append("</dichiarazioni>");

		}

		String s = sb.toString();
		if (wrap) {
			Dichiarazioni d = (Dichiarazioni) u.unmarshal(new StringReader(s));
		}
		
		return s;
	}

}
