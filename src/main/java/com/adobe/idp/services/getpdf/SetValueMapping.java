
package com.adobe.idp.services.getpdf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetValueMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetValueMapping">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locationExpr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valueExpr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetValueMapping", propOrder = {
    "locationExpr",
    "valueExpr"
})
public class SetValueMapping {

    @XmlElement(required = true, nillable = true)
    protected String locationExpr;
    @XmlElement(required = true, nillable = true)
    protected String valueExpr;

    /**
     * Gets the value of the locationExpr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationExpr() {
        return locationExpr;
    }

    /**
     * Sets the value of the locationExpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationExpr(String value) {
        this.locationExpr = value;
    }

    /**
     * Gets the value of the valueExpr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueExpr() {
        return valueExpr;
    }

    /**
     * Sets the value of the valueExpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueExpr(String value) {
        this.valueExpr = value;
    }

}
