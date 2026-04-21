
package it.univaq.disim.bpd.daclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.univaq.disim.bpd.daclient package. 
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

    private final static QName _FlightTicketResponse_QNAME = new QName("http://daservice.bpd.disim.univaq.it/", "flightTicketResponse");
    private final static QName _FlightTicket_QNAME = new QName("http://daservice.bpd.disim.univaq.it/", "flightTicket");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.univaq.disim.bpd.daclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FlightTicket }
     * 
     */
    public FlightTicket createFlightTicket() {
        return new FlightTicket();
    }

    /**
     * Create an instance of {@link FlightTicketResponse }
     * 
     */
    public FlightTicketResponse createFlightTicketResponse() {
        return new FlightTicketResponse();
    }

    /**
     * Create an instance of {@link FlightData }
     * 
     */
    public FlightData createFlightData() {
        return new FlightData();
    }

    /**
     * Create an instance of {@link FlightConfirmation }
     * 
     */
    public FlightConfirmation createFlightConfirmation() {
        return new FlightConfirmation();
    }

    /**
     * Create an instance of {@link TravelClass }
     * 
     */
    public TravelClass createTravelClass() {
        return new TravelClass();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://daservice.bpd.disim.univaq.it/", name = "flightTicketResponse")
    public JAXBElement<FlightTicketResponse> createFlightTicketResponse(FlightTicketResponse value) {
        return new JAXBElement<FlightTicketResponse>(_FlightTicketResponse_QNAME, FlightTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://daservice.bpd.disim.univaq.it/", name = "flightTicket")
    public JAXBElement<FlightTicket> createFlightTicket(FlightTicket value) {
        return new JAXBElement<FlightTicket>(_FlightTicket_QNAME, FlightTicket.class, null, value);
    }

}
