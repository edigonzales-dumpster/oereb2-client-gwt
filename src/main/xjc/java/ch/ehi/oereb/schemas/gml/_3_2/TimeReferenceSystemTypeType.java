//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.28 at 05:34:43 PM CEST 
//


package ch.ehi.oereb.schemas.gml._3_2;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeReferenceSystemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeReferenceSystemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}DefinitionType">
 *       &lt;sequence>
 *         &lt;element name="domainOfValidity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeReferenceSystemType", propOrder = {
    "domainOfValidity"
})
@XmlSeeAlso({
    TimeOrdinalReferenceSystemTypeType.class,
    TimeCoordinateSystemTypeType.class,
    TimeClockTypeType.class,
    TimeCalendarTypeType.class
})
public class TimeReferenceSystemTypeType
    extends DefinitionTypeType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String domainOfValidity;

    /**
     * Gets the value of the domainOfValidity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainOfValidity() {
        return domainOfValidity;
    }

    /**
     * Sets the value of the domainOfValidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainOfValidity(String value) {
        this.domainOfValidity = value;
    }

}
