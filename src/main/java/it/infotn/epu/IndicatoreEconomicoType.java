
package it.infotn.epu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for indicatoreEconomicoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="indicatoreEconomicoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="annoReddito" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dataCalcoloICEF" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataFine" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataPresentazioneICEF" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataVerifica" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="esitoVerifica" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ICEFAccesso" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ICEFContributo" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ICEFVerifica" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="idNucleoFamiliare" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idObj" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="invalido75Perc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numeroComponentiRedditoSignificativo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numeroInvalidi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pensionatiBiennio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="protocolloICEF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="redditoComplessivo" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="sistemaOrigine" type="{http://epu.infotn.it}sistemaOrigine" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "indicatoreEconomicoType", propOrder = {
    "annoReddito",
    "dataCalcoloICEF",
    "dataFine",
    "dataPresentazioneICEF",
    "dataVerifica",
    "esitoVerifica",
    "icefAccesso",
    "icefContributo",
    "icefVerifica",
    "idNucleoFamiliare",
    "idObj",
    "invalido75Perc",
    "numeroComponentiRedditoSignificativo",
    "numeroInvalidi",
    "pensionatiBiennio",
    "protocolloICEF",
    "redditoComplessivo",
    "sistemaOrigine"
})
public class IndicatoreEconomicoType {

    protected Integer annoReddito;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataCalcoloICEF;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataFine;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataPresentazioneICEF;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataVerifica;
    protected Boolean esitoVerifica;
    @XmlElement(name = "ICEFAccesso")
    protected Double icefAccesso;
    @XmlElement(name = "ICEFContributo")
    protected Double icefContributo;
    @XmlElement(name = "ICEFVerifica")
    protected Double icefVerifica;
    protected Long idNucleoFamiliare;
    protected Long idObj;
    protected Integer invalido75Perc;
    protected Integer numeroComponentiRedditoSignificativo;
    protected Integer numeroInvalidi;
    protected Integer pensionatiBiennio;
    protected String protocolloICEF;
    protected Double redditoComplessivo;
    protected SistemaOrigine sistemaOrigine;

    /**
     * Gets the value of the annoReddito property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnnoReddito() {
        return annoReddito;
    }

    /**
     * Sets the value of the annoReddito property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnnoReddito(Integer value) {
        this.annoReddito = value;
    }

    /**
     * Gets the value of the dataCalcoloICEF property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataCalcoloICEF() {
        return dataCalcoloICEF;
    }

    /**
     * Sets the value of the dataCalcoloICEF property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCalcoloICEF(XMLGregorianCalendar value) {
        this.dataCalcoloICEF = value;
    }

    /**
     * Gets the value of the dataFine property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFine() {
        return dataFine;
    }

    /**
     * Sets the value of the dataFine property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFine(XMLGregorianCalendar value) {
        this.dataFine = value;
    }

    /**
     * Gets the value of the dataPresentazioneICEF property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataPresentazioneICEF() {
        return dataPresentazioneICEF;
    }

    /**
     * Sets the value of the dataPresentazioneICEF property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataPresentazioneICEF(XMLGregorianCalendar value) {
        this.dataPresentazioneICEF = value;
    }

    /**
     * Gets the value of the dataVerifica property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataVerifica() {
        return dataVerifica;
    }

    /**
     * Sets the value of the dataVerifica property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataVerifica(XMLGregorianCalendar value) {
        this.dataVerifica = value;
    }

    /**
     * Gets the value of the esitoVerifica property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEsitoVerifica() {
        return esitoVerifica;
    }

    /**
     * Sets the value of the esitoVerifica property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEsitoVerifica(Boolean value) {
        this.esitoVerifica = value;
    }

    /**
     * Gets the value of the icefAccesso property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getICEFAccesso() {
        return icefAccesso;
    }

    /**
     * Sets the value of the icefAccesso property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setICEFAccesso(Double value) {
        this.icefAccesso = value;
    }

    /**
     * Gets the value of the icefContributo property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getICEFContributo() {
        return icefContributo;
    }

    /**
     * Sets the value of the icefContributo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setICEFContributo(Double value) {
        this.icefContributo = value;
    }

    /**
     * Gets the value of the icefVerifica property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getICEFVerifica() {
        return icefVerifica;
    }

    /**
     * Sets the value of the icefVerifica property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setICEFVerifica(Double value) {
        this.icefVerifica = value;
    }

    /**
     * Gets the value of the idNucleoFamiliare property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdNucleoFamiliare() {
        return idNucleoFamiliare;
    }

    /**
     * Sets the value of the idNucleoFamiliare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdNucleoFamiliare(Long value) {
        this.idNucleoFamiliare = value;
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
     * Gets the value of the invalido75Perc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInvalido75Perc() {
        return invalido75Perc;
    }

    /**
     * Sets the value of the invalido75Perc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInvalido75Perc(Integer value) {
        this.invalido75Perc = value;
    }

    /**
     * Gets the value of the numeroComponentiRedditoSignificativo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroComponentiRedditoSignificativo() {
        return numeroComponentiRedditoSignificativo;
    }

    /**
     * Sets the value of the numeroComponentiRedditoSignificativo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroComponentiRedditoSignificativo(Integer value) {
        this.numeroComponentiRedditoSignificativo = value;
    }

    /**
     * Gets the value of the numeroInvalidi property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroInvalidi() {
        return numeroInvalidi;
    }

    /**
     * Sets the value of the numeroInvalidi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroInvalidi(Integer value) {
        this.numeroInvalidi = value;
    }

    /**
     * Gets the value of the pensionatiBiennio property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPensionatiBiennio() {
        return pensionatiBiennio;
    }

    /**
     * Sets the value of the pensionatiBiennio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPensionatiBiennio(Integer value) {
        this.pensionatiBiennio = value;
    }

    /**
     * Gets the value of the protocolloICEF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolloICEF() {
        return protocolloICEF;
    }

    /**
     * Sets the value of the protocolloICEF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolloICEF(String value) {
        this.protocolloICEF = value;
    }

    /**
     * Gets the value of the redditoComplessivo property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRedditoComplessivo() {
        return redditoComplessivo;
    }

    /**
     * Sets the value of the redditoComplessivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRedditoComplessivo(Double value) {
        this.redditoComplessivo = value;
    }

    /**
     * Gets the value of the sistemaOrigine property.
     * 
     * @return
     *     possible object is
     *     {@link SistemaOrigine }
     *     
     */
    public SistemaOrigine getSistemaOrigine() {
        return sistemaOrigine;
    }

    /**
     * Sets the value of the sistemaOrigine property.
     * 
     * @param value
     *     allowed object is
     *     {@link SistemaOrigine }
     *     
     */
    public void setSistemaOrigine(SistemaOrigine value) {
        this.sistemaOrigine = value;
    }

}
