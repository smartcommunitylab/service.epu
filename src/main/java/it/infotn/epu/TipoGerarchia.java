
package it.infotn.epu;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoGerarchia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoGerarchia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="H_NAZ_PRO_COMP_COM_FRA"/>
 *     &lt;enumeration value="H_NAZ_PRO_COM_FRA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoGerarchia")
@XmlEnum
public enum TipoGerarchia {

    H_NAZ_PRO_COMP_COM_FRA,
    H_NAZ_PRO_COM_FRA;

    public String value() {
        return name();
    }

    public static TipoGerarchia fromValue(String v) {
        return valueOf(v);
    }

}
