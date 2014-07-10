
package com.adobe.idp.services.approvalpdf;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ModulisticaOnline_ApprovalPDF", targetNamespace = "http://adobe.com/idp/services")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ModulisticaOnlineApprovalPDF {


    /**
     * 
     * @param inIntIdAttach
     * @param inStringHash
     * @param inStringState
     * @param inBoolWritexml
     * @return
     *     returns com.adobe.idp.services.approvalpdf.XML
     */
    @WebMethod(action = "invoke..11.0.0")
    @WebResult(name = "out_document_form", targetNamespace = "http://adobe.com/idp/services")
    @RequestWrapper(localName = "invoke", targetNamespace = "http://adobe.com/idp/services", className = "com.adobe.idp.services.approvalpdf.Invoke")
    @ResponseWrapper(localName = "invokeResponse", targetNamespace = "http://adobe.com/idp/services", className = "com.adobe.idp.services.approvalpdf.InvokeResponse")
    public XML invoke(
        @WebParam(name = "in_bool_writexml", targetNamespace = "http://adobe.com/idp/services")
        Integer inBoolWritexml,
        @WebParam(name = "in_int_idAttach", targetNamespace = "http://adobe.com/idp/services")
        Integer inIntIdAttach,
        @WebParam(name = "in_string_hash", targetNamespace = "http://adobe.com/idp/services")
        String inStringHash,
        @WebParam(name = "in_string_state", targetNamespace = "http://adobe.com/idp/services")
        String inStringState);

}
