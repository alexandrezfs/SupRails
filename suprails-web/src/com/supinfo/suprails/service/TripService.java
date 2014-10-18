package com.supinfo.suprails.service;

import com.supinfo.suprails.dao.TrainStationDao;
import com.supinfo.suprails.dao.TripDao;
import com.supinfo.suprails.entity.TrainStation;
import com.supinfo.suprails.entity.Trip;

import java.math.BigDecimal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author bargenson
 */
@Stateless
public class TripService {
    
    @EJB
    private TripDao tripDao;

    @EJB
    private TrainStationDao trainStationDao;

    public List<Trip> findTripByDepartureArrivalPrice(Long departureStationId, Long arrivalStationId, BigDecimal highestPrice) {

        TrainStation departure = (departureStationId == null) ? null : trainStationDao.findTrainStationById(departureStationId);
        TrainStation arrival = (arrivalStationId == null) ? null : trainStationDao.findTrainStationById(arrivalStationId);

        return tripDao.getTripsByDepartureArrivalPrice(departure, arrival, highestPrice);
    }
    
    public Trip addTrip(Trip trip) {
        return tripDao.addTrip(trip);
    }
    
    public List<Trip> getAllTrips() {
        return tripDao.getAllTrips();
    }

    public void removeTrip(Long tripId) {
        tripDao.removeTrip(findTripById(tripId));
    }
    
    public Trip findTripById(Long tripId) {
        return tripDao.findTripById(tripId);
    }

}
