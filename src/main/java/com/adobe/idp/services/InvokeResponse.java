/**
 * InvokeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.adobe.idp.services;

public class InvokeResponse  implements java.io.Serializable {
    private com.adobe.idp.services.BLOB out_document_form;

    private com.adobe.idp.services.BLOB out_document_pdf;

    public InvokeResponse() {
    }

    public InvokeResponse(
           com.adobe.idp.services.BLOB out_document_form,
           com.adobe.idp.services.BLOB out_document_pdf) {
           this.out_document_form = out_document_form;
           this.out_document_pdf = out_document_pdf;
    }


    /**
     * Gets the out_document_form value for this InvokeResponse.
     * 
     * @return out_document_form
     */
    public com.adobe.idp.services.BLOB getOut_document_form() {
        return out_document_form;
    }


    /**
     * Sets the out_document_form value for this InvokeResponse.
     * 
     * @param out_document_form
     */
    public void setOut_document_form(com.adobe.idp.services.BLOB out_document_form) {
        this.out_document_form = out_document_form;
    }


    /**
     * Gets the out_document_pdf value for this InvokeResponse.
     * 
     * @return out_document_pdf
     */
    public com.adobe.idp.services.BLOB getOut_document_pdf() {
        return out_document_pdf;
    }


    /**
     * Sets the out_document_pdf value for this InvokeResponse.
     * 
     * @param out_document_pdf
     */
    public void setOut_document_pdf(com.adobe.idp.services.BLOB out_document_pdf) {
        this.out_document_pdf = out_document_pdf;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvokeResponse)) return false;
        InvokeResponse other = (InvokeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.out_document_form==null && other.getOut_document_form()==null) || 
             (this.out_document_form!=null &&
              this.out_document_form.equals(other.getOut_document_form()))) &&
            ((this.out_document_pdf==null && other.getOut_document_pdf()==null) || 
             (this.out_document_pdf!=null &&
              this.out_document_pdf.equals(other.getOut_document_pdf())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getOut_document_form() != null) {
            _hashCode += getOut_document_form().hashCode();
        }
        if (getOut_document_pdf() != null) {
            _hashCode += getOut_document_pdf().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvokeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://adobe.com/idp/services", ">invokeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("out_document_form");
        elemField.setXmlName(new javax.xml.namespace.QName("http://adobe.com/idp/services", "out_document_form"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://adobe.com/idp/services", "BLOB"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("out_document_pdf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://adobe.com/idp/services", "out_document_pdf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://adobe.com/idp/services", "BLOB"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
