//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.07 at 11:38:55 AM CEST 
//


package it.smartcampuslab.p3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for type_periodo_residenza complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type_periodo_residenza">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aire" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="comune" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="al" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type_periodo_residenza", propOrder = {
    "aire",
    "comune",
    "dal",
    "al"
})
public class TypePeriodoResidenza {

    protected boolean aire;
    @XmlElement(required = true)
    protected String comune;
    @XmlElement(required = true)
    protected String dal;
    @XmlElement(required = true)
    protected String al;

    /**
     * Gets the value of the aire property.
     * 
     */
    public boolean isAire() {
        return aire;
    }

    /**
     * Sets the value of the aire property.
     * 
     */
    public void setAire(boolean value) {
        this.aire = value;
    }

    /**
     * Gets the value of the comune property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComune() {
        return comune;
    }

    /**
     * Sets the value of the comune property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComune(String value) {
        this.comune = value;
    }

    /**
     * Gets the value of the dal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDal() {
        return dal;
    }

    /**
     * Sets the value of the dal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDal(String value) {
        this.dal = value;
    }

    /**
     * Gets the value of the al property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAl() {
        return al;
    }

    /**
     * Sets the value of the al property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAl(String value) {
        this.al = value;
    }

}