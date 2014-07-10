
package com.adobe.idp.services.getpdf;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttachmentRef;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BLOB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BLOB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="binaryData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="attachmentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remoteURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MTOM" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="swaRef" type="{http://ws-i.org/profiles/basic/1.1/xsd}swaRef" minOccurs="0"/>
 *         &lt;element name="attributes" type="{http://adobe.com/idp/services}MyMapOf_xsd_string_To_xsd_anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BLOB", propOrder = {
    "contentType",
    "binaryData",
    "attachmentID",
    "remoteURL",
    "mtom",
    "swaRef",
    "attributes"
})
public class BLOB {

    protected String contentType;
    protected byte[] binaryData;
    protected String attachmentID;
    protected String remoteURL;
    @XmlElement(name = "MTOM")
    @XmlMimeType("*/*")
    protected DataHandler mtom;
    @XmlElement(type = String.class)
    @XmlAttachmentRef
    protected DataHandler swaRef;
    protected MyMapOfXsdStringToXsdAnyType attributes;

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the binaryData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBinaryData() {
        return binaryData;
    }

    /**
     * Sets the value of the binaryData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBinaryData(byte[] value) {
        this.binaryData = ((byte[]) value);
    }

    /**
     * Gets the value of the attachmentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentID() {
        return attachmentID;
    }

    /**
     * Sets the value of the attachmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentID(String value) {
        this.attachmentID = value;
    }

    /**
     * Gets the value of the remoteURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteURL() {
        return remoteURL;
    }

    /**
     * Sets the value of the remoteURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteURL(String value) {
        this.remoteURL = value;
    }

    /**
     * Gets the value of the mtom property.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getMTOM() {
        return mtom;
    }

    /**
     * Sets the value of the mtom property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setMTOM(DataHandler value) {
        this.mtom = value;
    }

    /**
     * Gets the value of the swaRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DataHandler getSwaRef() {
        return swaRef;
    }

    /**
     * Sets the value of the swaRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwaRef(DataHandler value) {
        this.swaRef = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link MyMapOfXsdStringToXsdAnyType }
     *     
     */
    public MyMapOfXsdStringToXsdAnyType getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyMapOfXsdStringToXsdAnyType }
     *     
     */
    public void setAttributes(MyMapOfXsdStringToXsdAnyType value) {
        this.attributes = value;
    }

}
