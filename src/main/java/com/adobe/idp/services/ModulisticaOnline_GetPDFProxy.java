package com.adobe.idp.services;

public class ModulisticaOnline_GetPDFProxy implements com.adobe.idp.services.ModulisticaOnline_GetPDF {
  private String _endpoint = null;
  private com.adobe.idp.services.ModulisticaOnline_GetPDF modulisticaOnline_GetPDF = null;
  
  public ModulisticaOnline_GetPDFProxy() {
    _initModulisticaOnline_GetPDFProxy();
  }
  
  public ModulisticaOnline_GetPDFProxy(String endpoint) {
    _endpoint = endpoint;
    _initModulisticaOnline_GetPDFProxy();
  }
  
  private void _initModulisticaOnline_GetPDFProxy() {
    try {
      modulisticaOnline_GetPDF = (new com.adobe.idp.services.ModulisticaOnline_GetPDFServiceLocator()).getGetPDF();
      if (modulisticaOnline_GetPDF != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)modulisticaOnline_GetPDF)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)modulisticaOnline_GetPDF)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (modulisticaOnline_GetPDF != null)
      ((javax.xml.rpc.Stub)modulisticaOnline_GetPDF)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.adobe.idp.services.ModulisticaOnline_GetPDF getModulisticaOnline_GetPDF() {
    if (modulisticaOnline_GetPDF == null)
      _initModulisticaOnline_GetPDFProxy();
    return modulisticaOnline_GetPDF;
  }
  
  public void invoke(java.lang.Integer in_int_idAttachment, java.lang.String in_string_hash, com.adobe.idp.services.holders.BLOBHolder out_document_form, com.adobe.idp.services.holders.BLOBHolder out_document_pdf) throws java.rmi.RemoteException{
    if (modulisticaOnline_GetPDF == null)
      _initModulisticaOnline_GetPDFProxy();
    modulisticaOnline_GetPDF.invoke(in_int_idAttachment, in_string_hash, out_document_form, out_document_pdf);
  }
  
  
}