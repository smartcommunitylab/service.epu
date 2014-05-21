
package it.infotn.epu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for domandaRegistrareType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="domandaRegistrareType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extracomunitariType" type="{http://epu.infotn.it}domandaExtracomunitariType" minOccurs="0"/>
 *         &lt;element name="idEdizioneFinanziata" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numeroDomandaICEF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="residenzaType" type="{http://epu.infotn.it}domandaResidenzaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "domandaRegistrareType", propOrder = {
    "extracomunitariType",
    "idEdizioneFinanziata",
    "numeroDomandaICEF",
    "residenzaType"
})
public class DomandaRegistrareType {

    protected DomandaExtracomunitariType extracomunitariType;
    protected Long idEdizioneFinanziata;
    protected String numeroDomandaICEF;
    protected DomandaResidenzaType residenzaType;

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
     * Gets the value of the idEdizioneFinanziata property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdEdizioneFinanziata() {
        return idEdizioneFinanziata;
    }

    /**
     * Sets the value of the idEdizioneFinanziata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdEdizioneFinanziata(Long value) {
        this.idEdizioneFinanziata = value;
    }

    /**
     * Gets the value of the numeroDomandaICEF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDomandaICEF() {
        return numeroDomandaICEF;
    }

    /**
     * Sets the value of the numeroDomandaICEF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDomandaICEF(String value) {
        this.numeroDomandaICEF = value;
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
