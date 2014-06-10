package com.adobe.idp.services;

public class ModulisticaOnline_FormUploadProxy implements com.adobe.idp.services.ModulisticaOnline_FormUpload {
  private String _endpoint = null;
  private com.adobe.idp.services.ModulisticaOnline_FormUpload modulisticaOnline_FormUpload = null;
  
  public ModulisticaOnline_FormUploadProxy() {
    _initModulisticaOnline_FormUploadProxy();
  }
  
  public ModulisticaOnline_FormUploadProxy(String endpoint) {
    _endpoint = endpoint;
    _initModulisticaOnline_FormUploadProxy();
  }
  
  private void _initModulisticaOnline_FormUploadProxy() {
    try {
      modulisticaOnline_FormUpload = (new com.adobe.idp.services.ModulisticaOnline_FormUploadServiceLocator()).getFormUpload();
      if (modulisticaOnline_FormUpload != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)modulisticaOnline_FormUpload)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)modulisticaOnline_FormUpload)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (modulisticaOnline_FormUpload != null)
      ((javax.xml.rpc.Stub)modulisticaOnline_FormUpload)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.adobe.idp.services.ModulisticaOnline_FormUpload getModulisticaOnline_FormUpload() {
    if (modulisticaOnline_FormUpload == null)
      _initModulisticaOnline_FormUploadProxy();
    return modulisticaOnline_FormUpload;
  }
  
  public void invoke(java.lang.String in_string_formid, com.adobe.idp.services.XML xml_doc, com.adobe.idp.services.XML xml_token, com.adobe.idp.services.holders.XMLHolder out_q, com.adobe.idp.services.holders.XMLHolder out_xml_result) throws java.rmi.RemoteException{
    if (modulisticaOnline_FormUpload == null)
      _initModulisticaOnline_FormUploadProxy();
    modulisticaOnline_FormUpload.invoke(in_string_formid, xml_doc, xml_token, out_q, out_xml_result);
  }
  
  
}