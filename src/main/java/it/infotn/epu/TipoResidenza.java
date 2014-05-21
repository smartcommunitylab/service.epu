
package it.infotn.epu;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoResidenza.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoResidenza">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALLOGGIO_INIDONEO"/>
 *     &lt;enumeration value="ALLOGGIO_IMPROPRIAMENTE_ADIBITO"/>
 *     &lt;enumeration value="ALLOGGIO_PRIVO_SERVIZI"/>
 *     &lt;enumeration value="NORMALE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoResidenza")
@XmlEnum
public enum TipoResidenza {

    ALLOGGIO_INIDONEO,
    ALLOGGIO_IMPROPRIAMENTE_ADIBITO,
    ALLOGGIO_PRIVO_SERVIZI,
    NORMALE;

    public String value() {
        return name();
    }

    public static TipoResidenza fromValue(String v) {
        return valueOf(v);
    }

}
