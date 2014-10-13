
package com.supinfo.suprails.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.supinfo.suprails.webservice package. 
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

    private final static QName _GetTripsResponse_QNAME = new QName("http://webservice.suprails.supinfo.com/", "getTripsResponse");
    private final static QName _ProcessCustomerOrderResponse_QNAME = new QName("http://webservice.suprails.supinfo.com/", "processCustomerOrderResponse");
    private final static QName _GetTrips_QNAME = new QName("http://webservice.suprails.supinfo.com/", "getTrips");
    private final static QName _ProcessCustomerOrder_QNAME = new QName("http://webservice.suprails.supinfo.com/", "processCustomerOrder");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.supinfo.suprails.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProcessCustomerOrder }
     * 
     */
    public ProcessCustomerOrder createProcessCustomerOrder() {
        return new ProcessCustomerOrder();
    }

    /**
     * Create an instance of {@link GetTrips }
     * 
     */
    public GetTrips createGetTrips() {
        return new GetTrips();
    }

    /**
     * Create an instance of {@link ProcessCustomerOrderResponse }
     * 
     */
    public ProcessCustomerOrderResponse createProcessCustomerOrderResponse() {
        return new ProcessCustomerOrderResponse();
    }

    /**
     * Create an instance of {@link GetTripsResponse }
     * 
     */
    public GetTripsResponse createGetTripsResponse() {
        return new GetTripsResponse();
    }

    /**
     * Create an instance of {@link TrainStation }
     * 
     */
    public TrainStation createTrainStation() {
        return new TrainStation();
    }

    /**
     * Create an instance of {@link CustomerOrder }
     * 
     */
    public CustomerOrder createCustomerOrder() {
        return new CustomerOrder();
    }

    /**
     * Create an instance of {@link Trip }
     * 
     */
    public Trip createTrip() {
        return new Trip();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTripsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.suprails.supinfo.com/", name = "getTripsResponse")
    public JAXBElement<GetTripsResponse> createGetTripsResponse(GetTripsResponse value) {
        return new JAXBElement<GetTripsResponse>(_GetTripsResponse_QNAME, GetTripsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessCustomerOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.suprails.supinfo.com/", name = "processCustomerOrderResponse")
    public JAXBElement<ProcessCustomerOrderResponse> createProcessCustomerOrderResponse(ProcessCustomerOrderResponse value) {
        return new JAXBElement<ProcessCustomerOrderResponse>(_ProcessCustomerOrderResponse_QNAME, ProcessCustomerOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTrips }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.suprails.supinfo.com/", name = "getTrips")
    public JAXBElement<GetTrips> createGetTrips(GetTrips value) {
        return new JAXBElement<GetTrips>(_GetTrips_QNAME, GetTrips.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessCustomerOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.suprails.supinfo.com/", name = "processCustomerOrder")
    public JAXBElement<ProcessCustomerOrder> createProcessCustomerOrder(ProcessCustomerOrder value) {
        return new JAXBElement<ProcessCustomerOrder>(_ProcessCustomerOrder_QNAME, ProcessCustomerOrder.class, null, value);
    }

}
