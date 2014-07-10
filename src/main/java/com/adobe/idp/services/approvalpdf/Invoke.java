
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
 *         &lt;element name="in_bool_writexml" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="in_int_idAttach" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="in_string_hash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="in_string_state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "inBoolWritexml",
    "inIntIdAttach",
    "inStringHash",
    "inStringState"
})
@XmlRootElement(name = "invoke")
public class Invoke {

    @XmlElement(name = "in_bool_writexml")
    protected Integer inBoolWritexml;
    @XmlElement(name = "in_int_idAttach")
    protected Integer inIntIdAttach;
    @XmlElement(name = "in_string_hash")
    protected String inStringHash;
    @XmlElement(name = "in_string_state")
    protected String inStringState;

    /**
     * Gets the value of the inBoolWritexml property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInBoolWritexml() {
        return inBoolWritexml;
    }

    /**
     * Sets the value of the inBoolWritexml property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInBoolWritexml(Integer value) {
        this.inBoolWritexml = value;
    }

    /**
     * Gets the value of the inIntIdAttach property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInIntIdAttach() {
        return inIntIdAttach;
    }

    /**
     * Sets the value of the inIntIdAttach property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInIntIdAttach(Integer value) {
        this.inIntIdAttach = value;
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

    /**
     * Gets the value of the inStringState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInStringState() {
        return inStringState;
    }

    /**
     * Sets the value of the inStringState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInStringState(String value) {
        this.inStringState = value;
    }

}
