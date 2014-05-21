
package it.infotn.epu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for strumentoInterventoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="strumentoInterventoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idobj" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="tipoStrumento" type="{http://epu.infotn.it}tipoStrumento" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "strumentoInterventoType", propOrder = {
    "descrizione",
    "idobj",
    "tipoStrumento"
})
public class StrumentoInterventoType {

    protected String descrizione;
    protected Long idobj;
    protected TipoStrumento tipoStrumento;

    /**
     * Gets the value of the descrizione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizione() {
        return descrizione;
    }

    /**
     * Sets the value of the descrizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizione(String value) {
        this.descrizione = value;
    }

    /**
     * Gets the value of the idobj property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdobj() {
        return idobj;
    }

    /**
     * Sets the value of the idobj property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdobj(Long value) {
        this.idobj = value;
    }

    /**
     * Gets the value of the tipoStrumento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoStrumento }
     *     
     */
    public TipoStrumento getTipoStrumento() {
        return tipoStrumento;
    }

    /**
     * Sets the value of the tipoStrumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoStrumento }
     *     
     */
    public void setTipoStrumento(TipoStrumento value) {
        this.tipoStrumento = value;
    }

}
