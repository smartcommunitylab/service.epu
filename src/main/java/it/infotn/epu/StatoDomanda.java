
package it.infotn.epu;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statoDomanda.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="statoDomanda">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CHIUSA"/>
 *     &lt;enumeration value="AMMESSA"/>
 *     &lt;enumeration value="NON_IDONEA"/>
 *     &lt;enumeration value="RITIRATA"/>
 *     &lt;enumeration value="IDONEA"/>
 *     &lt;enumeration value="PROVVISORIA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "statoDomanda")
@XmlEnum
public enum StatoDomanda {

    CHIUSA,
    AMMESSA,
    NON_IDONEA,
    RITIRATA,
    IDONEA,
    PROVVISORIA;

    public String value() {
        return name();
    }

    public static StatoDomanda fromValue(String v) {
        return valueOf(v);
    }

}
