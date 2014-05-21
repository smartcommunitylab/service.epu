
package it.infotn.epu;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for esitoOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="esitoOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="esito" type="{http://epu.infotn.it}esito" minOccurs="0"/>
 *         &lt;element name="segnalazione" type="{http://epu.infotn.it}segnalazioneType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "esitoOutput", propOrder = {
    "esito",
    "segnalazione"
})
@XmlSeeAlso({
    DomandaWSConsolidaOutput.class,
    DomandaWSEliminaOutput.class,
    DomandaWSEdizioniFinanziateOutput.class,
    DomandaWSCaricaOutput.class,
    DomandaWSComuniOutput.class,
    DomandaWSRicercaOutput.class,
    DomandaWSEntiOutput.class,
    DomandaWSModificaOutput.class,
    DomandaWSRegistraOutput.class,
    DomandaWSStampaOutput.class,
    DomandaWSAmbitiTerritorialiOutput.class
})
public class EsitoOutput {

    protected Esito esito;
    @XmlElement(nillable = true)
    protected List<SegnalazioneType> segnalazione;

    /**
     * Gets the value of the esito property.
     * 
     * @return
     *     possible object is
     *     {@link Esito }
     *     
     */
    public Esito getEsito() {
        return esito;
    }

    /**
     * Sets the value of the esito property.
     * 
     * @param value
     *     allowed object is
     *     {@link Esito }
     *     
     */
    public void setEsito(Esito value) {
        this.esito = value;
    }

    /**
     * Gets the value of the segnalazione property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segnalazione property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegnalazione().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegnalazioneType }
     * 
     * 
     */
    public List<SegnalazioneType> getSegnalazione() {
        if (segnalazione == null) {
            segnalazione = new ArrayList<SegnalazioneType>();
        }
        return this.segnalazione;
    }

}
