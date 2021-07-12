//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.09.03 at 08:29:45 AM AEST 
//


package au.csiro.fhir.transform.xml.dmd.v2_3.amp;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AmpType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmpType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="APID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="INVALID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="VPID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="NM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ABBREVNM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DESC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NMDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="NM_PREV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SUPPCD" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="LIC_AUTHCD" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="LIC_AUTH_PREVCD" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="LIC_AUTHCHANGECD" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="LIC_AUTHCHANGEDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="COMBPRODCD" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="FLAVOURCD" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="EMA" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="PARALLEL_IMPORT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="AVAIL_RESTRICTCD" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmpType", propOrder = {

})
public class AmpType {

    @XmlElement(name = "APID", required = true)
    protected BigInteger apid;
    @XmlElement(name = "INVALID")
    protected BigInteger invalid;
    @XmlElement(name = "VPID", required = true)
    protected BigInteger vpid;
    @XmlElement(name = "NM", required = true)
    protected String nm;
    @XmlElement(name = "ABBREVNM")
    protected String abbrevnm;
    @XmlElement(name = "DESC", required = true)
    protected String desc;
    @XmlElement(name = "NMDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nmdt;
    @XmlElement(name = "NM_PREV")
    protected String nmprev;
    @XmlElement(name = "SUPPCD", required = true)
    protected BigInteger suppcd;
    @XmlElement(name = "LIC_AUTHCD", required = true)
    protected BigInteger licauthcd;
    @XmlElement(name = "LIC_AUTH_PREVCD")
    protected BigInteger licauthprevcd;
    @XmlElement(name = "LIC_AUTHCHANGECD")
    protected BigInteger licauthchangecd;
    @XmlElement(name = "LIC_AUTHCHANGEDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar licauthchangedt;
    @XmlElement(name = "COMBPRODCD")
    protected BigInteger combprodcd;
    @XmlElement(name = "FLAVOURCD")
    protected BigInteger flavourcd;
    @XmlElement(name = "EMA")
    protected BigInteger ema;
    @XmlElement(name = "PARALLEL_IMPORT")
    protected BigInteger parallelimport;
    @XmlElement(name = "AVAIL_RESTRICTCD", required = true)
    protected BigInteger availrestrictcd;

    /**
     * Gets the value of the apid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAPID() {
        return apid;
    }

    /**
     * Sets the value of the apid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAPID(BigInteger value) {
        this.apid = value;
    }

    /**
     * Gets the value of the invalid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getINVALID() {
        return invalid;
    }

    /**
     * Sets the value of the invalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setINVALID(BigInteger value) {
        this.invalid = value;
    }

    /**
     * Gets the value of the vpid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVPID() {
        return vpid;
    }

    /**
     * Sets the value of the vpid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVPID(BigInteger value) {
        this.vpid = value;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNM() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNM(String value) {
        this.nm = value;
    }

    /**
     * Gets the value of the abbrevnm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABBREVNM() {
        return abbrevnm;
    }

    /**
     * Sets the value of the abbrevnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABBREVNM(String value) {
        this.abbrevnm = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESC() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESC(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the nmdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNMDT() {
        return nmdt;
    }

    /**
     * Sets the value of the nmdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNMDT(XMLGregorianCalendar value) {
        this.nmdt = value;
    }

    /**
     * Gets the value of the nmprev property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMPREV() {
        return nmprev;
    }

    /**
     * Sets the value of the nmprev property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMPREV(String value) {
        this.nmprev = value;
    }

    /**
     * Gets the value of the suppcd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSUPPCD() {
        return suppcd;
    }

    /**
     * Sets the value of the suppcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSUPPCD(BigInteger value) {
        this.suppcd = value;
    }

    /**
     * Gets the value of the licauthcd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLICAUTHCD() {
        return licauthcd;
    }

    /**
     * Sets the value of the licauthcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLICAUTHCD(BigInteger value) {
        this.licauthcd = value;
    }

    /**
     * Gets the value of the licauthprevcd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLICAUTHPREVCD() {
        return licauthprevcd;
    }

    /**
     * Sets the value of the licauthprevcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLICAUTHPREVCD(BigInteger value) {
        this.licauthprevcd = value;
    }

    /**
     * Gets the value of the licauthchangecd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLICAUTHCHANGECD() {
        return licauthchangecd;
    }

    /**
     * Sets the value of the licauthchangecd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLICAUTHCHANGECD(BigInteger value) {
        this.licauthchangecd = value;
    }

    /**
     * Gets the value of the licauthchangedt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLICAUTHCHANGEDT() {
        return licauthchangedt;
    }

    /**
     * Sets the value of the licauthchangedt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLICAUTHCHANGEDT(XMLGregorianCalendar value) {
        this.licauthchangedt = value;
    }

    /**
     * Gets the value of the combprodcd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCOMBPRODCD() {
        return combprodcd;
    }

    /**
     * Sets the value of the combprodcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCOMBPRODCD(BigInteger value) {
        this.combprodcd = value;
    }

    /**
     * Gets the value of the flavourcd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFLAVOURCD() {
        return flavourcd;
    }

    /**
     * Sets the value of the flavourcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFLAVOURCD(BigInteger value) {
        this.flavourcd = value;
    }

    /**
     * Gets the value of the ema property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEMA() {
        return ema;
    }

    /**
     * Sets the value of the ema property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEMA(BigInteger value) {
        this.ema = value;
    }

    /**
     * Gets the value of the parallelimport property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPARALLELIMPORT() {
        return parallelimport;
    }

    /**
     * Sets the value of the parallelimport property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPARALLELIMPORT(BigInteger value) {
        this.parallelimport = value;
    }

    /**
     * Gets the value of the availrestrictcd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAVAILRESTRICTCD() {
        return availrestrictcd;
    }

    /**
     * Sets the value of the availrestrictcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAVAILRESTRICTCD(BigInteger value) {
        this.availrestrictcd = value;
    }

}
