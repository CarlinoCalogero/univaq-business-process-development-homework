
package it.univaq.disim.bpd.businesstravelclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per flightData complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="flightData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="desiredDepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="desiredReturnDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="destinationTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="originFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightData", propOrder = {
    "desiredDepartureDate",
    "desiredReturnDate",
    "destinationTo",
    "originFrom"
})
public class FlightData {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar desiredDepartureDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar desiredReturnDate;
    protected String destinationTo;
    protected String originFrom;

    /**
     * Recupera il valore della proprietà desiredDepartureDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDesiredDepartureDate() {
        return desiredDepartureDate;
    }

    /**
     * Imposta il valore della proprietà desiredDepartureDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDesiredDepartureDate(XMLGregorianCalendar value) {
        this.desiredDepartureDate = value;
    }

    /**
     * Recupera il valore della proprietà desiredReturnDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDesiredReturnDate() {
        return desiredReturnDate;
    }

    /**
     * Imposta il valore della proprietà desiredReturnDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDesiredReturnDate(XMLGregorianCalendar value) {
        this.desiredReturnDate = value;
    }

    /**
     * Recupera il valore della proprietà destinationTo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationTo() {
        return destinationTo;
    }

    /**
     * Imposta il valore della proprietà destinationTo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationTo(String value) {
        this.destinationTo = value;
    }

    /**
     * Recupera il valore della proprietà originFrom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginFrom() {
        return originFrom;
    }

    /**
     * Imposta il valore della proprietà originFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginFrom(String value) {
        this.originFrom = value;
    }

}
