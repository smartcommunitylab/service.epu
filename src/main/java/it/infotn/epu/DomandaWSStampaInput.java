
package it.infotn.epu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for domandaWSStampaInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="domandaWSStampaInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epu.infotn.it}utenteInfoInput">
 *       &lt;sequence>
 *         &lt;element name="idDomanda" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="tipoStampa" type="{http://epu.infotn.it}tipoStampa" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "domandaWSStampaInput", propOrder = {
    "idDomanda",
    "tipoStampa"
})
public class DomandaWSStampaInput
    extends UtenteInfoInput
{

    protected Long idDomanda;
    protected TipoStampa tipoStampa;

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
     * Gets the value of the tipoStampa property.
     * 
     * @return
     *     possible object is
     *     {@link TipoStampa }
     *     
     */
    public TipoStampa getTipoStampa() {
        return tipoStampa;
    }

    /**
     * Sets the value of the tipoStampa property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoStampa }
     *     
     */
    public void setTipoStampa(TipoStampa value) {
        this.tipoStampa = value;
    }

}
