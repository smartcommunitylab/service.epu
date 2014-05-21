
package it.infotn.epu;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoStrumento.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoStrumento">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL_PRIVATO_DISAGIO"/>
 *     &lt;enumeration value="ALL_PUBBLICO_DISAGIO"/>
 *     &lt;enumeration value="CANONE_MODERATO"/>
 *     &lt;enumeration value="LOCAZIONE_ALL_PUBBLICO"/>
 *     &lt;enumeration value="CONTRIBUTO_ALL_PRIVATO"/>
 *     &lt;enumeration value="GESTIONE_ALLOGGI"/>
 *     &lt;enumeration value="INQUILINI_ITEA"/>
 *     &lt;enumeration value="CONTRIBUTO_INTEGRATIVO_DISAGIO"/>
 *     &lt;enumeration value="LOCAZIONE_ALLOGGIO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoStrumento")
@XmlEnum
public enum TipoStrumento {

    ALL_PRIVATO_DISAGIO,
    ALL_PUBBLICO_DISAGIO,
    CANONE_MODERATO,
    LOCAZIONE_ALL_PUBBLICO,
    CONTRIBUTO_ALL_PRIVATO,
    GESTIONE_ALLOGGI,
    INQUILINI_ITEA,
    CONTRIBUTO_INTEGRATIVO_DISAGIO,
    LOCAZIONE_ALLOGGIO;

    public String value() {
        return name();
    }

    public static TipoStrumento fromValue(String v) {
        return valueOf(v);
    }

}
