
package it.infotn.epu;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contratto.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="contratto">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CANONE_LIBERO"/>
 *     &lt;enumeration value="CANONE_CONCORDATO"/>
 *     &lt;enumeration value="NESSUNO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "contratto")
@XmlEnum
public enum Contratto {

    CANONE_LIBERO,
    CANONE_CONCORDATO,
    NESSUNO;

    public String value() {
        return name();
    }

    public static Contratto fromValue(String v) {
        return valueOf(v);
    }

}
