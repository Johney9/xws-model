//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.03 at 03:36:14 AM CET 
//


package rs.ac.uns.ftn.xws.cbs.mt910;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the rs.ac.uns.ftn.xws.cbs.mt910 package. 
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

    private final static QName _Mt910_QNAME = new QName("http://www.ftn.uns.ac.rs/xws/cbs/mt910", "mt910");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: rs.ac.uns.ftn.xws.cbs.mt910
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MT910 }
     * 
     */
    public MT910 createMT910() {
        return new MT910();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MT910 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ftn.uns.ac.rs/xws/cbs/mt910", name = "mt910")
    public JAXBElement<MT910> createMt910(MT910 value) {
        return new JAXBElement<MT910>(_Mt910_QNAME, MT910 .class, null, value);
    }

}
