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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimePeriodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimePeriodType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractTimeGeometricPrimitiveType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="beginPosition" type="{http://www.opengis.net/gml/3.2}TimePositionType"/>
 *           &lt;element name="begin" type="{http://www.opengis.net/gml/3.2}TimeInstantPropertyType"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="endPosition" type="{http://www.opengis.net/gml/3.2}TimePositionType"/>
 *           &lt;element name="end" type="{http://www.opengis.net/gml/3.2}TimeInstantPropertyType"/>
 *         &lt;/choice>
 *         &lt;group ref="{http://www.opengis.net/gml/3.2}timeLength" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimePeriodType", propOrder = {
    "beginPosition",
    "begin",
    "endPosition",
    "end",
    "duration",
    "timeInterval"
})
public class TimePeriodTypeType
    extends AbstractTimeGeometricPrimitiveTypeType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected TimePositionTypeType beginPosition;
    protected TimeInstantPropertyTypeType begin;
    protected TimePositionTypeType endPosition;
    protected TimeInstantPropertyTypeType end;
    @XmlElementRef(name = "duration", namespace = "http://www.opengis.net/gml/3.2", type = Duration.class, required = false)
    protected Duration duration;
    @XmlElementRef(name = "timeInterval", namespace = "http://www.opengis.net/gml/3.2", type = TimeInterval.class, required = false)
    protected TimeInterval timeInterval;

    /**
     * Gets the value of the beginPosition property.
     * 
     * @return
     *     possible object is
     *     {@link TimePositionTypeType }
     *     
     */
    public TimePositionTypeType getBeginPosition() {
        return beginPosition;
    }

    /**
     * Sets the value of the beginPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePositionTypeType }
     *     
     */
    public void setBeginPosition(TimePositionTypeType value) {
        this.beginPosition = value;
    }

    /**
     * Gets the value of the begin property.
     * 
     * @return
     *     possible object is
     *     {@link TimeInstantPropertyTypeType }
     *     
     */
    public TimeInstantPropertyTypeType getBegin() {
        return begin;
    }

    /**
     * Sets the value of the begin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInstantPropertyTypeType }
     *     
     */
    public void setBegin(TimeInstantPropertyTypeType value) {
        this.begin = value;
    }

    /**
     * Gets the value of the endPosition property.
     * 
     * @return
     *     possible object is
     *     {@link TimePositionTypeType }
     *     
     */
    public TimePositionTypeType getEndPosition() {
        return endPosition;
    }

    /**
     * Sets the value of the endPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePositionTypeType }
     *     
     */
    public void setEndPosition(TimePositionTypeType value) {
        this.endPosition = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link TimeInstantPropertyTypeType }
     *     
     */
    public TimeInstantPropertyTypeType getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInstantPropertyTypeType }
     *     
     */
    public void setEnd(TimeInstantPropertyTypeType value) {
        this.end = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * Gets the value of the timeInterval property.
     * 
     * @return
     *     possible object is
     *     {@link TimeInterval }
     *     
     */
    public TimeInterval getTimeInterval() {
        return timeInterval;
    }

    /**
     * Sets the value of the timeInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInterval }
     *     
     */
    public void setTimeInterval(TimeInterval value) {
        this.timeInterval = value;
    }

}