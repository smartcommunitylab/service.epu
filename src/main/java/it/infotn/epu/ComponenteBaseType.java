
package it.infotn.epu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for componenteBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="componenteBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idNucleoFamiliare" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idObj" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="parentela" type="{http://epu.infotn.it}parentela" minOccurs="0"/>
 *         &lt;element name="richiedente" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="statoCivile" type="{http://epu.infotn.it}statoCivile" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "componenteBaseType", propOrder = {
    "idNucleoFamiliare",
    "idObj",
    "parentela",
    "richiedente",
    "statoCivile"
})
@XmlSeeAlso({
    ComponenteParentelaStatoCivileModificareType.class,
    ComponenteType.class
})
public class ComponenteBaseType {

    protected Long idNucleoFamiliare;
    protected Long idObj;
    protected Parentela parentela;
    protected Boolean richiedente;
    protected StatoCivile statoCivile;

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
     * Gets the value of the parentela property.
     * 
     * @return
     *     possible object is
     *     {@link Parentela }
     *     
     */
    public Parentela getParentela() {
        return parentela;
    }

    /**
     * Sets the value of the parentela property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parentela }
     *     
     */
    public void setParentela(Parentela value) {
        this.parentela = value;
    }

    /**
     * Gets the value of the richiedente property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRichiedente() {
        return richiedente;
    }

    /**
     * Sets the value of the richiedente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRichiedente(Boolean value) {
        this.richiedente = value;
    }

    /**
     * Gets the value of the statoCivile property.
     * 
     * @return
     *     possible object is
     *     {@link StatoCivile }
     *     
     */
    public StatoCivile getStatoCivile() {
        return statoCivile;
    }

    /**
     * Sets the value of the statoCivile property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatoCivile }
     *     
     */
    public void setStatoCivile(StatoCivile value) {
        this.statoCivile = value;
    }

}
