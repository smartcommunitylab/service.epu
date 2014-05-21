
package it.infotn.epu;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for categoriaInvalidita.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="categoriaInvalidita">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CategoriaInvalida4"/>
 *     &lt;enumeration value="CategoriaInvalida3"/>
 *     &lt;enumeration value="CategoriaInvalida2"/>
 *     &lt;enumeration value="CategoriaInvalida1"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "categoriaInvalidita")
@XmlEnum
public enum CategoriaInvalidita {

    @XmlEnumValue("CategoriaInvalida4")
    CATEGORIA_INVALIDA_4("CategoriaInvalida4"),
    @XmlEnumValue("CategoriaInvalida3")
    CATEGORIA_INVALIDA_3("CategoriaInvalida3"),
    @XmlEnumValue("CategoriaInvalida2")
    CATEGORIA_INVALIDA_2("CategoriaInvalida2"),
    @XmlEnumValue("CategoriaInvalida1")
    CATEGORIA_INVALIDA_1("CategoriaInvalida1");
    private final String value;

    CategoriaInvalidita(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CategoriaInvalidita fromValue(String v) {
        for (CategoriaInvalidita c: CategoriaInvalidita.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
