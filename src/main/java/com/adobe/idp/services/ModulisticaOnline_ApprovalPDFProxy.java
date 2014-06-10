package com.adobe.idp.services;

public class ModulisticaOnline_ApprovalPDFProxy implements com.adobe.idp.services.ModulisticaOnline_ApprovalPDF {
  private String _endpoint = null;
  private com.adobe.idp.services.ModulisticaOnline_ApprovalPDF modulisticaOnline_ApprovalPDF = null;
  
  public ModulisticaOnline_ApprovalPDFProxy() {
    _initModulisticaOnline_ApprovalPDFProxy();
  }
  
  public ModulisticaOnline_ApprovalPDFProxy(String endpoint) {
    _endpoint = endpoint;
    _initModulisticaOnline_ApprovalPDFProxy();
  }
  
  private void _initModulisticaOnline_ApprovalPDFProxy() {
    try {
      modulisticaOnline_ApprovalPDF = (new com.adobe.idp.services.ModulisticaOnline_ApprovalPDFServiceLocator()).getApprovalPDF();
      if (modulisticaOnline_ApprovalPDF != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)modulisticaOnline_ApprovalPDF)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)modulisticaOnline_ApprovalPDF)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (modulisticaOnline_ApprovalPDF != null)
      ((javax.xml.rpc.Stub)modulisticaOnline_ApprovalPDF)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.adobe.idp.services.ModulisticaOnline_ApprovalPDF getModulisticaOnline_ApprovalPDF() {
    if (modulisticaOnline_ApprovalPDF == null)
      _initModulisticaOnline_ApprovalPDFProxy();
    return modulisticaOnline_ApprovalPDF;
  }
  
  public com.adobe.idp.services.XML invoke(java.lang.Integer in_bool_writexml, java.lang.Integer in_int_idAttach, java.lang.String in_string_hash, java.lang.String in_string_state) throws java.rmi.RemoteException{
    if (modulisticaOnline_ApprovalPDF == null)
      _initModulisticaOnline_ApprovalPDFProxy();
    return modulisticaOnline_ApprovalPDF.invoke(in_bool_writexml, in_int_idAttach, in_string_hash, in_string_state);
  }
  
  
}