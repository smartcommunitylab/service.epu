
package it.infotn.epu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for variazioneComponenteModificareType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="variazioneComponenteModificareType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anniLavoro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="anniResidenza" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="anniResidenzaComune" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="categoriaInvalidita" type="{http://epu.infotn.it}categoriaInvalidita" minOccurs="0"/>
 *         &lt;element name="decsrCittadinanza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="donnaLavoratrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="flagResidenza" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="frazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fuoriAlloggio" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="gradoInvalidita" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idComponente" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idComuneResidenza" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idObj" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="indirizzoResidenza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroCivico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ospite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pensionato" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="provinciaResidenza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "variazioneComponenteModificareType", propOrder = {
    "anniLavoro",
    "anniResidenza",
    "anniResidenzaComune",
    "categoriaInvalidita",
    "decsrCittadinanza",
    "donnaLavoratrice",
    "flagResidenza",
    "frazione",
    "fuoriAlloggio",
    "gradoInvalidita",
    "idComponente",
    "idComuneResidenza",
    "idObj",
    "indirizzoResidenza",
    "note",
    "numeroCivico",
    "ospite",
    "pensionato",
    "provinciaResidenza",
    "telefono"
})
@XmlSeeAlso({
    VariazioneComponenteType.class
})
public class VariazioneComponenteModificareType {

    protected Integer anniLavoro;
    protected Integer anniResidenza;
    protected Integer anniResidenzaComune;
    protected CategoriaInvalidita categoriaInvalidita;
    protected String decsrCittadinanza;
    protected Boolean donnaLavoratrice;
    protected Boolean flagResidenza;
    protected String frazione;
    protected Boolean fuoriAlloggio;
    protected Integer gradoInvalidita;
    protected Long idComponente;
    protected Long idComuneResidenza;
    protected Long idObj;
    protected String indirizzoResidenza;
    protected String note;
    protected String numeroCivico;
    protected Boolean ospite;
    protected Boolean pensionato;
    protected String provinciaResidenza;
    protected String telefono;

    /**
     * Gets the value of the anniLavoro property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnniLavoro() {
        return anniLavoro;
    }

    /**
     * Sets the value of the anniLavoro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnniLavoro(Integer value) {
        this.anniLavoro = value;
    }

    /**
     * Gets the value of the anniResidenza property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnniResidenza() {
        return anniResidenza;
    }

    /**
     * Sets the value of the anniResidenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnniResidenza(Integer value) {
        this.anniResidenza = value;
    }

    /**
     * Gets the value of the anniResidenzaComune property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnniResidenzaComune() {
        return anniResidenzaComune;
    }

    /**
     * Sets the value of the anniResidenzaComune property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnniResidenzaComune(Integer value) {
        this.anniResidenzaComune = value;
    }

    /**
     * Gets the value of the categoriaInvalidita property.
     * 
     * @return
     *     possible object is
     *     {@link CategoriaInvalidita }
     *     
     */
    public CategoriaInvalidita getCategoriaInvalidita() {
        return categoriaInvalidita;
    }

    /**
     * Sets the value of the categoriaInvalidita property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoriaInvalidita }
     *     
     */
    public void setCategoriaInvalidita(CategoriaInvalidita value) {
        this.categoriaInvalidita = value;
    }

    /**
     * Gets the value of the decsrCittadinanza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecsrCittadinanza() {
        return decsrCittadinanza;
    }

    /**
     * Sets the value of the decsrCittadinanza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecsrCittadinanza(String value) {
        this.decsrCittadinanza = value;
    }

    /**
     * Gets the value of the donnaLavoratrice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDonnaLavoratrice() {
        return donnaLavoratrice;
    }

    /**
     * Sets the value of the donnaLavoratrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDonnaLavoratrice(Boolean value) {
        this.donnaLavoratrice = value;
    }

    /**
     * Gets the value of the flagResidenza property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlagResidenza() {
        return flagResidenza;
    }

    /**
     * Sets the value of the flagResidenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlagResidenza(Boolean value) {
        this.flagResidenza = value;
    }

    /**
     * Gets the value of the frazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrazione() {
        return frazione;
    }

    /**
     * Sets the value of the frazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrazione(String value) {
        this.frazione = value;
    }

    /**
     * Gets the value of the fuoriAlloggio property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFuoriAlloggio() {
        return fuoriAlloggio;
    }

    /**
     * Sets the value of the fuoriAlloggio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFuoriAlloggio(Boolean value) {
        this.fuoriAlloggio = value;
    }

    /**
     * Gets the value of the gradoInvalidita property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGradoInvalidita() {
        return gradoInvalidita;
    }

    /**
     * Sets the value of the gradoInvalidita property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGradoInvalidita(Integer value) {
        this.gradoInvalidita = value;
    }

    /**
     * Gets the value of the idComponente property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdComponente() {
        return idComponente;
    }

    /**
     * Sets the value of the idComponente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdComponente(Long value) {
        this.idComponente = value;
    }

    /**
     * Gets the value of the idComuneResidenza property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdComuneResidenza() {
        return idComuneResidenza;
    }

    /**
     * Sets the value of the idComuneResidenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdComuneResidenza(Long value) {
        this.idComuneResidenza = value;
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
     * Gets the value of the indirizzoResidenza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndirizzoResidenza() {
        return indirizzoResidenza;
    }

    /**
     * Sets the value of the indirizzoResidenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndirizzoResidenza(String value) {
        this.indirizzoResidenza = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the numeroCivico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCivico() {
        return numeroCivico;
    }

    /**
     * Sets the value of the numeroCivico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCivico(String value) {
        this.numeroCivico = value;
    }

    /**
     * Gets the value of the ospite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOspite() {
        return ospite;
    }

    /**
     * Sets the value of the ospite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOspite(Boolean value) {
        this.ospite = value;
    }

    /**
     * Gets the value of the pensionato property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPensionato() {
        return pensionato;
    }

    /**
     * Sets the value of the pensionato property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPensionato(Boolean value) {
        this.pensionato = value;
    }

    /**
     * Gets the value of the provinciaResidenza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinciaResidenza() {
        return provinciaResidenza;
    }

    /**
     * Sets the value of the provinciaResidenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinciaResidenza(String value) {
        this.provinciaResidenza = value;
    }

    /**
     * Gets the value of the telefono property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Sets the value of the telefono property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono(String value) {
        this.telefono = value;
    }

}
