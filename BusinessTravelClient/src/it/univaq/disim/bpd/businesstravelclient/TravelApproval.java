
package it.univaq.disim.bpd.businesstravelclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per travelApproval complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="travelApproval">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="employee" type="{http://businesstravel.bpd.disim.univaq.it/}employee" minOccurs="0"/>
 *         &lt;element name="flightData" type="{http://businesstravel.bpd.disim.univaq.it/}flightData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "travelApproval", propOrder = {
    "employee",
    "flightData"
})
public class TravelApproval {

    protected Employee employee;
    protected FlightData flightData;

    /**
     * Recupera il valore della proprietà employee.
     * 
     * @return
     *     possible object is
     *     {@link Employee }
     *     
     */
    public Employee getEmployee() {
        return employee;
    }

    /**
     * Imposta il valore della proprietà employee.
     * 
     * @param value
     *     allowed object is
     *     {@link Employee }
     *     
     */
    public void setEmployee(Employee value) {
        this.employee = value;
    }

    /**
     * Recupera il valore della proprietà flightData.
     * 
     * @return
     *     possible object is
     *     {@link FlightData }
     *     
     */
    public FlightData getFlightData() {
        return flightData;
    }

    /**
     * Imposta il valore della proprietà flightData.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightData }
     *     
     */
    public void setFlightData(FlightData value) {
        this.flightData = value;
    }

}
