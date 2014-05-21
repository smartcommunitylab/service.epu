
package it.infotn.epu;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for categoria.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="categoria">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PATTIFUTURAVENDITA"/>
 *     &lt;enumeration value="FORZEORDINE"/>
 *     &lt;enumeration value="INQUILINIITEA"/>
 *     &lt;enumeration value="EXTRACOMUNITARI"/>
 *     &lt;enumeration value="COMUNITARI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "categoria")
@XmlEnum
public enum Categoria {

    PATTIFUTURAVENDITA,
    FORZEORDINE,
    INQUILINIITEA,
    EXTRACOMUNITARI,
    COMUNITARI;

    public String value() {
        return name();
    }

    public static Categoria fromValue(String v) {
        return valueOf(v);
    }

}
