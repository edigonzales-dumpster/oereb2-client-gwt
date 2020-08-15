//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.19 at 06:15:44 PM CEST 
//


package com.a9.opensearch._11;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.a9.opensearch._11 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TotalResults_QNAME = new QName("http://a9.com/-/spec/opensearch/1.1/", "totalResults");
    private final static QName _StartIndex_QNAME = new QName("http://a9.com/-/spec/opensearch/1.1/", "startIndex");
    private final static QName _ItemsPerPage_QNAME = new QName("http://a9.com/-/spec/opensearch/1.1/", "itemsPerPage");
    private final static QName _ShortName_QNAME = new QName("http://a9.com/-/spec/opensearch/1.1/", "ShortName");
    private final static QName _Description_QNAME = new QName("http://a9.com/-/spec/opensearch/1.1/", "Description");
    private final static QName _Tags_QNAME = new QName("http://a9.com/-/spec/opensearch/1.1/", "Tags");
    private final static QName _Contact_QNAME = new QName("http://a9.com/-/spec/opensearch/1.1/", "Contact");
    private final static QName _LongName_QNAME = new QName("http://a9.com/-/spec/opensearch/1.1/", "LongName");
    private final static QName _Developer_QNAME = new QName("http://a9.com/-/spec/opensearch/1.1/", "Developer");
    private final static QName _Attribution_QNAME = new QName("http://a9.com/-/spec/opensearch/1.1/", "Attribution");
    private final static QName _SyndicationRight_QNAME = new QName("http://a9.com/-/spec/opensearch/1.1/", "SyndicationRight");
    private final static QName _AdultContent_QNAME = new QName("http://a9.com/-/spec/opensearch/1.1/", "AdultContent");
    private final static QName _Language_QNAME = new QName("http://a9.com/-/spec/opensearch/1.1/", "Language");
    private final static QName _OutputEncoding_QNAME = new QName("http://a9.com/-/spec/opensearch/1.1/", "OutputEncoding");
    private final static QName _InputEncoding_QNAME = new QName("http://a9.com/-/spec/opensearch/1.1/", "InputEncoding");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.a9.opensearch._11
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OpenSearchDescription }
     * 
     */
    public OpenSearchDescription createOpenSearchDescription() {
        return new OpenSearchDescription();
    }

    /**
     * Create an instance of {@link Url }
     * 
     */
    public Url createUrl() {
        return new Url();
    }

    /**
     * Create an instance of {@link Image }
     * 
     */
    public Image createImage() {
        return new Image();
    }

    /**
     * Create an instance of {@link Query }
     * 
     */
    public Query createQuery() {
        return new Query();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://a9.com/-/spec/opensearch/1.1/", name = "totalResults")
    public JAXBElement<BigInteger> createTotalResults(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalResults_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://a9.com/-/spec/opensearch/1.1/", name = "startIndex")
    public JAXBElement<BigInteger> createStartIndex(BigInteger value) {
        return new JAXBElement<BigInteger>(_StartIndex_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://a9.com/-/spec/opensearch/1.1/", name = "itemsPerPage")
    public JAXBElement<BigInteger> createItemsPerPage(BigInteger value) {
        return new JAXBElement<BigInteger>(_ItemsPerPage_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://a9.com/-/spec/opensearch/1.1/", name = "ShortName")
    public JAXBElement<String> createShortName(String value) {
        return new JAXBElement<String>(_ShortName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://a9.com/-/spec/opensearch/1.1/", name = "Description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://a9.com/-/spec/opensearch/1.1/", name = "Tags")
    public JAXBElement<String> createTags(String value) {
        return new JAXBElement<String>(_Tags_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://a9.com/-/spec/opensearch/1.1/", name = "Contact")
    public JAXBElement<String> createContact(String value) {
        return new JAXBElement<String>(_Contact_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://a9.com/-/spec/opensearch/1.1/", name = "LongName")
    public JAXBElement<String> createLongName(String value) {
        return new JAXBElement<String>(_LongName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://a9.com/-/spec/opensearch/1.1/", name = "Developer")
    public JAXBElement<String> createDeveloper(String value) {
        return new JAXBElement<String>(_Developer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://a9.com/-/spec/opensearch/1.1/", name = "Attribution")
    public JAXBElement<String> createAttribution(String value) {
        return new JAXBElement<String>(_Attribution_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://a9.com/-/spec/opensearch/1.1/", name = "SyndicationRight", defaultValue = "open")
    public JAXBElement<String> createSyndicationRight(String value) {
        return new JAXBElement<String>(_SyndicationRight_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://a9.com/-/spec/opensearch/1.1/", name = "AdultContent")
    public JAXBElement<String> createAdultContent(String value) {
        return new JAXBElement<String>(_AdultContent_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://a9.com/-/spec/opensearch/1.1/", name = "Language")
    public JAXBElement<String> createLanguage(String value) {
        return new JAXBElement<String>(_Language_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://a9.com/-/spec/opensearch/1.1/", name = "OutputEncoding", defaultValue = "UTF-8")
    public JAXBElement<String> createOutputEncoding(String value) {
        return new JAXBElement<String>(_OutputEncoding_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://a9.com/-/spec/opensearch/1.1/", name = "InputEncoding", defaultValue = "UTF-8")
    public JAXBElement<String> createInputEncoding(String value) {
        return new JAXBElement<String>(_InputEncoding_QNAME, String.class, null, value);
    }

}
