
package it.infotn.epu;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for parentela.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="parentela">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALTRO_CONVIVENTE"/>
 *     &lt;enumeration value="PARENTE_34_GRADO"/>
 *     &lt;enumeration value="PARENTE_2_GRADO"/>
 *     &lt;enumeration value="PARENTE_1_GRADO"/>
 *     &lt;enumeration value="FIGLIO"/>
 *     &lt;enumeration value="CONVIVENTE_MORE_UXORIO"/>
 *     &lt;enumeration value="CONIUGE_NON_SEPARATO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "parentela")
@XmlEnum
public enum Parentela {

    ALTRO_CONVIVENTE,
    PARENTE_34_GRADO,
    PARENTE_2_GRADO,
    PARENTE_1_GRADO,
    FIGLIO,
    CONVIVENTE_MORE_UXORIO,
    CONIUGE_NON_SEPARATO;

    public String value() {
        return name();
    }

    public static Parentela fromValue(String v) {
        return valueOf(v);
    }

}
