//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.12 at 04:51:17 AM CEST 
//


package rs.ac.uns.ftn.xws.cbs.banka_app_mapper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_swift_banke" type="{http://www.ftn.uns.ac.rs/xws/cbs/tipovi}TSWIFT" form="qualified"/>
 *         &lt;element name="naziv_aplikacije" type="{http://www.w3.org/2001/XMLSchema}Name"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idSwiftBanke",
    "nazivAplikacije"
})
@XmlRootElement(name = "banka_app_mapper")
public class BankaAppMapper {

    @XmlElement(name = "id_swift_banke", required = true)
    protected String idSwiftBanke;
    @XmlElement(name = "naziv_aplikacije", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "Name")
    protected String nazivAplikacije;

    /**
     * Gets the value of the idSwiftBanke property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSwiftBanke() {
        return idSwiftBanke;
    }

    /**
     * Sets the value of the idSwiftBanke property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSwiftBanke(String value) {
        this.idSwiftBanke = value;
    }

    /**
     * Gets the value of the nazivAplikacije property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazivAplikacije() {
        return nazivAplikacije;
    }

    /**
     * Sets the value of the nazivAplikacije property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazivAplikacije(String value) {
        this.nazivAplikacije = value;
    }

}
