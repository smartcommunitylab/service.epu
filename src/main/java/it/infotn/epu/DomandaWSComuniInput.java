
package it.infotn.epu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for domandaWSComuniInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="domandaWSComuniInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epu.infotn.it}utenteInfoInput">
 *       &lt;sequence>
 *         &lt;element name="dataRiferimento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="descrizioneComune" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoGerarchia" type="{http://epu.infotn.it}tipoGerarchia" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "domandaWSComuniInput", propOrder = {
    "dataRiferimento",
    "descrizioneComune",
    "tipoGerarchia"
})
public class DomandaWSComuniInput
    extends UtenteInfoInput
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataRiferimento;
    protected String descrizioneComune;
    protected TipoGerarchia tipoGerarchia;

    /**
     * Gets the value of the dataRiferimento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataRiferimento() {
        return dataRiferimento;
    }

    /**
     * Sets the value of the dataRiferimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataRiferimento(XMLGregorianCalendar value) {
        this.dataRiferimento = value;
    }

    /**
     * Gets the value of the descrizioneComune property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneComune() {
        return descrizioneComune;
    }

    /**
     * Sets the value of the descrizioneComune property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneComune(String value) {
        this.descrizioneComune = value;
    }

    /**
     * Gets the value of the tipoGerarchia property.
     * 
     * @return
     *     possible object is
     *     {@link TipoGerarchia }
     *     
     */
    public TipoGerarchia getTipoGerarchia() {
        return tipoGerarchia;
    }

    /**
     * Sets the value of the tipoGerarchia property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoGerarchia }
     *     
     */
    public void setTipoGerarchia(TipoGerarchia value) {
        this.tipoGerarchia = value;
    }

}
