
package com.adobe.idp.services.getpdf;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "ModulisticaOnline_GetPDFService", targetNamespace = "http://adobe.com/idp/services", wsdlLocation = "https://ws-t.servizi.infotn.it/soap/services/ModulisticaOnline/GetPDF?wsdl")
public class ModulisticaOnlineGetPDFService
    extends Service
{

//    private final static URL MODULISTICAONLINEGETPDFSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.adobe.idp.services.getpdf.ModulisticaOnlineGetPDFService.class.getName());
//
//    static {
//        URL url = null;
//        try {
//            URL baseUrl;
//            baseUrl = com.adobe.idp.services.getpdf.ModulisticaOnlineGetPDFService.class.getResource(".");
//            url = new URL(baseUrl, "http://172.20.1.141:8080/soap/services/ModulisticaOnline/GetPDF");
//        } catch (MalformedURLException e) {
//            logger.warning("Failed to create URL for the wsdl Location: 'http://172.20.1.141:8080/soap/services/ModulisticaOnline/GetPDF', retrying as a local file");
//            logger.warning(e.getMessage());
//        }
//        MODULISTICAONLINEGETPDFSERVICE_WSDL_LOCATION = url;
//    }

    public ModulisticaOnlineGetPDFService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ModulisticaOnlineGetPDFService() throws MalformedURLException {
//        super(MODULISTICAONLINEGETPDFSERVICE_WSDL_LOCATION, new QName("http://adobe.com/idp/services", "ModulisticaOnline_GetPDFService"));
//    	super(new URL("https://ws-t.servizi.infotn.it/soap/services/ModulisticaOnline/GetPDF?wsdl"), new QName("http://adobe.com/idp/services", "ModulisticaOnline_GetPDFService"));
    	super(Thread.currentThread().getContextClassLoader().getResource("/GetPDF.wsdl"), new QName("http://adobe.com/idp/services", "ModulisticaOnline_GetPDFService"));
    	
    }

    /**
     * 
     * @return
     *     returns ModulisticaOnlineGetPDF
     */
    @WebEndpoint(name = "GetPDF")
    public ModulisticaOnlineGetPDF getGetPDF() {
        return super.getPort(new QName("http://adobe.com/idp/services", "GetPDF"), ModulisticaOnlineGetPDF.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ModulisticaOnlineGetPDF
     */
    @WebEndpoint(name = "GetPDF")
    public ModulisticaOnlineGetPDF getGetPDF(WebServiceFeature... features) {
        return super.getPort(new QName("http://adobe.com/idp/services", "GetPDF"), ModulisticaOnlineGetPDF.class, features);
    }

}
