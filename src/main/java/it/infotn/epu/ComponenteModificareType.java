
package it.infotn.epu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for componenteModificareType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="componenteModificareType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idNucleoFamiliare" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idObj" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="variazioniComponenteModificare" type="{http://epu.infotn.it}variazioneComponenteModificareType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "componenteModificareType", propOrder = {
    "idNucleoFamiliare",
    "idObj",
    "variazioniComponenteModificare"
})
public class ComponenteModificareType {

    protected Long idNucleoFamiliare;
    protected Long idObj;
    protected VariazioneComponenteModificareType variazioniComponenteModificare;

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
     * Gets the value of the variazioniComponenteModificare property.
     * 
     * @return
     *     possible object is
     *     {@link VariazioneComponenteModificareType }
     *     
     */
    public VariazioneComponenteModificareType getVariazioniComponenteModificare() {
        return variazioniComponenteModificare;
    }

    /**
     * Sets the value of the variazioniComponenteModificare property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariazioneComponenteModificareType }
     *     
     */
    public void setVariazioniComponenteModificare(VariazioneComponenteModificareType value) {
        this.variazioniComponenteModificare = value;
    }

}
