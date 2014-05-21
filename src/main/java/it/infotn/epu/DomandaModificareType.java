
package it.infotn.epu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for domandaModificareType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="domandaModificareType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alloggioOccupatoType" type="{http://epu.infotn.it}alloggioOccupatoType" minOccurs="0"/>
 *         &lt;element name="ambitoTerritoriale1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="extracomunitariType" type="{http://epu.infotn.it}domandaExtracomunitariType" minOccurs="0"/>
 *         &lt;element name="idDomanda" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nucleoFamiliareComponentiModificareType" type="{http://epu.infotn.it}nucleoFamiliareComponentiModificareType" minOccurs="0"/>
 *         &lt;element name="nucleoFamiliareModificareType" type="{http://epu.infotn.it}nucleoFamiliareModificareType" minOccurs="0"/>
 *         &lt;element name="parentelaStatoCivileModificareType" type="{http://epu.infotn.it}parentelaStatoCivileModificareType" minOccurs="0"/>
 *         &lt;element name="residenzaType" type="{http://epu.infotn.it}domandaResidenzaType" minOccurs="0"/>
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
@XmlType(name = "domandaModificareType", propOrder = {
    "alloggioOccupatoType",
    "ambitoTerritoriale1",
    "extracomunitariType",
    "idDomanda",
    "nucleoFamiliareComponentiModificareType",
    "nucleoFamiliareModificareType",
    "parentelaStatoCivileModificareType",
    "residenzaType",
    "versione"
})
public class DomandaModificareType {

    protected AlloggioOccupatoType alloggioOccupatoType;
    protected Long ambitoTerritoriale1;
    protected DomandaExtracomunitariType extracomunitariType;
    protected Long idDomanda;
    protected NucleoFamiliareComponentiModificareType nucleoFamiliareComponentiModificareType;
    protected NucleoFamiliareModificareType nucleoFamiliareModificareType;
    protected ParentelaStatoCivileModificareType parentelaStatoCivileModificareType;
    protected DomandaResidenzaType residenzaType;
    protected Integer versione;

    /**
     * Gets the value of the alloggioOccupatoType property.
     * 
     * @return
     *     possible object is
     *     {@link AlloggioOccupatoType }
     *     
     */
    public AlloggioOccupatoType getAlloggioOccupatoType() {
        return alloggioOccupatoType;
    }

    /**
     * Sets the value of the alloggioOccupatoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlloggioOccupatoType }
     *     
     */
    public void setAlloggioOccupatoType(AlloggioOccupatoType value) {
        this.alloggioOccupatoType = value;
    }

    /**
     * Gets the value of the ambitoTerritoriale1 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAmbitoTerritoriale1() {
        return ambitoTerritoriale1;
    }

    /**
     * Sets the value of the ambitoTerritoriale1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAmbitoTerritoriale1(Long value) {
        this.ambitoTerritoriale1 = value;
    }

    /**
     * Gets the value of the extracomunitariType property.
     * 
     * @return
     *     possible object is
     *     {@link DomandaExtracomunitariType }
     *     
     */
    public DomandaExtracomunitariType getExtracomunitariType() {
        return extracomunitariType;
    }

    /**
     * Sets the value of the extracomunitariType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomandaExtracomunitariType }
     *     
     */
    public void setExtracomunitariType(DomandaExtracomunitariType value) {
        this.extracomunitariType = value;
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
     * Gets the value of the nucleoFamiliareComponentiModificareType property.
     * 
     * @return
     *     possible object is
     *     {@link NucleoFamiliareComponentiModificareType }
     *     
     */
    public NucleoFamiliareComponentiModificareType getNucleoFamiliareComponentiModificareType() {
        return nucleoFamiliareComponentiModificareType;
    }

    /**
     * Sets the value of the nucleoFamiliareComponentiModificareType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NucleoFamiliareComponentiModificareType }
     *     
     */
    public void setNucleoFamiliareComponentiModificareType(NucleoFamiliareComponentiModificareType value) {
        this.nucleoFamiliareComponentiModificareType = value;
    }

    /**
     * Gets the value of the nucleoFamiliareModificareType property.
     * 
     * @return
     *     possible object is
     *     {@link NucleoFamiliareModificareType }
     *     
     */
    public NucleoFamiliareModificareType getNucleoFamiliareModificareType() {
        return nucleoFamiliareModificareType;
    }

    /**
     * Sets the value of the nucleoFamiliareModificareType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NucleoFamiliareModificareType }
     *     
     */
    public void setNucleoFamiliareModificareType(NucleoFamiliareModificareType value) {
        this.nucleoFamiliareModificareType = value;
    }

    /**
     * Gets the value of the parentelaStatoCivileModificareType property.
     * 
     * @return
     *     possible object is
     *     {@link ParentelaStatoCivileModificareType }
     *     
     */
    public ParentelaStatoCivileModificareType getParentelaStatoCivileModificareType() {
        return parentelaStatoCivileModificareType;
    }

    /**
     * Sets the value of the parentelaStatoCivileModificareType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentelaStatoCivileModificareType }
     *     
     */
    public void setParentelaStatoCivileModificareType(ParentelaStatoCivileModificareType value) {
        this.parentelaStatoCivileModificareType = value;
    }

    /**
     * Gets the value of the residenzaType property.
     * 
     * @return
     *     possible object is
     *     {@link DomandaResidenzaType }
     *     
     */
    public DomandaResidenzaType getResidenzaType() {
        return residenzaType;
    }

    /**
     * Sets the value of the residenzaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomandaResidenzaType }
     *     
     */
    public void setResidenzaType(DomandaResidenzaType value) {
        this.residenzaType = value;
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
