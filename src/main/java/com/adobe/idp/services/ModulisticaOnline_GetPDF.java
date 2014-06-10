/**
 * ModulisticaOnline_GetPDF.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.adobe.idp.services;

public interface ModulisticaOnline_GetPDF extends java.rmi.Remote {
    public void invoke(java.lang.Integer in_int_idAttachment, java.lang.String in_string_hash, com.adobe.idp.services.holders.BLOBHolder out_document_form, com.adobe.idp.services.holders.BLOBHolder out_document_pdf) throws java.rmi.RemoteException;
}
