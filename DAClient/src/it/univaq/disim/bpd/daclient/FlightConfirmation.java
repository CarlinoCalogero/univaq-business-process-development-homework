
package it.univaq.disim.bpd.daclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per flightConfirmation complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="flightConfirmation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="approved" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="departureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="flightNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="returnDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="travelClass" type="{http://daservice.bpd.disim.univaq.it/}travelClass" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightConfirmation", propOrder = {
    "approved",
    "departureDate",
    "flightNo",
    "price",
    "returnDate",
    "travelClass"
})
public class FlightConfirmation {

    protected boolean approved;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDate;
    protected String flightNo;
    protected float price;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar returnDate;
    protected TravelClass travelClass;

    /**
     * Recupera il valore della proprietà approved.
     * 
     */
    public boolean isApproved() {
        return approved;
    }

    /**
     * Imposta il valore della proprietà approved.
     * 
     */
    public void setApproved(boolean value) {
        this.approved = value;
    }

    /**
     * Recupera il valore della proprietà departureDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDate() {
        return departureDate;
    }

    /**
     * Imposta il valore della proprietà departureDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDate(XMLGregorianCalendar value) {
        this.departureDate = value;
    }

    /**
     * Recupera il valore della proprietà flightNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNo() {
        return flightNo;
    }

    /**
     * Imposta il valore della proprietà flightNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNo(String value) {
        this.flightNo = value;
    }

    /**
     * Recupera il valore della proprietà price.
     * 
     */
    public float getPrice() {
        return price;
    }

    /**
     * Imposta il valore della proprietà price.
     * 
     */
    public void setPrice(float value) {
        this.price = value;
    }

    /**
     * Recupera il valore della proprietà returnDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReturnDate() {
        return returnDate;
    }

    /**
     * Imposta il valore della proprietà returnDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReturnDate(XMLGregorianCalendar value) {
        this.returnDate = value;
    }

    /**
     * Recupera il valore della proprietà travelClass.
     * 
     * @return
     *     possible object is
     *     {@link TravelClass }
     *     
     */
    public TravelClass getTravelClass() {
        return travelClass;
    }

    /**
     * Imposta il valore della proprietà travelClass.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelClass }
     *     
     */
    public void setTravelClass(TravelClass value) {
        this.travelClass = value;
    }

}
