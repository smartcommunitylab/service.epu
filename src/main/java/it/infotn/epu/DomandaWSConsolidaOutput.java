
package it.infotn.epu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for domandaWSConsolidaOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="domandaWSConsolidaOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epu.infotn.it}esitoOutput">
 *       &lt;sequence>
 *         &lt;element name="domanda" type="{http://epu.infotn.it}domandaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "domandaWSConsolidaOutput", propOrder = {
    "domanda"
})
public class DomandaWSConsolidaOutput
    extends EsitoOutput
{

    protected DomandaType domanda;

    /**
     * Gets the value of the domanda property.
     * 
     * @return
     *     possible object is
     *     {@link DomandaType }
     *     
     */
    public DomandaType getDomanda() {
        return domanda;
    }

    /**
     * Sets the value of the domanda property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomandaType }
     *     
     */
    public void setDomanda(DomandaType value) {
        this.domanda = value;
    }

}
