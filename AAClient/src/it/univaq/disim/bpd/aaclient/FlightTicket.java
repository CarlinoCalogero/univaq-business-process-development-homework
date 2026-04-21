
package it.univaq.disim.bpd.aaclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per flightTicket complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="flightTicket">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://aaservice.bpd.disim.univaq.it/}flightData" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://aaservice.bpd.disim.univaq.it/}travelClass" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightTicket", propOrder = {
    "arg0",
    "arg1"
})
public class FlightTicket {

    protected FlightData arg0;
    protected TravelClass arg1;

    /**
     * Recupera il valore della proprietà arg0.
     * 
     * @return
     *     possible object is
     *     {@link FlightData }
     *     
     */
    public FlightData getArg0() {
        return arg0;
    }

    /**
     * Imposta il valore della proprietà arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightData }
     *     
     */
    public void setArg0(FlightData value) {
        this.arg0 = value;
    }

    /**
     * Recupera il valore della proprietà arg1.
     * 
     * @return
     *     possible object is
     *     {@link TravelClass }
     *     
     */
    public TravelClass getArg1() {
        return arg1;
    }

    /**
     * Imposta il valore della proprietà arg1.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelClass }
     *     
     */
    public void setArg1(TravelClass value) {
        this.arg1 = value;
    }

}
