
package it.infotn.epu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for domandaWSStampaOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="domandaWSStampaOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epu.infotn.it}esitoOutput">
 *       &lt;sequence>
 *         &lt;element name="stampa" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "domandaWSStampaOutput", propOrder = {
    "stampa"
})
public class DomandaWSStampaOutput
    extends EsitoOutput
{

    protected byte[] stampa;

    /**
     * Gets the value of the stampa property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getStampa() {
        return stampa;
    }

    /**
     * Sets the value of the stampa property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setStampa(byte[] value) {
        this.stampa = ((byte[]) value);
    }

}
