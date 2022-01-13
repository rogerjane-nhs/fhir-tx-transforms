//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.09.03 at 08:29:45 AM AEST 
//


package au.csiro.fhir.transforms.xml.dmd.v2_3.amp;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AMPS"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AMP" type="{}AmpType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AP_INGREDIENT"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AP_ING" type="{}ApiType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LICENSED_ROUTE"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIC_ROUTE" type="{}LicRouteType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AP_INFORMATION"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AP_INFO" type="{}AppProdInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "amps",
    "apingredient",
    "licensedroute",
    "apinformation"
})
@XmlRootElement(name = "ACTUAL_MEDICINAL_PRODUCTS")
public class ACTUALMEDICINALPRODUCTS {

    @XmlElement(name = "AMPS", required = true)
    protected ACTUALMEDICINALPRODUCTS.AMPS amps;
    @XmlElement(name = "AP_INGREDIENT", required = true)
    protected ACTUALMEDICINALPRODUCTS.APINGREDIENT apingredient;
    @XmlElement(name = "LICENSED_ROUTE", required = true)
    protected ACTUALMEDICINALPRODUCTS.LICENSEDROUTE licensedroute;
    @XmlElement(name = "AP_INFORMATION", required = true)
    protected ACTUALMEDICINALPRODUCTS.APINFORMATION apinformation;

    /**
     * Gets the value of the amps property.
     * 
     * @return
     *     possible object is
     *     {@link ACTUALMEDICINALPRODUCTS.AMPS }
     *     
     */
    public ACTUALMEDICINALPRODUCTS.AMPS getAMPS() {
        return amps;
    }

    /**
     * Sets the value of the amps property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACTUALMEDICINALPRODUCTS.AMPS }
     *     
     */
    public void setAMPS(ACTUALMEDICINALPRODUCTS.AMPS value) {
        this.amps = value;
    }

    /**
     * Gets the value of the apingredient property.
     * 
     * @return
     *     possible object is
     *     {@link ACTUALMEDICINALPRODUCTS.APINGREDIENT }
     *     
     */
    public ACTUALMEDICINALPRODUCTS.APINGREDIENT getAPINGREDIENT() {
        return apingredient;
    }

    /**
     * Sets the value of the apingredient property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACTUALMEDICINALPRODUCTS.APINGREDIENT }
     *     
     */
    public void setAPINGREDIENT(ACTUALMEDICINALPRODUCTS.APINGREDIENT value) {
        this.apingredient = value;
    }

    /**
     * Gets the value of the licensedroute property.
     * 
     * @return
     *     possible object is
     *     {@link ACTUALMEDICINALPRODUCTS.LICENSEDROUTE }
     *     
     */
    public ACTUALMEDICINALPRODUCTS.LICENSEDROUTE getLICENSEDROUTE() {
        return licensedroute;
    }

    /**
     * Sets the value of the licensedroute property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACTUALMEDICINALPRODUCTS.LICENSEDROUTE }
     *     
     */
    public void setLICENSEDROUTE(ACTUALMEDICINALPRODUCTS.LICENSEDROUTE value) {
        this.licensedroute = value;
    }

    /**
     * Gets the value of the apinformation property.
     * 
     * @return
     *     possible object is
     *     {@link ACTUALMEDICINALPRODUCTS.APINFORMATION }
     *     
     */
    public ACTUALMEDICINALPRODUCTS.APINFORMATION getAPINFORMATION() {
        return apinformation;
    }

    /**
     * Sets the value of the apinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACTUALMEDICINALPRODUCTS.APINFORMATION }
     *     
     */
    public void setAPINFORMATION(ACTUALMEDICINALPRODUCTS.APINFORMATION value) {
        this.apinformation = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="AMP" type="{}AmpType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "amp"
    })
    public static class AMPS {

        @XmlElement(name = "AMP")
        protected List<AmpType> amp;

        /**
         * Gets the value of the amp property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the amp property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAMP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AmpType }
         * 
         * 
         */
        public List<AmpType> getAMP() {
            if (amp == null) {
                amp = new ArrayList<AmpType>();
            }
            return this.amp;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="AP_INFO" type="{}AppProdInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "apinfo"
    })
    public static class APINFORMATION {

        @XmlElement(name = "AP_INFO")
        protected List<AppProdInfoType> apinfo;

        /**
         * Gets the value of the apinfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the apinfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAPINFO().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AppProdInfoType }
         * 
         * 
         */
        public List<AppProdInfoType> getAPINFO() {
            if (apinfo == null) {
                apinfo = new ArrayList<AppProdInfoType>();
            }
            return this.apinfo;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="AP_ING" type="{}ApiType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "aping"
    })
    public static class APINGREDIENT {

        @XmlElement(name = "AP_ING")
        protected List<ApiType> aping;

        /**
         * Gets the value of the aping property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the aping property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAPING().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ApiType }
         * 
         * 
         */
        public List<ApiType> getAPING() {
            if (aping == null) {
                aping = new ArrayList<ApiType>();
            }
            return this.aping;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="LIC_ROUTE" type="{}LicRouteType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "licroute"
    })
    public static class LICENSEDROUTE {

        @XmlElement(name = "LIC_ROUTE")
        protected List<LicRouteType> licroute;

        /**
         * Gets the value of the licroute property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the licroute property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLICROUTE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LicRouteType }
         * 
         * 
         */
        public List<LicRouteType> getLICROUTE() {
            if (licroute == null) {
                licroute = new ArrayList<LicRouteType>();
            }
            return this.licroute;
        }

    }

}
