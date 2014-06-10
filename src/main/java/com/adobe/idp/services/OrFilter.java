/**
 * OrFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.adobe.idp.services;

public class OrFilter  extends com.adobe.idp.services.PurgeFilter  implements java.io.Serializable {
    private com.adobe.idp.services.PurgeFilter leftFilter;

    private com.adobe.idp.services.PurgeFilter rightFilter;

    public OrFilter() {
    }

    public OrFilter(
           com.adobe.idp.services.PurgeFilter leftFilter,
           com.adobe.idp.services.PurgeFilter rightFilter) {
        this.leftFilter = leftFilter;
        this.rightFilter = rightFilter;
    }


    /**
     * Gets the leftFilter value for this OrFilter.
     * 
     * @return leftFilter
     */
    public com.adobe.idp.services.PurgeFilter getLeftFilter() {
        return leftFilter;
    }


    /**
     * Sets the leftFilter value for this OrFilter.
     * 
     * @param leftFilter
     */
    public void setLeftFilter(com.adobe.idp.services.PurgeFilter leftFilter) {
        this.leftFilter = leftFilter;
    }


    /**
     * Gets the rightFilter value for this OrFilter.
     * 
     * @return rightFilter
     */
    public com.adobe.idp.services.PurgeFilter getRightFilter() {
        return rightFilter;
    }


    /**
     * Sets the rightFilter value for this OrFilter.
     * 
     * @param rightFilter
     */
    public void setRightFilter(com.adobe.idp.services.PurgeFilter rightFilter) {
        this.rightFilter = rightFilter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrFilter)) return false;
        OrFilter other = (OrFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.leftFilter==null && other.getLeftFilter()==null) || 
             (this.leftFilter!=null &&
              this.leftFilter.equals(other.getLeftFilter()))) &&
            ((this.rightFilter==null && other.getRightFilter()==null) || 
             (this.rightFilter!=null &&
              this.rightFilter.equals(other.getRightFilter())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getLeftFilter() != null) {
            _hashCode += getLeftFilter().hashCode();
        }
        if (getRightFilter() != null) {
            _hashCode += getRightFilter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://adobe.com/idp/services", "OrFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leftFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://adobe.com/idp/services", "leftFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://adobe.com/idp/services", "PurgeFilter"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rightFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://adobe.com/idp/services", "rightFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://adobe.com/idp/services", "PurgeFilter"));
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
