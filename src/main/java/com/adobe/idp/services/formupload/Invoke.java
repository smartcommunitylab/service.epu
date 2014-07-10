
package com.adobe.idp.services.formupload;

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
 *         &lt;element name="in_string_formid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xml_doc" type="{http://adobe.com/idp/services}XML" minOccurs="0"/>
 *         &lt;element name="xml_token" type="{http://adobe.com/idp/services}XML" minOccurs="0"/>
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
    "inStringFormid",
    "xmlDoc",
    "xmlToken"
})
@XmlRootElement(name = "invoke")
public class Invoke {

    @XmlElement(name = "in_string_formid")
    protected String inStringFormid;
    @XmlElement(name = "xml_doc")
    protected XML xmlDoc;
    @XmlElement(name = "xml_token")
    protected XML xmlToken;

    /**
     * Gets the value of the inStringFormid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInStringFormid() {
        return inStringFormid;
    }

    /**
     * Sets the value of the inStringFormid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInStringFormid(String value) {
        this.inStringFormid = value;
    }

    /**
     * Gets the value of the xmlDoc property.
     * 
     * @return
     *     possible object is
     *     {@link XML }
     *     
     */
    public XML getXmlDoc() {
        return xmlDoc;
    }

    /**
     * Sets the value of the xmlDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link XML }
     *     
     */
    public void setXmlDoc(XML value) {
        this.xmlDoc = value;
    }

    /**
     * Gets the value of the xmlToken property.
     * 
     * @return
     *     possible object is
     *     {@link XML }
     *     
     */
    public XML getXmlToken() {
        return xmlToken;
    }

    /**
     * Sets the value of the xmlToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link XML }
     *     
     */
    public void setXmlToken(XML value) {
        this.xmlToken = value;
    }

}
