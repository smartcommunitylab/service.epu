
package it.infotn.epu;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for domandaWSRicercaOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="domandaWSRicercaOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epu.infotn.it}esitoOutput">
 *       &lt;sequence>
 *         &lt;element name="domanda" type="{http://epu.infotn.it}domandaRicercaType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "domandaWSRicercaOutput", propOrder = {
    "domanda"
})
public class DomandaWSRicercaOutput
    extends EsitoOutput
{

    @XmlElement(nillable = true)
    protected List<DomandaRicercaType> domanda;

    /**
     * Gets the value of the domanda property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the domanda property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDomanda().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DomandaRicercaType }
     * 
     * 
     */
    public List<DomandaRicercaType> getDomanda() {
        if (domanda == null) {
            domanda = new ArrayList<DomandaRicercaType>();
        }
        return this.domanda;
    }

}
