
package com.adobe.idp.services.getpdf;

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
 *         &lt;element name="out_document_form" type="{http://adobe.com/idp/services}BLOB"/>
 *         &lt;element name="out_document_pdf" type="{http://adobe.com/idp/services}BLOB"/>
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
    "outDocumentForm",
    "outDocumentPdf"
})
@XmlRootElement(name = "invokeResponse")
public class InvokeResponse {

    @XmlElement(name = "out_document_form", required = true, nillable = true)
    protected BLOB outDocumentForm;
    @XmlElement(name = "out_document_pdf", required = true, nillable = true)
    protected BLOB outDocumentPdf;

    /**
     * Gets the value of the outDocumentForm property.
     * 
     * @return
     *     possible object is
     *     {@link BLOB }
     *     
     */
    public BLOB getOutDocumentForm() {
        return outDocumentForm;
    }

    /**
     * Sets the value of the outDocumentForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BLOB }
     *     
     */
    public void setOutDocumentForm(BLOB value) {
        this.outDocumentForm = value;
    }

    /**
     * Gets the value of the outDocumentPdf property.
     * 
     * @return
     *     possible object is
     *     {@link BLOB }
     *     
     */
    public BLOB getOutDocumentPdf() {
        return outDocumentPdf;
    }

    /**
     * Sets the value of the outDocumentPdf property.
     * 
     * @param value
     *     allowed object is
     *     {@link BLOB }
     *     
     */
    public void setOutDocumentPdf(BLOB value) {
        this.outDocumentPdf = value;
    }

}
