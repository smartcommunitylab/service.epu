
package it.infotn.epu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for domandaResidenzaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="domandaResidenzaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alloggioAdeguato" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cittadinanzaUE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="numeroComponenti" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="residenzaTN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="tipoResidenza" type="{http://epu.infotn.it}tipoResidenza" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "domandaResidenzaType", propOrder = {
    "alloggioAdeguato",
    "cittadinanzaUE",
    "numeroComponenti",
    "residenzaTN",
    "tipoResidenza"
})
public class DomandaResidenzaType {

    protected Boolean alloggioAdeguato;
    protected Boolean cittadinanzaUE;
    protected Integer numeroComponenti;
    protected Boolean residenzaTN;
    protected TipoResidenza tipoResidenza;

    /**
     * Gets the value of the alloggioAdeguato property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlloggioAdeguato() {
        return alloggioAdeguato;
    }

    /**
     * Sets the value of the alloggioAdeguato property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlloggioAdeguato(Boolean value) {
        this.alloggioAdeguato = value;
    }

    /**
     * Gets the value of the cittadinanzaUE property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCittadinanzaUE() {
        return cittadinanzaUE;
    }

    /**
     * Sets the value of the cittadinanzaUE property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCittadinanzaUE(Boolean value) {
        this.cittadinanzaUE = value;
    }

    /**
     * Gets the value of the numeroComponenti property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroComponenti() {
        return numeroComponenti;
    }

    /**
     * Sets the value of the numeroComponenti property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroComponenti(Integer value) {
        this.numeroComponenti = value;
    }

    /**
     * Gets the value of the residenzaTN property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResidenzaTN() {
        return residenzaTN;
    }

    /**
     * Sets the value of the residenzaTN property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResidenzaTN(Boolean value) {
        this.residenzaTN = value;
    }

    /**
     * Gets the value of the tipoResidenza property.
     * 
     * @return
     *     possible object is
     *     {@link TipoResidenza }
     *     
     */
    public TipoResidenza getTipoResidenza() {
        return tipoResidenza;
    }

    /**
     * Sets the value of the tipoResidenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoResidenza }
     *     
     */
    public void setTipoResidenza(TipoResidenza value) {
        this.tipoResidenza = value;
    }

}
