package it.smartcampuslab.epu.controller;


import it.infotn.epu.DomandaEPU;
import it.infotn.epu.DomandaEPUService;
import it.infotn.epu.DomandaEpuFault_Exception;
import it.infotn.epu.DomandaWSCaricaInput;
import it.infotn.epu.DomandaWSCaricaOutput;
import it.infotn.epu.DomandaWSConsolidaInput;
import it.infotn.epu.DomandaWSConsolidaOutput;
import it.infotn.epu.DomandaWSEliminaInput;
import it.infotn.epu.DomandaWSEliminaOutput;
import it.infotn.epu.DomandaWSModificaInput;
import it.infotn.epu.DomandaWSModificaOutput;
import it.infotn.epu.DomandaWSRegistraInput;
import it.infotn.epu.DomandaWSRegistraOutput;
import it.infotn.epu.DomandaWSRicercaInput;
import it.infotn.epu.DomandaWSRicercaOutput;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig.Feature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


	@Controller
	public class UnitnEPUController {
		
		 @Autowired
		 @Value("${endpoint}")
		 private String endpoint;
		
		 @Autowired
		 @Value("${user}")
		 private String username;
		
		 @Autowired
		 @Value("${pwd}")
		 private String password;
		 
		 DomandaEPU port;
		
		
		@RequestMapping(method = RequestMethod.POST, value = "/registra")
		public @ResponseBody
		DomandaWSRegistraOutput registra(HttpServletRequest request, HttpServletResponse response, HttpSession session, @RequestBody DomandaWSRegistraInput registraInput) {
			try {
				ObjectMapper mapper = new ObjectMapper();
				mapper.configure(Feature.INDENT_OUTPUT, true);
				String s1 = mapper.writeValueAsString(registraInput);
				System.out.println(s1);
				
				
				DomandaWSRegistraOutput result = null;
				try {
					result = getPort().registra(registraInput);
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

		@RequestMapping(method = RequestMethod.POST, value = "/modifica")
		public @ResponseBody
		DomandaWSModificaOutput modifica(HttpServletRequest request, HttpServletResponse response, HttpSession session, @RequestBody DomandaWSModificaInput modificaInput) {
			try {
				ObjectMapper mapper = new ObjectMapper();
				mapper.configure(Feature.INDENT_OUTPUT, true);
				String s1 = mapper.writeValueAsString(modificaInput);
				System.out.println(s1);
				
				DomandaWSModificaOutput result = null;
				try {
					result = getPort().modifica(modificaInput);
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
		
		@RequestMapping(method = RequestMethod.POST, value = "/carica")
		public @ResponseBody
		DomandaWSCaricaOutput registra(HttpServletRequest request, HttpServletResponse response, HttpSession session, @RequestBody DomandaWSCaricaInput caricaInput) {
			try {
				ObjectMapper mapper = new ObjectMapper();
				mapper.configure(Feature.INDENT_OUTPUT, true);
				String s1 = mapper.writeValueAsString(caricaInput);
				System.out.println(s1);
				
				DomandaWSCaricaOutput result = null;
				try {
					result = getPort().carica(caricaInput);
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
		
		@RequestMapping(method = RequestMethod.POST, value = "/ricerca")
		public @ResponseBody
		DomandaWSRicercaOutput ricerca(HttpServletRequest request, HttpServletResponse response, HttpSession session, @RequestBody DomandaWSRicercaInput ricercaInput) {
			try {
				ObjectMapper mapper = new ObjectMapper();
				mapper.configure(Feature.INDENT_OUTPUT, true);
				String s1 = mapper.writeValueAsString(ricercaInput);
				System.out.println(s1);
				
				
				DomandaWSRicercaOutput result = null;
				try {
					result = getPort().ricerca(ricercaInput);
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
		
		@RequestMapping(method = RequestMethod.POST, value = "/consolida")
		public @ResponseBody
		DomandaWSConsolidaOutput consolida(HttpServletRequest request, HttpServletResponse response, HttpSession session, @RequestBody DomandaWSConsolidaInput consolidaInput) {
			try {
				ObjectMapper mapper = new ObjectMapper();
				mapper.configure(Feature.INDENT_OUTPUT, true);
				String s1 = mapper.writeValueAsString(consolidaInput);
				System.out.println(s1);
				
				return new DomandaWSConsolidaOutput();
				
			} catch (Exception e) {
				e.printStackTrace();
				response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
				return null;
			}
		}			
		
		@RequestMapping(method = RequestMethod.POST, value = "/elimina")
		public @ResponseBody
		DomandaWSEliminaOutput elimina(HttpServletRequest request, HttpServletResponse response, HttpSession session, @RequestBody DomandaWSEliminaInput eliminaInput) {
			try {
				ObjectMapper mapper = new ObjectMapper();
				mapper.configure(Feature.INDENT_OUTPUT, true);
				String s1 = mapper.writeValueAsString(eliminaInput);
				System.out.println(s1);
				
				DomandaWSEliminaOutput result = null;
				try {
					result = getPort().elimina(eliminaInput);
				} catch (DomandaEpuFault_Exception e) {
					String msg = e.getFaultInfo().getUserMessage();
					System.out.println(msg);
					response.sendError(HttpServletResponse.SC_BAD_REQUEST, msg);
				}							
				
				return new DomandaWSEliminaOutput();
				
			} catch (Exception e) {
				e.printStackTrace();
				response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
				return null;
			}
		}			
		
//		@RequestMapping(method = RequestMethod.POST, value = "/elenchi")
//		public @ResponseBody
//		ElenchiOutput elenchi(HttpServletRequest request, HttpServletResponse response, HttpSession session, @RequestBody ElenchiInput elenchiInput) {
//			try {
//				ObjectMapper mapper = new ObjectMapper();
//				mapper.configure(Feature.INDENT_OUTPUT, true);
//				String s1 = mapper.writeValueAsString(elenchiInput);
//				System.out.println(s1);
//				
//				DomandaEPU port = getPort();
//				
//				DomandaWSAmbitiTerritorialiOutput at = null;
//				DomandaWSComuniOutput c = null;
//				try {
//					at = port.elencoAmbitiTerritoriali(elenchiInput.toAmbitiTerritoriali());
//					c = port.elencoComuni(elenchiInput.toComuni());
//				} catch (DomandaEpuFault_Exception e) {
//					String msg = e.getFaultInfo().getUserMessage();
//					System.out.println(msg);
//					response.sendError(HttpServletResponse.SC_BAD_REQUEST, msg);
//				}					
//				
//				ElenchiOutput result = new ElenchiOutput();
//				result.setAmbitiTerritoriali(at);
//				result.setComuni(c);
//				
//				return result;
//				
//			} catch (Exception e) {
//				e.printStackTrace();
//				response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
//				return null;
//			}
//		}				
		
		private DomandaEPU getPort() {
			DomandaEPUService des = new DomandaEPUService();
			DomandaEPU port = des.getDomandaEPUPort();

			Map<String, Object> req_ctx = ((BindingProvider) port).getRequestContext();
			req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpoint);

			Map<String, List<String>> headers = new HashMap<String, List<String>>();
			headers.put("username", Collections.singletonList(username));
			headers.put("password", Collections.singletonList(password));
			req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
			
			return port;
		}
		
}
