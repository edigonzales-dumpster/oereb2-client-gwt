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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoordinateSystemAxisType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoordinateSystemAxisType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}IdentifiedObjectType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}axisAbbrev"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}axisDirection"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}minimumValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}maximumValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}rangeMeaning" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uom" use="required" type="{http://www.opengis.net/gml/3.2}UomIdentifier" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoordinateSystemAxisType", propOrder = {
    "axisAbbrev",
    "axisDirection",
    "minimumValue",
    "maximumValue",
    "rangeMeaning"
})
public class CoordinateSystemAxisTypeType
    extends IdentifiedObjectTypeType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementRef(name = "axisAbbrev", namespace = "http://www.opengis.net/gml/3.2", type = AxisAbbrev.class)
    protected AxisAbbrev axisAbbrev;
    @XmlElementRef(name = "axisDirection", namespace = "http://www.opengis.net/gml/3.2", type = AxisDirection.class)
    protected AxisDirection axisDirection;
    @XmlElementRef(name = "minimumValue", namespace = "http://www.opengis.net/gml/3.2", type = MinimumValue.class, required = false)
    protected MinimumValue minimumValue;
    @XmlElementRef(name = "maximumValue", namespace = "http://www.opengis.net/gml/3.2", type = MaximumValue.class, required = false)
    protected MaximumValue maximumValue;
    @XmlElementRef(name = "rangeMeaning", namespace = "http://www.opengis.net/gml/3.2", type = RangeMeaning.class, required = false)
    protected RangeMeaning rangeMeaning;
    @XmlAttribute(name = "uom", required = true)
    protected String uom;

    /**
     * Gets the value of the axisAbbrev property.
     * 
     * @return
     *     possible object is
     *     {@link AxisAbbrev }
     *     
     */
    public AxisAbbrev getAxisAbbrev() {
        return axisAbbrev;
    }

    /**
     * Sets the value of the axisAbbrev property.
     * 
     * @param value
     *     allowed object is
     *     {@link AxisAbbrev }
     *     
     */
    public void setAxisAbbrev(AxisAbbrev value) {
        this.axisAbbrev = value;
    }

    /**
     * Gets the value of the axisDirection property.
     * 
     * @return
     *     possible object is
     *     {@link AxisDirection }
     *     
     */
    public AxisDirection getAxisDirection() {
        return axisDirection;
    }

    /**
     * Sets the value of the axisDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link AxisDirection }
     *     
     */
    public void setAxisDirection(AxisDirection value) {
        this.axisDirection = value;
    }

    /**
     * Gets the value of the minimumValue property.
     * 
     * @return
     *     possible object is
     *     {@link MinimumValue }
     *     
     */
    public MinimumValue getMinimumValue() {
        return minimumValue;
    }

    /**
     * Sets the value of the minimumValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumValue }
     *     
     */
    public void setMinimumValue(MinimumValue value) {
        this.minimumValue = value;
    }

    /**
     * Gets the value of the maximumValue property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumValue }
     *     
     */
    public MaximumValue getMaximumValue() {
        return maximumValue;
    }

    /**
     * Sets the value of the maximumValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumValue }
     *     
     */
    public void setMaximumValue(MaximumValue value) {
        this.maximumValue = value;
    }

    /**
     * Gets the value of the rangeMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link RangeMeaning }
     *     
     */
    public RangeMeaning getRangeMeaning() {
        return rangeMeaning;
    }

    /**
     * Sets the value of the rangeMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeMeaning }
     *     
     */
    public void setRangeMeaning(RangeMeaning value) {
        this.rangeMeaning = value;
    }

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUom() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUom(String value) {
        this.uom = value;
    }

}