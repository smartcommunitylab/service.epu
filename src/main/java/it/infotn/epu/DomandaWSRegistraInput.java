
package it.infotn.epu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for domandaWSRegistraInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="domandaWSRegistraInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epu.infotn.it}utenteInfoInput">
 *       &lt;sequence>
 *         &lt;element name="domandaType" type="{http://epu.infotn.it}domandaRegistrareType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "domandaWSRegistraInput", propOrder = {
    "domandaType"
})
public class DomandaWSRegistraInput
    extends UtenteInfoInput
{

    protected DomandaRegistrareType domandaType;

    /**
     * Gets the value of the domandaType property.
     * 
     * @return
     *     possible object is
     *     {@link DomandaRegistrareType }
     *     
     */
    public DomandaRegistrareType getDomandaType() {
        return domandaType;
    }

    /**
     * Sets the value of the domandaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomandaRegistrareType }
     *     
     */
    public void setDomandaType(DomandaRegistrareType value) {
        this.domandaType = value;
    }

}
