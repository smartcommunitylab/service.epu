
package it.infotn.epu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for edizioneFinanziataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="edizioneFinanziataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="categoria" type="{http://epu.infotn.it}categoria" minOccurs="0"/>
 *         &lt;element name="edizione" type="{http://epu.infotn.it}edizioneType" minOccurs="0"/>
 *         &lt;element name="ente" type="{http://epu.infotn.it}enteType" minOccurs="0"/>
 *         &lt;element name="idObj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "edizioneFinanziataType", propOrder = {
    "categoria",
    "edizione",
    "ente",
    "idObj"
})
public class EdizioneFinanziataType {

    protected Categoria categoria;
    protected EdizioneType edizione;
    protected EnteType ente;
    protected String idObj;

    /**
     * Gets the value of the categoria property.
     * 
     * @return
     *     possible object is
     *     {@link Categoria }
     *     
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * Sets the value of the categoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link Categoria }
     *     
     */
    public void setCategoria(Categoria value) {
        this.categoria = value;
    }

    /**
     * Gets the value of the edizione property.
     * 
     * @return
     *     possible object is
     *     {@link EdizioneType }
     *     
     */
    public EdizioneType getEdizione() {
        return edizione;
    }

    /**
     * Sets the value of the edizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link EdizioneType }
     *     
     */
    public void setEdizione(EdizioneType value) {
        this.edizione = value;
    }

    /**
     * Gets the value of the ente property.
     * 
     * @return
     *     possible object is
     *     {@link EnteType }
     *     
     */
    public EnteType getEnte() {
        return ente;
    }

    /**
     * Sets the value of the ente property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnteType }
     *     
     */
    public void setEnte(EnteType value) {
        this.ente = value;
    }

    /**
     * Gets the value of the idObj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdObj() {
        return idObj;
    }

    /**
     * Sets the value of the idObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdObj(String value) {
        this.idObj = value;
    }

}
