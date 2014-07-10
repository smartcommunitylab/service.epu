
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
 *         &lt;element name="in_int_idAttachment" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="in_string_hash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "inIntIdAttachment",
    "inStringHash"
})
@XmlRootElement(name = "invoke")
public class Invoke {

    @XmlElement(name = "in_int_idAttachment")
    protected Integer inIntIdAttachment;
    @XmlElement(name = "in_string_hash")
    protected String inStringHash;

    /**
     * Gets the value of the inIntIdAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInIntIdAttachment() {
        return inIntIdAttachment;
    }

    /**
     * Sets the value of the inIntIdAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInIntIdAttachment(Integer value) {
        this.inIntIdAttachment = value;
    }

    /**
     * Gets the value of the inStringHash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInStringHash() {
        return inStringHash;
    }

    /**
     * Sets the value of the inStringHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInStringHash(String value) {
        this.inStringHash = value;
    }

}
