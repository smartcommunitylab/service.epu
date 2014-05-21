
package it.infotn.epu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for domandaExtracomunitariType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="domandaExtracomunitariType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lavoro" type="{http://epu.infotn.it}lavoro" minOccurs="0"/>
 *         &lt;element name="permesso" type="{http://epu.infotn.it}permesso" minOccurs="0"/>
 *         &lt;element name="ricevutaPermessoSoggiorno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scadenzaPermessoSoggiorno" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "domandaExtracomunitariType", propOrder = {
    "lavoro",
    "permesso",
    "ricevutaPermessoSoggiorno",
    "scadenzaPermessoSoggiorno"
})
public class DomandaExtracomunitariType {

    protected Lavoro lavoro;
    protected Permesso permesso;
    protected String ricevutaPermessoSoggiorno;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scadenzaPermessoSoggiorno;

    /**
     * Gets the value of the lavoro property.
     * 
     * @return
     *     possible object is
     *     {@link Lavoro }
     *     
     */
    public Lavoro getLavoro() {
        return lavoro;
    }

    /**
     * Sets the value of the lavoro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lavoro }
     *     
     */
    public void setLavoro(Lavoro value) {
        this.lavoro = value;
    }

    /**
     * Gets the value of the permesso property.
     * 
     * @return
     *     possible object is
     *     {@link Permesso }
     *     
     */
    public Permesso getPermesso() {
        return permesso;
    }

    /**
     * Sets the value of the permesso property.
     * 
     * @param value
     *     allowed object is
     *     {@link Permesso }
     *     
     */
    public void setPermesso(Permesso value) {
        this.permesso = value;
    }

    /**
     * Gets the value of the ricevutaPermessoSoggiorno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRicevutaPermessoSoggiorno() {
        return ricevutaPermessoSoggiorno;
    }

    /**
     * Sets the value of the ricevutaPermessoSoggiorno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRicevutaPermessoSoggiorno(String value) {
        this.ricevutaPermessoSoggiorno = value;
    }

    /**
     * Gets the value of the scadenzaPermessoSoggiorno property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScadenzaPermessoSoggiorno() {
        return scadenzaPermessoSoggiorno;
    }

    /**
     * Sets the value of the scadenzaPermessoSoggiorno property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScadenzaPermessoSoggiorno(XMLGregorianCalendar value) {
        this.scadenzaPermessoSoggiorno = value;
    }

}
