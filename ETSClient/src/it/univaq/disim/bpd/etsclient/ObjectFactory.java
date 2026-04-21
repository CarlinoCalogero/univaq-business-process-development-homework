
package it.univaq.disim.bpd.etsclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.univaq.disim.bpd.etsclient package. 
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

    private final static QName _EmployTravelStatusResponse_QNAME = new QName("http://etsservice.bpd.disim.univaq.it/", "employTravelStatusResponse");
    private final static QName _EmployTravelStatus_QNAME = new QName("http://etsservice.bpd.disim.univaq.it/", "employTravelStatus");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.univaq.disim.bpd.etsclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EmployTravelStatusResponse }
     * 
     */
    public EmployTravelStatusResponse createEmployTravelStatusResponse() {
        return new EmployTravelStatusResponse();
    }

    /**
     * Create an instance of {@link EmployTravelStatus }
     * 
     */
    public EmployTravelStatus createEmployTravelStatus() {
        return new EmployTravelStatus();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link TravelClass }
     * 
     */
    public TravelClass createTravelClass() {
        return new TravelClass();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployTravelStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://etsservice.bpd.disim.univaq.it/", name = "employTravelStatusResponse")
    public JAXBElement<EmployTravelStatusResponse> createEmployTravelStatusResponse(EmployTravelStatusResponse value) {
        return new JAXBElement<EmployTravelStatusResponse>(_EmployTravelStatusResponse_QNAME, EmployTravelStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployTravelStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://etsservice.bpd.disim.univaq.it/", name = "employTravelStatus")
    public JAXBElement<EmployTravelStatus> createEmployTravelStatus(EmployTravelStatus value) {
        return new JAXBElement<EmployTravelStatus>(_EmployTravelStatus_QNAME, EmployTravelStatus.class, null, value);
    }

}
