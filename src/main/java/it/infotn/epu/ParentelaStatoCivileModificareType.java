
package it.infotn.epu;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for parentelaStatoCivileModificareType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parentelaStatoCivileModificareType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="componenteModificareType" type="{http://epu.infotn.it}componenteParentelaStatoCivileModificareType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="idDomanda" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idObj" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parentelaStatoCivileModificareType", propOrder = {
    "componenteModificareType",
    "idDomanda",
    "idObj"
})
public class ParentelaStatoCivileModificareType {

    @XmlElement(nillable = true)
    protected List<ComponenteParentelaStatoCivileModificareType> componenteModificareType;
    protected Long idDomanda;
    protected Long idObj;

    /**
     * Gets the value of the componenteModificareType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the componenteModificareType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponenteModificareType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComponenteParentelaStatoCivileModificareType }
     * 
     * 
     */
    public List<ComponenteParentelaStatoCivileModificareType> getComponenteModificareType() {
        if (componenteModificareType == null) {
            componenteModificareType = new ArrayList<ComponenteParentelaStatoCivileModificareType>();
        }
        return this.componenteModificareType;
    }

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
     * Gets the value of the idObj property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdObj() {
        return idObj;
    }

    /**
     * Sets the value of the idObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdObj(Long value) {
        this.idObj = value;
    }

}
