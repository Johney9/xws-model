//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.02 at 05:29:30 PM CEST 
//


package rs.ac.uns.ftn.xws.cbs.izvod;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for IzvodStavka complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IzvodStavka">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="duznik_nalogodavac" type="{http://www.ftn.uns.ac.rs/xws/cbs/tipovi}TNaziv"/>
 *         &lt;element name="svrha_placanja" type="{http://www.ftn.uns.ac.rs/xws/cbs/tipovi}TNaziv"/>
 *         &lt;element name="primalac_poverilac" type="{http://www.ftn.uns.ac.rs/xws/cbs/tipovi}TNaziv"/>
 *         &lt;element name="datum_naloga" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="datum_valute" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="racund_duznika" type="{http://www.ftn.uns.ac.rs/xws/cbs/tipovi}TRacun"/>
 *         &lt;element name="model_zaduzenja" type="{http://www.ftn.uns.ac.rs/xws/cbs/tipovi}TModel"/>
 *         &lt;element name="poziv_na_broj_zaduzenja" type="{http://www.ftn.uns.ac.rs/xws/cbs/tipovi}TPozivNaBroj"/>
 *         &lt;element name="racun_poverioca" type="{http://www.ftn.uns.ac.rs/xws/cbs/tipovi}TRacun"/>
 *         &lt;element name="model_odobrenja" type="{http://www.ftn.uns.ac.rs/xws/cbs/tipovi}TModel"/>
 *         &lt;element name="poziv_na_broj_odobrenja" type="{http://www.ftn.uns.ac.rs/xws/cbs/tipovi}TPozivNaBroj"/>
 *         &lt;element name="iznos" type="{http://www.ftn.uns.ac.rs/xws/cbs/tipovi}TIznos"/>
 *         &lt;element name="smer">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IzvodStavka", propOrder = {
    "duznikNalogodavac",
    "svrhaPlacanja",
    "primalacPoverilac",
    "datumNaloga",
    "datumValute",
    "racundDuznika",
    "modelZaduzenja",
    "pozivNaBrojZaduzenja",
    "racunPoverioca",
    "modelOdobrenja",
    "pozivNaBrojOdobrenja",
    "iznos",
    "smer"
})
public class IzvodStavka {

    @XmlElement(name = "duznik_nalogodavac", required = true)
    protected String duznikNalogodavac;
    @XmlElement(name = "svrha_placanja", required = true)
    protected String svrhaPlacanja;
    @XmlElement(name = "primalac_poverilac", required = true)
    protected String primalacPoverilac;
    @XmlElement(name = "datum_naloga", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumNaloga;
    @XmlElement(name = "datum_valute", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumValute;
    @XmlElement(name = "racund_duznika", required = true)
    protected String racundDuznika;
    @XmlElement(name = "model_zaduzenja", required = true)
    protected String modelZaduzenja;
    @XmlElement(name = "poziv_na_broj_zaduzenja", required = true)
    protected String pozivNaBrojZaduzenja;
    @XmlElement(name = "racun_poverioca", required = true)
    protected String racunPoverioca;
    @XmlElement(name = "model_odobrenja", required = true)
    protected String modelOdobrenja;
    @XmlElement(name = "poziv_na_broj_odobrenja", required = true)
    protected String pozivNaBrojOdobrenja;
    @XmlElement(required = true)
    protected BigDecimal iznos;
    @XmlElement(required = true)
    protected String smer;

    /**
     * Gets the value of the duznikNalogodavac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuznikNalogodavac() {
        return duznikNalogodavac;
    }

    /**
     * Sets the value of the duznikNalogodavac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuznikNalogodavac(String value) {
        this.duznikNalogodavac = value;
    }

    /**
     * Gets the value of the svrhaPlacanja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvrhaPlacanja() {
        return svrhaPlacanja;
    }

    /**
     * Sets the value of the svrhaPlacanja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvrhaPlacanja(String value) {
        this.svrhaPlacanja = value;
    }

    /**
     * Gets the value of the primalacPoverilac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimalacPoverilac() {
        return primalacPoverilac;
    }

    /**
     * Sets the value of the primalacPoverilac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimalacPoverilac(String value) {
        this.primalacPoverilac = value;
    }

    /**
     * Gets the value of the datumNaloga property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumNaloga() {
        return datumNaloga;
    }

    /**
     * Sets the value of the datumNaloga property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumNaloga(XMLGregorianCalendar value) {
        this.datumNaloga = value;
    }

    /**
     * Gets the value of the datumValute property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumValute() {
        return datumValute;
    }

    /**
     * Sets the value of the datumValute property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumValute(XMLGregorianCalendar value) {
        this.datumValute = value;
    }

    /**
     * Gets the value of the racundDuznika property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRacundDuznika() {
        return racundDuznika;
    }

    /**
     * Sets the value of the racundDuznika property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRacundDuznika(String value) {
        this.racundDuznika = value;
    }

    /**
     * Gets the value of the modelZaduzenja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelZaduzenja() {
        return modelZaduzenja;
    }

    /**
     * Sets the value of the modelZaduzenja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelZaduzenja(String value) {
        this.modelZaduzenja = value;
    }

    /**
     * Gets the value of the pozivNaBrojZaduzenja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPozivNaBrojZaduzenja() {
        return pozivNaBrojZaduzenja;
    }

    /**
     * Sets the value of the pozivNaBrojZaduzenja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPozivNaBrojZaduzenja(String value) {
        this.pozivNaBrojZaduzenja = value;
    }

    /**
     * Gets the value of the racunPoverioca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRacunPoverioca() {
        return racunPoverioca;
    }

    /**
     * Sets the value of the racunPoverioca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRacunPoverioca(String value) {
        this.racunPoverioca = value;
    }

    /**
     * Gets the value of the modelOdobrenja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelOdobrenja() {
        return modelOdobrenja;
    }

    /**
     * Sets the value of the modelOdobrenja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelOdobrenja(String value) {
        this.modelOdobrenja = value;
    }

    /**
     * Gets the value of the pozivNaBrojOdobrenja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPozivNaBrojOdobrenja() {
        return pozivNaBrojOdobrenja;
    }

    /**
     * Sets the value of the pozivNaBrojOdobrenja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPozivNaBrojOdobrenja(String value) {
        this.pozivNaBrojOdobrenja = value;
    }

    /**
     * Gets the value of the iznos property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIznos() {
        return iznos;
    }

    /**
     * Sets the value of the iznos property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIznos(BigDecimal value) {
        this.iznos = value;
    }

    /**
     * Gets the value of the smer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmer() {
        return smer;
    }

    /**
     * Sets the value of the smer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmer(String value) {
        this.smer = value;
    }

}
