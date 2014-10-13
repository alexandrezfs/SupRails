package com.supinfo.suprails.web.servlet;

import com.supinfo.suprails.entity.TrainStation;
import com.supinfo.suprails.entity.Trip;
import com.supinfo.suprails.service.TrainStationService;
import com.supinfo.suprails.service.TripService;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author bargenson
 */
@WebServlet(urlPatterns="/trips")
public class ListTripsServlet extends HttpServlet {

    @EJB
    private TripService tripService;
    
    @EJB
    private TrainStationService trainStationService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String departureIdStr = req.getParameter("departureId");
        String arrivalIdStr = req.getParameter("arrivalId");
        String highestPriceStr = req.getParameter("price");

        Long departureId = (departureIdStr == null || departureIdStr.equals("")) ? null : Long.parseLong(departureIdStr);
        Long arrivalId = (arrivalIdStr == null || arrivalIdStr.equals("")) ? null : Long.parseLong(arrivalIdStr);
        BigDecimal highestPrice = (highestPriceStr == null || highestPriceStr.equals("")) ? null : new BigDecimal(highestPriceStr);

        List<Trip> trips = tripService.findTripByDepartureArrivalPrice(departureId, arrivalId, highestPrice);

        List<TrainStation> trainStations = trainStationService.getAllTrainStations();

        req.setAttribute("trips", trips);
        req.setAttribute("trainStations", trainStations);

        req.getRequestDispatcher("/jsp/listTrips.jsp").forward(req, resp);
    }

}
