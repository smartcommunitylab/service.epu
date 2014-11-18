
package it.infotn.epu;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for domandaWSEdizioniFinanziateOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="domandaWSEdizioniFinanziateOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epu.infotn.it}esitoOutput">
 *       &lt;sequence>
 *         &lt;element name="edizioneFinanziata" type="{http://epu.infotn.it}edizioneFinanziataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "domandaWSEdizioniFinanziateOutput", propOrder = {
    "edizioneFinanziata"
})
public class DomandaWSEdizioniFinanziateOutput
    extends EsitoOutput
{

    @XmlElement(nillable = true)
    protected List<EdizioneFinanziataType> edizioneFinanziata;

    /**
     * Gets the value of the edizioneFinanziata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the edizioneFinanziata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEdizioneFinanziata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EdizioneFinanziataType }
     * 
     * 
     */
    public List<EdizioneFinanziataType> getEdizioneFinanziata() {
        if (edizioneFinanziata == null) {
            edizioneFinanziata = new ArrayList<EdizioneFinanziataType>();
        }
        return this.edizioneFinanziata;
    }

}
