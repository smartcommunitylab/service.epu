
package it.infotn.epu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for edizioneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="edizioneType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="annoPianoFinanziario" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="annoReddito" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="dataApertura" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataChiusura" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idObj" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="strumento" type="{http://epu.infotn.it}strumentoInterventoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "edizioneType", propOrder = {
    "annoPianoFinanziario",
    "annoReddito",
    "dataApertura",
    "dataChiusura",
    "idObj",
    "strumento"
})
public class EdizioneType {

    protected Long annoPianoFinanziario;
    protected Long annoReddito;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataApertura;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataChiusura;
    protected Long idObj;
    protected StrumentoInterventoType strumento;

    /**
     * Gets the value of the annoPianoFinanziario property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAnnoPianoFinanziario() {
        return annoPianoFinanziario;
    }

    /**
     * Sets the value of the annoPianoFinanziario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAnnoPianoFinanziario(Long value) {
        this.annoPianoFinanziario = value;
    }

    /**
     * Gets the value of the annoReddito property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAnnoReddito() {
        return annoReddito;
    }

    /**
     * Sets the value of the annoReddito property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAnnoReddito(Long value) {
        this.annoReddito = value;
    }

    /**
     * Gets the value of the dataApertura property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataApertura() {
        return dataApertura;
    }

    /**
     * Sets the value of the dataApertura property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataApertura(XMLGregorianCalendar value) {
        this.dataApertura = value;
    }

    /**
     * Gets the value of the dataChiusura property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataChiusura() {
        return dataChiusura;
    }

    /**
     * Sets the value of the dataChiusura property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataChiusura(XMLGregorianCalendar value) {
        this.dataChiusura = value;
    }

    /**
     * Gets the value of the idObj property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdObj() {
        return idObj;
    }

    /**
     * Sets the value of the idObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdObj(Long value) {
        this.idObj = value;
    }

    /**
     * Gets the value of the strumento property.
     * 
     * @return
     *     possible object is
     *     {@link StrumentoInterventoType }
     *     
     */
    public StrumentoInterventoType getStrumento() {
        return strumento;
    }

    /**
     * Sets the value of the strumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrumentoInterventoType }
     *     
     */
    public void setStrumento(StrumentoInterventoType value) {
        this.strumento = value;
    }

}
