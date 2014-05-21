
package it.infotn.epu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for domandaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="domandaType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epu.infotn.it}domandaBaseType">
 *       &lt;sequence>
 *         &lt;element name="alloggioOccupato" type="{http://epu.infotn.it}alloggioOccupatoType" minOccurs="0"/>
 *         &lt;element name="ambitoTerritoriale1" type="{http://epu.infotn.it}ambitoTerritorialeType" minOccurs="0"/>
 *         &lt;element name="extracomunitariType" type="{http://epu.infotn.it}domandaExtracomunitariType" minOccurs="0"/>
 *         &lt;element name="nucleo" type="{http://epu.infotn.it}nucleoFamiliareType" minOccurs="0"/>
 *         &lt;element name="residenzaType" type="{http://epu.infotn.it}domandaResidenzaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "domandaType", propOrder = {
    "alloggioOccupato",
    "ambitoTerritoriale1",
    "extracomunitariType",
    "nucleo",
    "residenzaType"
})
public class DomandaType
    extends DomandaBaseType
{

    protected AlloggioOccupatoType alloggioOccupato;
    protected AmbitoTerritorialeType ambitoTerritoriale1;
    protected DomandaExtracomunitariType extracomunitariType;
    protected NucleoFamiliareType nucleo;
    protected DomandaResidenzaType residenzaType;

    /**
     * Gets the value of the alloggioOccupato property.
     * 
     * @return
     *     possible object is
     *     {@link AlloggioOccupatoType }
     *     
     */
    public AlloggioOccupatoType getAlloggioOccupato() {
        return alloggioOccupato;
    }

    /**
     * Sets the value of the alloggioOccupato property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlloggioOccupatoType }
     *     
     */
    public void setAlloggioOccupato(AlloggioOccupatoType value) {
        this.alloggioOccupato = value;
    }

    /**
     * Gets the value of the ambitoTerritoriale1 property.
     * 
     * @return
     *     possible object is
     *     {@link AmbitoTerritorialeType }
     *     
     */
    public AmbitoTerritorialeType getAmbitoTerritoriale1() {
        return ambitoTerritoriale1;
    }

    /**
     * Sets the value of the ambitoTerritoriale1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmbitoTerritorialeType }
     *     
     */
    public void setAmbitoTerritoriale1(AmbitoTerritorialeType value) {
        this.ambitoTerritoriale1 = value;
    }

    /**
     * Gets the value of the extracomunitariType property.
     * 
     * @return
     *     possible object is
     *     {@link DomandaExtracomunitariType }
     *     
     */
    public DomandaExtracomunitariType getExtracomunitariType() {
        return extracomunitariType;
    }

    /**
     * Sets the value of the extracomunitariType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomandaExtracomunitariType }
     *     
     */
    public void setExtracomunitariType(DomandaExtracomunitariType value) {
        this.extracomunitariType = value;
    }

    /**
     * Gets the value of the nucleo property.
     * 
     * @return
     *     possible object is
     *     {@link NucleoFamiliareType }
     *     
     */
    public NucleoFamiliareType getNucleo() {
        return nucleo;
    }

    /**
     * Sets the value of the nucleo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NucleoFamiliareType }
     *     
     */
    public void setNucleo(NucleoFamiliareType value) {
        this.nucleo = value;
    }

    /**
     * Gets the value of the residenzaType property.
     * 
     * @return
     *     possible object is
     *     {@link DomandaResidenzaType }
     *     
     */
    public DomandaResidenzaType getResidenzaType() {
        return residenzaType;
    }

    /**
     * Sets the value of the residenzaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomandaResidenzaType }
     *     
     */
    public void setResidenzaType(DomandaResidenzaType value) {
        this.residenzaType = value;
    }

}
