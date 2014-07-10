
package com.adobe.idp.services.getpdf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConditionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConditionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EQUALS"/>
 *     &lt;enumeration value="GREATER_THAN"/>
 *     &lt;enumeration value="LESS_THAN"/>
 *     &lt;enumeration value="NOT_EQUALS"/>
 *     &lt;enumeration value="LIKE"/>
 *     &lt;enumeration value="GREATER_THAN_EQUALS"/>
 *     &lt;enumeration value="LESS_THAN_EQUALS"/>
 *     &lt;enumeration value="BEGINS_WITH"/>
 *     &lt;enumeration value="ENDS_WITH"/>
 *     &lt;enumeration value="CONTAINS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConditionEnum")
@XmlEnum
public enum ConditionEnum {

    EQUALS,
    GREATER_THAN,
    LESS_THAN,
    NOT_EQUALS,
    LIKE,
    GREATER_THAN_EQUALS,
    LESS_THAN_EQUALS,
    BEGINS_WITH,
    ENDS_WITH,
    CONTAINS;

    public String value() {
        return name();
    }

    public static ConditionEnum fromValue(String v) {
        return valueOf(v);
    }

}
