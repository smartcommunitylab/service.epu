
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
 *         &lt;element name="out_q" type="{http://adobe.com/idp/services}XML"/>
 *         &lt;element name="out_xml_result" type="{http://adobe.com/idp/services}XML"/>
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
    "outQ",
    "outXmlResult"
})
@XmlRootElement(name = "invokeResponse")
public class InvokeResponse {

    @XmlElement(name = "out_q", required = true, nillable = true)
    protected XML outQ;
    @XmlElement(name = "out_xml_result", required = true, nillable = true)
    protected XML outXmlResult;

    /**
     * Gets the value of the outQ property.
     * 
     * @return
     *     possible object is
     *     {@link XML }
     *     
     */
    public XML getOutQ() {
        return outQ;
    }

    /**
     * Sets the value of the outQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link XML }
     *     
     */
    public void setOutQ(XML value) {
        this.outQ = value;
    }

    /**
     * Gets the value of the outXmlResult property.
     * 
     * @return
     *     possible object is
     *     {@link XML }
     *     
     */
    public XML getOutXmlResult() {
        return outXmlResult;
    }

    /**
     * Sets the value of the outXmlResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link XML }
     *     
     */
    public void setOutXmlResult(XML value) {
        this.outXmlResult = value;
    }

}
