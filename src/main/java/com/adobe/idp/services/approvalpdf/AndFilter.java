
package com.adobe.idp.services.approvalpdf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AndFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AndFilter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://adobe.com/idp/services}PurgeFilter">
 *       &lt;sequence>
 *         &lt;element name="leftFilter" type="{http://adobe.com/idp/services}PurgeFilter"/>
 *         &lt;element name="rightFilter" type="{http://adobe.com/idp/services}PurgeFilter"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AndFilter", propOrder = {
    "leftFilter",
    "rightFilter"
})
public class AndFilter
    extends PurgeFilter
{

    @XmlElement(required = true, nillable = true)
    protected PurgeFilter leftFilter;
    @XmlElement(required = true, nillable = true)
    protected PurgeFilter rightFilter;

    /**
     * Gets the value of the leftFilter property.
     * 
     * @return
     *     possible object is
     *     {@link PurgeFilter }
     *     
     */
    public PurgeFilter getLeftFilter() {
        return leftFilter;
    }

    /**
     * Sets the value of the leftFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurgeFilter }
     *     
     */
    public void setLeftFilter(PurgeFilter value) {
        this.leftFilter = value;
    }

    /**
     * Gets the value of the rightFilter property.
     * 
     * @return
     *     possible object is
     *     {@link PurgeFilter }
     *     
     */
    public PurgeFilter getRightFilter() {
        return rightFilter;
    }

    /**
     * Sets the value of the rightFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurgeFilter }
     *     
     */
    public void setRightFilter(PurgeFilter value) {
        this.rightFilter = value;
    }

}
