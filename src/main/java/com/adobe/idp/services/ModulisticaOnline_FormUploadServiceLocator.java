/**
 * ModulisticaOnline_FormUploadServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.adobe.idp.services;

public class ModulisticaOnline_FormUploadServiceLocator extends org.apache.axis.client.Service implements com.adobe.idp.services.ModulisticaOnline_FormUploadService {

    public ModulisticaOnline_FormUploadServiceLocator() {
    }


    public ModulisticaOnline_FormUploadServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ModulisticaOnline_FormUploadServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FormUpload
    private java.lang.String FormUpload_address = "http://172.20.1.141:8080/soap/services/ModulisticaOnline/FormUpload";

    public java.lang.String getFormUploadAddress() {
        return FormUpload_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FormUploadWSDDServiceName = "FormUpload";

    public java.lang.String getFormUploadWSDDServiceName() {
        return FormUploadWSDDServiceName;
    }

    public void setFormUploadWSDDServiceName(java.lang.String name) {
        FormUploadWSDDServiceName = name;
    }

    public com.adobe.idp.services.ModulisticaOnline_FormUpload getFormUpload() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FormUpload_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFormUpload(endpoint);
    }

    public com.adobe.idp.services.ModulisticaOnline_FormUpload getFormUpload(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.adobe.idp.services.FormUploadSoapBindingStub _stub = new com.adobe.idp.services.FormUploadSoapBindingStub(portAddress, this);
            _stub.setPortName(getFormUploadWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFormUploadEndpointAddress(java.lang.String address) {
        FormUpload_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.adobe.idp.services.ModulisticaOnline_FormUpload.class.isAssignableFrom(serviceEndpointInterface)) {
                com.adobe.idp.services.FormUploadSoapBindingStub _stub = new com.adobe.idp.services.FormUploadSoapBindingStub(new java.net.URL(FormUpload_address), this);
                _stub.setPortName(getFormUploadWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("FormUpload".equals(inputPortName)) {
            return getFormUpload();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://adobe.com/idp/services", "ModulisticaOnline_FormUploadService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://adobe.com/idp/services", "FormUpload"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FormUpload".equals(portName)) {
            setFormUploadEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
