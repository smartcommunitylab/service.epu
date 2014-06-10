/**
 * Invoke.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.adobe.idp.services;

public class Invoke  implements java.io.Serializable {
    private java.lang.Integer in_int_idAttachment;

    private java.lang.String in_string_hash;

    public Invoke() {
    }

    public Invoke(
           java.lang.Integer in_int_idAttachment,
           java.lang.String in_string_hash) {
           this.in_int_idAttachment = in_int_idAttachment;
           this.in_string_hash = in_string_hash;
    }


    /**
     * Gets the in_int_idAttachment value for this Invoke.
     * 
     * @return in_int_idAttachment
     */
    public java.lang.Integer getIn_int_idAttachment() {
        return in_int_idAttachment;
    }


    /**
     * Sets the in_int_idAttachment value for this Invoke.
     * 
     * @param in_int_idAttachment
     */
    public void setIn_int_idAttachment(java.lang.Integer in_int_idAttachment) {
        this.in_int_idAttachment = in_int_idAttachment;
    }


    /**
     * Gets the in_string_hash value for this Invoke.
     * 
     * @return in_string_hash
     */
    public java.lang.String getIn_string_hash() {
        return in_string_hash;
    }


    /**
     * Sets the in_string_hash value for this Invoke.
     * 
     * @param in_string_hash
     */
    public void setIn_string_hash(java.lang.String in_string_hash) {
        this.in_string_hash = in_string_hash;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Invoke)) return false;
        Invoke other = (Invoke) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.in_int_idAttachment==null && other.getIn_int_idAttachment()==null) || 
             (this.in_int_idAttachment!=null &&
              this.in_int_idAttachment.equals(other.getIn_int_idAttachment()))) &&
            ((this.in_string_hash==null && other.getIn_string_hash()==null) || 
             (this.in_string_hash!=null &&
              this.in_string_hash.equals(other.getIn_string_hash())));
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
        if (getIn_int_idAttachment() != null) {
            _hashCode += getIn_int_idAttachment().hashCode();
        }
        if (getIn_string_hash() != null) {
            _hashCode += getIn_string_hash().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Invoke.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://adobe.com/idp/services", ">invoke"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("in_int_idAttachment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://adobe.com/idp/services", "in_int_idAttachment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("in_string_hash");
        elemField.setXmlName(new javax.xml.namespace.QName("http://adobe.com/idp/services", "in_string_hash"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
