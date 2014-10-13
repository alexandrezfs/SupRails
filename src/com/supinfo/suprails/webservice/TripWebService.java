package com.supinfo.suprails.webservice;

import com.supinfo.suprails.entity.CustomerOrder;
import com.supinfo.suprails.entity.Trip;
import com.supinfo.suprails.service.CustomerOrderService;
import com.supinfo.suprails.service.TripService;

import javax.ejb.EJB;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by Alexandre NGUYEN on 13/10/2014.
 */

@WebService(serviceName = "tripService")
public class TripWebService {

    @EJB
    private TripService tripService;

    @EJB
    private CustomerOrderService customerOrderService;

    public List<Trip> getTrips() {
        return tripService.getAllTrips();
    }

    public void processCustomerOrder(CustomerOrder customerOrder) {
        customerOrderService.processCustomerOrder(customerOrder);
    }
}
