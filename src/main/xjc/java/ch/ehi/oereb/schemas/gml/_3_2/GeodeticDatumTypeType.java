//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.28 at 05:34:43 PM CEST 
//


package ch.ehi.oereb.schemas.gml._3_2;

import java.io.Serializable;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeodeticDatumType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeodeticDatumType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractDatumType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}primeMeridian"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}ellipsoid"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeodeticDatumType", propOrder = {
    "primeMeridian",
    "ellipsoid"
})
public class GeodeticDatumTypeType
    extends AbstractDatumTypeType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementRef(name = "primeMeridian", namespace = "http://www.opengis.net/gml/3.2", type = PrimeMeridian.class)
    protected JAXBElement<PrimeMeridianPropertyTypeType> primeMeridian;
    @XmlElementRef(name = "ellipsoid", namespace = "http://www.opengis.net/gml/3.2", type = Ellipsoid.class)
    protected JAXBElement<EllipsoidPropertyTypeType> ellipsoid;

    /**
     * Gets the value of the primeMeridian property.
     * 
     * @return
     *     possible object is
     *     {@link PrimeMeridian }
     *     {@link UsesPrimeMeridian }
     *     
     */
    public JAXBElement<PrimeMeridianPropertyTypeType> getPrimeMeridian() {
        return primeMeridian;
    }

    /**
     * Sets the value of the primeMeridian property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimeMeridian }
     *     {@link UsesPrimeMeridian }
     *     
     */
    public void setPrimeMeridian(JAXBElement<PrimeMeridianPropertyTypeType> value) {
        this.primeMeridian = value;
    }

    /**
     * Gets the value of the ellipsoid property.
     * 
     * @return
     *     possible object is
     *     {@link UsesEllipsoid }
     *     {@link Ellipsoid }
     *     
     */
    public JAXBElement<EllipsoidPropertyTypeType> getEllipsoid() {
        return ellipsoid;
    }

    /**
     * Sets the value of the ellipsoid property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsesEllipsoid }
     *     {@link Ellipsoid }
     *     
     */
    public void setEllipsoid(JAXBElement<EllipsoidPropertyTypeType> value) {
        this.ellipsoid = value;
    }

}
