
package it.infotn.epu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for variazioneComponenteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="variazioneComponenteType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epu.infotn.it}variazioneComponenteModificareType">
 *       &lt;sequence>
 *         &lt;element name="dataFine" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="decsrCittadinanza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idCittadinanza" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "variazioneComponenteType", propOrder = {
    "dataFine",
    "decsrCittadinanza",
    "idCittadinanza"
})
public class VariazioneComponenteType
    extends VariazioneComponenteModificareType
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataFine;
    protected String decsrCittadinanza;
    protected Long idCittadinanza;

    /**
     * Gets the value of the dataFine property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFine() {
        return dataFine;
    }

    /**
     * Sets the value of the dataFine property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFine(XMLGregorianCalendar value) {
        this.dataFine = value;
    }

    /**
     * Gets the value of the decsrCittadinanza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecsrCittadinanza() {
        return decsrCittadinanza;
    }

    /**
     * Sets the value of the decsrCittadinanza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecsrCittadinanza(String value) {
        this.decsrCittadinanza = value;
    }

    /**
     * Gets the value of the idCittadinanza property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdCittadinanza() {
        return idCittadinanza;
    }

    /**
     * Sets the value of the idCittadinanza property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdCittadinanza(Long value) {
        this.idCittadinanza = value;
    }

}
