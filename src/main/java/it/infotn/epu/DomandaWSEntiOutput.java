
package it.infotn.epu;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for domandaWSEntiOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="domandaWSEntiOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epu.infotn.it}esitoOutput">
 *       &lt;sequence>
 *         &lt;element name="enti" type="{http://epu.infotn.it}enteType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "domandaWSEntiOutput", propOrder = {
    "enti"
})
public class DomandaWSEntiOutput
    extends EsitoOutput
{

    @XmlElement(nillable = true)
    protected List<EnteType> enti;

    /**
     * Gets the value of the enti property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enti property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnti().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnteType }
     * 
     * 
     */
    public List<EnteType> getEnti() {
        if (enti == null) {
            enti = new ArrayList<EnteType>();
        }
        return this.enti;
    }

}
