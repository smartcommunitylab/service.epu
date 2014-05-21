
package it.infotn.epu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for componenteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="componenteType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epu.infotn.it}componenteBaseType">
 *       &lt;sequence>
 *         &lt;element name="persona" type="{http://epu.infotn.it}personaType" minOccurs="0"/>
 *         &lt;element name="variazioniComponente" type="{http://epu.infotn.it}variazioneComponenteType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "componenteType", propOrder = {
    "persona",
    "variazioniComponente"
})
public class ComponenteType
    extends ComponenteBaseType
{

    protected PersonaType persona;
    protected VariazioneComponenteType variazioniComponente;

    /**
     * Gets the value of the persona property.
     * 
     * @return
     *     possible object is
     *     {@link PersonaType }
     *     
     */
    public PersonaType getPersona() {
        return persona;
    }

    /**
     * Sets the value of the persona property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonaType }
     *     
     */
    public void setPersona(PersonaType value) {
        this.persona = value;
    }

    /**
     * Gets the value of the variazioniComponente property.
     * 
     * @return
     *     possible object is
     *     {@link VariazioneComponenteType }
     *     
     */
    public VariazioneComponenteType getVariazioniComponente() {
        return variazioniComponente;
    }

    /**
     * Sets the value of the variazioniComponente property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariazioneComponenteType }
     *     
     */
    public void setVariazioniComponente(VariazioneComponenteType value) {
        this.variazioniComponente = value;
    }

}
