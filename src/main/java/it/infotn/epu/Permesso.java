
package it.infotn.epu;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for permesso.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="permesso">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="soggiorno"/>
 *     &lt;enumeration value="ce"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "permesso")
@XmlEnum
public enum Permesso {

    @XmlEnumValue("soggiorno")
    SOGGIORNO("soggiorno"),
    @XmlEnumValue("ce")
    CE("ce");
    private final String value;

    Permesso(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Permesso fromValue(String v) {
        for (Permesso c: Permesso.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
