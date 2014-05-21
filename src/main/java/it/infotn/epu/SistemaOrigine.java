
package it.infotn.epu;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sistemaOrigine.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="sistemaOrigine">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ICEF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "sistemaOrigine")
@XmlEnum
public enum SistemaOrigine {

    ICEF;

    public String value() {
        return name();
    }

    public static SistemaOrigine fromValue(String v) {
        return valueOf(v);
    }

}
