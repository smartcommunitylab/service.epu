
package it.infotn.epu;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statoCivile.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="statoCivile">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GIA_CONIUGATO_A"/>
 *     &lt;enumeration value="VEDOVO_A"/>
 *     &lt;enumeration value="CONIUGATO_A"/>
 *     &lt;enumeration value="NUBILE_CELIBE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "statoCivile")
@XmlEnum
public enum StatoCivile {

    GIA_CONIUGATO_A,
    VEDOVO_A,
    CONIUGATO_A,
    NUBILE_CELIBE;

    public String value() {
        return name();
    }

    public static StatoCivile fromValue(String v) {
        return valueOf(v);
    }

}
