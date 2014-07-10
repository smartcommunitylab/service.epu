
package com.adobe.idp.services.approvalpdf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FormInstanceBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormInstanceBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="XFAData" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="actionList" type="{http://adobe.com/idp/services}MyArrayOf_xsd_anyType"/>
 *         &lt;element name="hardenedTemplatePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="selectedAction" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="templatePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormInstanceBase", propOrder = {
    "xfaData",
    "actionList",
    "hardenedTemplatePath",
    "selectedAction",
    "templatePath"
})
@XmlSeeAlso({
    FormDataTypeInstance.class
})
public class FormInstanceBase {

    @XmlElement(name = "XFAData", required = true, nillable = true)
    protected byte[] xfaData;
    @XmlElement(required = true, nillable = true)
    protected MyArrayOfXsdAnyType actionList;
    @XmlElement(required = true, nillable = true)
    protected String hardenedTemplatePath;
    @XmlElement(required = true, nillable = true)
    protected String selectedAction;
    @XmlElement(required = true, nillable = true)
    protected String templatePath;

    /**
     * Gets the value of the xfaData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getXFAData() {
        return xfaData;
    }

    /**
     * Sets the value of the xfaData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setXFAData(byte[] value) {
        this.xfaData = ((byte[]) value);
    }

    /**
     * Gets the value of the actionList property.
     * 
     * @return
     *     possible object is
     *     {@link MyArrayOfXsdAnyType }
     *     
     */
    public MyArrayOfXsdAnyType getActionList() {
        return actionList;
    }

    /**
     * Sets the value of the actionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyArrayOfXsdAnyType }
     *     
     */
    public void setActionList(MyArrayOfXsdAnyType value) {
        this.actionList = value;
    }

    /**
     * Gets the value of the hardenedTemplatePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardenedTemplatePath() {
        return hardenedTemplatePath;
    }

    /**
     * Sets the value of the hardenedTemplatePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardenedTemplatePath(String value) {
        this.hardenedTemplatePath = value;
    }

    /**
     * Gets the value of the selectedAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectedAction() {
        return selectedAction;
    }

    /**
     * Sets the value of the selectedAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectedAction(String value) {
        this.selectedAction = value;
    }

    /**
     * Gets the value of the templatePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplatePath() {
        return templatePath;
    }

    /**
     * Sets the value of the templatePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplatePath(String value) {
        this.templatePath = value;
    }

}
