
package it.infotn.epu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for alloggioOccupatoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="alloggioOccupatoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comuneAlloggio" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="dataContratto" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="descrizioneComuneAlloggio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idDomanda" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idObj" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="importoCanone" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="indirizzoAlloggio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroStanze" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="superficieAlloggio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="tipoContratto" type="{http://epu.infotn.it}contratto" minOccurs="0"/>
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
@XmlType(name = "alloggioOccupatoType", propOrder = {
    "comuneAlloggio",
    "dataContratto",
    "descrizioneComuneAlloggio",
    "idDomanda",
    "idObj",
    "importoCanone",
    "indirizzoAlloggio",
    "numeroStanze",
    "superficieAlloggio",
    "tipoContratto",
    "versione"
})
public class AlloggioOccupatoType {

    protected Long comuneAlloggio;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataContratto;
    protected String descrizioneComuneAlloggio;
    protected Long idDomanda;
    protected Long idObj;
    protected Double importoCanone;
    protected String indirizzoAlloggio;
    protected Integer numeroStanze;
    protected Double superficieAlloggio;
    protected Contratto tipoContratto;
    protected Integer versione;

    /**
     * Gets the value of the comuneAlloggio property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getComuneAlloggio() {
        return comuneAlloggio;
    }

    /**
     * Sets the value of the comuneAlloggio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setComuneAlloggio(Long value) {
        this.comuneAlloggio = value;
    }

    /**
     * Gets the value of the dataContratto property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataContratto() {
        return dataContratto;
    }

    /**
     * Sets the value of the dataContratto property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataContratto(XMLGregorianCalendar value) {
        this.dataContratto = value;
    }

    /**
     * Gets the value of the descrizioneComuneAlloggio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneComuneAlloggio() {
        return descrizioneComuneAlloggio;
    }

    /**
     * Sets the value of the descrizioneComuneAlloggio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneComuneAlloggio(String value) {
        this.descrizioneComuneAlloggio = value;
    }

    /**
     * Gets the value of the idDomanda property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdDomanda() {
        return idDomanda;
    }

    /**
     * Sets the value of the idDomanda property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdDomanda(Long value) {
        this.idDomanda = value;
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
     * Gets the value of the importoCanone property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImportoCanone() {
        return importoCanone;
    }

    /**
     * Sets the value of the importoCanone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImportoCanone(Double value) {
        this.importoCanone = value;
    }

    /**
     * Gets the value of the indirizzoAlloggio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndirizzoAlloggio() {
        return indirizzoAlloggio;
    }

    /**
     * Sets the value of the indirizzoAlloggio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndirizzoAlloggio(String value) {
        this.indirizzoAlloggio = value;
    }

    /**
     * Gets the value of the numeroStanze property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroStanze() {
        return numeroStanze;
    }

    /**
     * Sets the value of the numeroStanze property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroStanze(Integer value) {
        this.numeroStanze = value;
    }

    /**
     * Gets the value of the superficieAlloggio property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSuperficieAlloggio() {
        return superficieAlloggio;
    }

    /**
     * Sets the value of the superficieAlloggio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSuperficieAlloggio(Double value) {
        this.superficieAlloggio = value;
    }

    /**
     * Gets the value of the tipoContratto property.
     * 
     * @return
     *     possible object is
     *     {@link Contratto }
     *     
     */
    public Contratto getTipoContratto() {
        return tipoContratto;
    }

    /**
     * Sets the value of the tipoContratto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contratto }
     *     
     */
    public void setTipoContratto(Contratto value) {
        this.tipoContratto = value;
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
