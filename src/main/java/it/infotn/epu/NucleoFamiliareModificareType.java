
package it.infotn.epu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nucleoFamiliareModificareType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nucleoFamiliareModificareType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alloggioSbarrierato" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="componentiExtraIcef" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idDomanda" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idObj" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numeroStanze" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nucleoFamiliareModificareType", propOrder = {
    "alloggioSbarrierato",
    "componentiExtraIcef",
    "idDomanda",
    "idObj",
    "numeroStanze"
})
public class NucleoFamiliareModificareType {

    protected Boolean alloggioSbarrierato;
    protected Integer componentiExtraIcef;
    protected Long idDomanda;
    protected Long idObj;
    protected Integer numeroStanze;

    /**
     * Gets the value of the alloggioSbarrierato property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlloggioSbarrierato() {
        return alloggioSbarrierato;
    }

    /**
     * Sets the value of the alloggioSbarrierato property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlloggioSbarrierato(Boolean value) {
        this.alloggioSbarrierato = value;
    }

    /**
     * Gets the value of the componentiExtraIcef property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getComponentiExtraIcef() {
        return componentiExtraIcef;
    }

    /**
     * Sets the value of the componentiExtraIcef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setComponentiExtraIcef(Integer value) {
        this.componentiExtraIcef = value;
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

}
