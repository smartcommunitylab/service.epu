
package it.infotn.epu;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoStampa.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoStampa">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SCHEDA_DOMANDA_CON_PUNTEGGIO"/>
 *     &lt;enumeration value="SCHEDA_PUNTEGGIO"/>
 *     &lt;enumeration value="SCHEDA_DOMANDA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoStampa")
@XmlEnum
public enum TipoStampa {

    SCHEDA_DOMANDA_CON_PUNTEGGIO,
    SCHEDA_PUNTEGGIO,
    SCHEDA_DOMANDA;

    public String value() {
        return name();
    }

    public static TipoStampa fromValue(String v) {
        return valueOf(v);
    }

}
