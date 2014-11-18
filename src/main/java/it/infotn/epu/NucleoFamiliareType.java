
package it.infotn.epu;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nucleoFamiliareType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nucleoFamiliareType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alloggioSbarrierato" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="componente" type="{http://epu.infotn.it}componenteType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="componentiExtraIcef" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idDomanda" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idObj" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="indicatoreEconomico" type="{http://epu.infotn.it}indicatoreEconomicoType" minOccurs="0"/>
 *         &lt;element name="monoGenitore" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "nucleoFamiliareType", propOrder = {
    "alloggioSbarrierato",
    "componente",
    "componentiExtraIcef",
    "idDomanda",
    "idObj",
    "indicatoreEconomico",
    "monoGenitore",
    "numeroStanze"
})
public class NucleoFamiliareType {

    protected Boolean alloggioSbarrierato;
    @XmlElement(nillable = true)
    protected List<ComponenteType> componente;
    protected Integer componentiExtraIcef;
    protected Long idDomanda;
    protected Long idObj;
    protected IndicatoreEconomicoType indicatoreEconomico;
    protected Boolean monoGenitore;
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
     * Gets the value of the componente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the componente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponente().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComponenteType }
     * 
     * 
     */
    public List<ComponenteType> getComponente() {
        if (componente == null) {
            componente = new ArrayList<ComponenteType>();
        }
        return this.componente;
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
     * Gets the value of the indicatoreEconomico property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatoreEconomicoType }
     *     
     */
    public IndicatoreEconomicoType getIndicatoreEconomico() {
        return indicatoreEconomico;
    }

    /**
     * Sets the value of the indicatoreEconomico property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatoreEconomicoType }
     *     
     */
    public void setIndicatoreEconomico(IndicatoreEconomicoType value) {
        this.indicatoreEconomico = value;
    }

    /**
     * Gets the value of the monoGenitore property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMonoGenitore() {
        return monoGenitore;
    }

    /**
     * Sets the value of the monoGenitore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMonoGenitore(Boolean value) {
        this.monoGenitore = value;
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
