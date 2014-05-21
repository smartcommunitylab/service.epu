
package it.infotn.epu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for domandaBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="domandaBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consolidata" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="dataPresentazione" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="edizioneFinanziata" type="{http://epu.infotn.it}edizioneFinanziataType" minOccurs="0"/>
 *         &lt;element name="idObj" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="identificativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroCasuale" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="punteggio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="statoDomanda" type="{http://epu.infotn.it}statoDomanda" minOccurs="0"/>
 *         &lt;element name="versione" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "domandaBaseType", propOrder = {
    "consolidata",
    "dataPresentazione",
    "edizioneFinanziata",
    "idObj",
    "identificativo",
    "numeroCasuale",
    "punteggio",
    "statoDomanda",
    "versione"
})
@XmlSeeAlso({
    DomandaType.class,
    DomandaRicercaType.class
})
public class DomandaBaseType {

    protected Boolean consolidata;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataPresentazione;
    protected EdizioneFinanziataType edizioneFinanziata;
    protected Long idObj;
    protected String identificativo;
    protected Long numeroCasuale;
    protected Double punteggio;
    protected StatoDomanda statoDomanda;
    protected Integer versione;

    /**
     * Gets the value of the consolidata property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConsolidata() {
        return consolidata;
    }

    /**
     * Sets the value of the consolidata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConsolidata(Boolean value) {
        this.consolidata = value;
    }

    /**
     * Gets the value of the dataPresentazione property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataPresentazione() {
        return dataPresentazione;
    }

    /**
     * Sets the value of the dataPresentazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataPresentazione(XMLGregorianCalendar value) {
        this.dataPresentazione = value;
    }

    /**
     * Gets the value of the edizioneFinanziata property.
     * 
     * @return
     *     possible object is
     *     {@link EdizioneFinanziataType }
     *     
     */
    public EdizioneFinanziataType getEdizioneFinanziata() {
        return edizioneFinanziata;
    }

    /**
     * Sets the value of the edizioneFinanziata property.
     * 
     * @param value
     *     allowed object is
     *     {@link EdizioneFinanziataType }
     *     
     */
    public void setEdizioneFinanziata(EdizioneFinanziataType value) {
        this.edizioneFinanziata = value;
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
     * Gets the value of the identificativo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificativo() {
        return identificativo;
    }

    /**
     * Sets the value of the identificativo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificativo(String value) {
        this.identificativo = value;
    }

    /**
     * Gets the value of the numeroCasuale property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumeroCasuale() {
        return numeroCasuale;
    }

    /**
     * Sets the value of the numeroCasuale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumeroCasuale(Long value) {
        this.numeroCasuale = value;
    }

    /**
     * Gets the value of the punteggio property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPunteggio() {
        return punteggio;
    }

    /**
     * Sets the value of the punteggio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPunteggio(Double value) {
        this.punteggio = value;
    }

    /**
     * Gets the value of the statoDomanda property.
     * 
     * @return
     *     possible object is
     *     {@link StatoDomanda }
     *     
     */
    public StatoDomanda getStatoDomanda() {
        return statoDomanda;
    }

    /**
     * Sets the value of the statoDomanda property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatoDomanda }
     *     
     */
    public void setStatoDomanda(StatoDomanda value) {
        this.statoDomanda = value;
    }

    /**
     * Gets the value of the versione property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVersione() {
        return versione;
    }

    /**
     * Sets the value of the versione property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVersione(Integer value) {
        this.versione = value;
    }

}
