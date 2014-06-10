/**
 * ModulisticaOnline_GetPDFServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.adobe.idp.services;

public class ModulisticaOnline_GetPDFServiceLocator extends org.apache.axis.client.Service implements com.adobe.idp.services.ModulisticaOnline_GetPDFService {

    public ModulisticaOnline_GetPDFServiceLocator() {
    }


    public ModulisticaOnline_GetPDFServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ModulisticaOnline_GetPDFServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GetPDF
    private java.lang.String GetPDF_address = "http://172.20.1.141:8080/soap/services/ModulisticaOnline/GetPDF";

    public java.lang.String getGetPDFAddress() {
        return GetPDF_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GetPDFWSDDServiceName = "GetPDF";

    public java.lang.String getGetPDFWSDDServiceName() {
        return GetPDFWSDDServiceName;
    }

    public void setGetPDFWSDDServiceName(java.lang.String name) {
        GetPDFWSDDServiceName = name;
    }

    public com.adobe.idp.services.ModulisticaOnline_GetPDF getGetPDF() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GetPDF_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGetPDF(endpoint);
    }

    public com.adobe.idp.services.ModulisticaOnline_GetPDF getGetPDF(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.adobe.idp.services.GetPDFSoapBindingStub _stub = new com.adobe.idp.services.GetPDFSoapBindingStub(portAddress, this);
            _stub.setPortName(getGetPDFWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGetPDFEndpointAddress(java.lang.String address) {
        GetPDF_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.adobe.idp.services.ModulisticaOnline_GetPDF.class.isAssignableFrom(serviceEndpointInterface)) {
                com.adobe.idp.services.GetPDFSoapBindingStub _stub = new com.adobe.idp.services.GetPDFSoapBindingStub(new java.net.URL(GetPDF_address), this);
                _stub.setPortName(getGetPDFWSDDServiceName());
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
        if ("GetPDF".equals(inputPortName)) {
            return getGetPDF();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://adobe.com/idp/services", "ModulisticaOnline_GetPDFService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://adobe.com/idp/services", "GetPDF"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GetPDF".equals(portName)) {
            setGetPDFEndpointAddress(address);
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
