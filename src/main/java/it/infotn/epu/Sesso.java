
package it.infotn.epu;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sesso.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="sesso">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Feminile"/>
 *     &lt;enumeration value="Maschile"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "sesso")
@XmlEnum
public enum Sesso {

    @XmlEnumValue("Feminile")
    FEMINILE("Feminile"),
    @XmlEnumValue("Maschile")
    MASCHILE("Maschile");
    private final String value;

    Sesso(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Sesso fromValue(String v) {
        for (Sesso c: Sesso.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
