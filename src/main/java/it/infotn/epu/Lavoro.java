
package it.infotn.epu;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lavoro.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="lavoro">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="collocamento"/>
 *     &lt;enumeration value="lavoro"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "lavoro")
@XmlEnum
public enum Lavoro {

    @XmlEnumValue("collocamento")
    COLLOCAMENTO("collocamento"),
    @XmlEnumValue("lavoro")
    LAVORO("lavoro");
    private final String value;

    Lavoro(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Lavoro fromValue(String v) {
        for (Lavoro c: Lavoro.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
