
package it.univaq.disim.bpd.businesstravelclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.univaq.disim.bpd.businesstravelclient package. 
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

    private final static QName _TravelApproval_QNAME = new QName("http://businesstravel.bpd.disim.univaq.it/", "TravelApproval");
    private final static QName _FlightData_QNAME = new QName("http://businesstravel.bpd.disim.univaq.it/", "FlightData");
    private final static QName _TravelApprovalResponse_QNAME = new QName("http://businesstravel.bpd.disim.univaq.it/", "TravelApprovalResponse");
    private final static QName _Employee_QNAME = new QName("http://businesstravel.bpd.disim.univaq.it/", "Employee");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.univaq.disim.bpd.businesstravelclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FlightTicketResponse }
     * 
     */
    public FlightTicketResponse createFlightTicketResponse() {
        return new FlightTicketResponse();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link FlightData }
     * 
     */
    public FlightData createFlightData() {
        return new FlightData();
    }

    /**
     * Create an instance of {@link TravelApproval }
     * 
     */
    public TravelApproval createTravelApproval() {
        return new TravelApproval();
    }

    /**
     * Create an instance of {@link FlightTicket }
     * 
     */
    public FlightTicket createFlightTicket() {
        return new FlightTicket();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelApproval }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://businesstravel.bpd.disim.univaq.it/", name = "TravelApproval")
    public JAXBElement<TravelApproval> createTravelApproval(TravelApproval value) {
        return new JAXBElement<TravelApproval>(_TravelApproval_QNAME, TravelApproval.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://businesstravel.bpd.disim.univaq.it/", name = "FlightData")
    public JAXBElement<FlightData> createFlightData(FlightData value) {
        return new JAXBElement<FlightData>(_FlightData_QNAME, FlightData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://businesstravel.bpd.disim.univaq.it/", name = "TravelApprovalResponse")
    public JAXBElement<FlightTicketResponse> createTravelApprovalResponse(FlightTicketResponse value) {
        return new JAXBElement<FlightTicketResponse>(_TravelApprovalResponse_QNAME, FlightTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Employee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://businesstravel.bpd.disim.univaq.it/", name = "Employee")
    public JAXBElement<Employee> createEmployee(Employee value) {
        return new JAXBElement<Employee>(_Employee_QNAME, Employee.class, null, value);
    }

}
