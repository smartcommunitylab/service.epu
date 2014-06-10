/**
 * ModulisticaOnline_ApprovalPDFServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.adobe.idp.services;

public class ModulisticaOnline_ApprovalPDFServiceLocator extends org.apache.axis.client.Service implements com.adobe.idp.services.ModulisticaOnline_ApprovalPDFService {

    public ModulisticaOnline_ApprovalPDFServiceLocator() {
    }


    public ModulisticaOnline_ApprovalPDFServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ModulisticaOnline_ApprovalPDFServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ApprovalPDF
    private java.lang.String ApprovalPDF_address = "http://172.20.1.141:8080/soap/services/ModulisticaOnline/ApprovalPDF";

    public java.lang.String getApprovalPDFAddress() {
        return ApprovalPDF_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ApprovalPDFWSDDServiceName = "ApprovalPDF";

    public java.lang.String getApprovalPDFWSDDServiceName() {
        return ApprovalPDFWSDDServiceName;
    }

    public void setApprovalPDFWSDDServiceName(java.lang.String name) {
        ApprovalPDFWSDDServiceName = name;
    }

    public com.adobe.idp.services.ModulisticaOnline_ApprovalPDF getApprovalPDF() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ApprovalPDF_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getApprovalPDF(endpoint);
    }

    public com.adobe.idp.services.ModulisticaOnline_ApprovalPDF getApprovalPDF(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.adobe.idp.services.ApprovalPDFSoapBindingStub _stub = new com.adobe.idp.services.ApprovalPDFSoapBindingStub(portAddress, this);
            _stub.setPortName(getApprovalPDFWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setApprovalPDFEndpointAddress(java.lang.String address) {
        ApprovalPDF_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.adobe.idp.services.ModulisticaOnline_ApprovalPDF.class.isAssignableFrom(serviceEndpointInterface)) {
                com.adobe.idp.services.ApprovalPDFSoapBindingStub _stub = new com.adobe.idp.services.ApprovalPDFSoapBindingStub(new java.net.URL(ApprovalPDF_address), this);
                _stub.setPortName(getApprovalPDFWSDDServiceName());
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
        if ("ApprovalPDF".equals(inputPortName)) {
            return getApprovalPDF();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://adobe.com/idp/services", "ModulisticaOnline_ApprovalPDFService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://adobe.com/idp/services", "ApprovalPDF"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ApprovalPDF".equals(portName)) {
            setApprovalPDFEndpointAddress(address);
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
