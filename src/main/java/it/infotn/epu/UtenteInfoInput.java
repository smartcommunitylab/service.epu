
package it.infotn.epu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for utenteInfoInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="utenteInfoInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idEnte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userIdentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "utenteInfoInput", propOrder = {
    "idEnte",
    "userIdentity"
})
@XmlSeeAlso({
    DomandaWSStampaInput.class,
    DomandaWSRicercaInput.class,
    DomandaWSModificaInput.class,
    DomandaWSComuniInput.class,
    DomandaWSEliminaInput.class,
    DomandaWSCaricaInput.class,
    DomandaWSConsolidaInput.class,
    DomandaWSEdizioniFinanziateInput.class,
    DomandaWSAmbitiTerritorialiInput.class,
    DomandaWSRegistraInput.class
})
public class UtenteInfoInput {

    protected String idEnte;
    protected String userIdentity;

    /**
     * Gets the value of the idEnte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdEnte() {
        return idEnte;
    }

    /**
     * Sets the value of the idEnte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdEnte(String value) {
        this.idEnte = value;
    }

    /**
     * Gets the value of the userIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserIdentity() {
        return userIdentity;
    }

    /**
     * Sets the value of the userIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserIdentity(String value) {
        this.userIdentity = value;
    }

}
