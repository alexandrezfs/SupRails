package com.supinfo.suprails.web.servlet;

import com.supinfo.suprails.entity.Customer;
import com.supinfo.suprails.entity.CustomerOrder;
import com.supinfo.suprails.entity.Trip;
import com.supinfo.suprails.service.CustomerOrderService;
import com.supinfo.suprails.service.TripService;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Alexandre NGUYEN on 12/10/2014.
 */
@WebServlet(urlPatterns = {"/addCustomerOrder"})
public class AddCustomerOrderServlet extends HttpServlet{

    @EJB
    private TripService tripService;

    @EJB
    private CustomerOrderService customerOrderService;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Customer customer = new Customer();
        customer.setEmail(req.getParameter("email"));
        customer.setFirstName(req.getParameter("firstName"));
        customer.setLastName(req.getParameter("lastName"));

        Long tripId = Long.parseLong(req.getParameter("tripId"));

        Trip trip = tripService.findTripById(tripId);

        CustomerOrder customerOrder = new CustomerOrder();
        customerOrder.setCustomer(customer);
        customerOrder.setTrip(trip);

        customerOrderService.processCustomerOrder(customerOrder);

        resp.sendRedirect(getServletContext().getContextPath() + "/trips");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Trip> trips = tripService.getAllTrips();
        req.setAttribute("trips", trips);
        req.getRequestDispatcher("/jsp/addCustomerOrder.jsp").forward(req, resp);
    }
}
