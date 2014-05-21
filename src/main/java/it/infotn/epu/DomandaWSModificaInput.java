
package it.infotn.epu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for domandaWSModificaInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="domandaWSModificaInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epu.infotn.it}utenteInfoInput">
 *       &lt;sequence>
 *         &lt;element name="domandaType" type="{http://epu.infotn.it}domandaModificareType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "domandaWSModificaInput", propOrder = {
    "domandaType"
})
public class DomandaWSModificaInput
    extends UtenteInfoInput
{

    protected DomandaModificareType domandaType;

    /**
     * Gets the value of the domandaType property.
     * 
     * @return
     *     possible object is
     *     {@link DomandaModificareType }
     *     
     */
    public DomandaModificareType getDomandaType() {
        return domandaType;
    }

    /**
     * Sets the value of the domandaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomandaModificareType }
     *     
     */
    public void setDomandaType(DomandaModificareType value) {
        this.domandaType = value;
    }

}
