
package com.adobe.idp.services.approvalpdf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="out_document_form" type="{http://adobe.com/idp/services}XML"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "outDocumentForm"
})
@XmlRootElement(name = "invokeResponse")
public class InvokeResponse {

    @XmlElement(name = "out_document_form", required = true, nillable = true)
    protected XML outDocumentForm;

    /**
     * Gets the value of the outDocumentForm property.
     * 
     * @return
     *     possible object is
     *     {@link XML }
     *     
     */
    public XML getOutDocumentForm() {
        return outDocumentForm;
    }

    /**
     * Sets the value of the outDocumentForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XML }
     *     
     */
    public void setOutDocumentForm(XML value) {
        this.outDocumentForm = value;
    }

}
