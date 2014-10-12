package com.supinfo.suprails.dao.jpa;

import com.supinfo.suprails.dao.TripDao;
import com.supinfo.suprails.entity.TrainStation;
import com.supinfo.suprails.entity.Trip;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 *
 * @author bargenson
 */
@Stateless
public class JpaTripDao implements TripDao {

    @PersistenceContext
    private EntityManager em;

    
    @Override
    public Trip addTrip(Trip trip) {
        em.persist(trip);
        return trip;
    }

    @Override
    public List<Trip> getAllTrips() {
        return em.createQuery("SELECT t FROM Trip t").getResultList();
    }

    @Override
    public Trip findTripById(Long tripId) {
        return em.find(Trip.class, tripId);
    }

    @Override
    public void removeTrip(Trip trip) {
        em.remove(trip);
    }

    @Override
    public List<Trip> getTripsByDepartureArrivalPrice(TrainStation departureStation, TrainStation arrivalStation, BigDecimal highestPrice) {

        CriteriaBuilder cBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Trip> query = cBuilder.createQuery(Trip.class);

        Root<Trip> trip = query.from(Trip.class);

        List<Predicate> predicates = new ArrayList<Predicate>();

        if(departureStation != null) {
            predicates.add(cBuilder.equal(trip.get("departureStation"), departureStation));
        }

        if(arrivalStation != null) {
            predicates.add(cBuilder.equal(trip.get("arrivalStation"), arrivalStation));
        }

        if(highestPrice != null) {
            predicates.add(cBuilder.lessThanOrEqualTo(trip.get("price").as(BigDecimal.class), highestPrice));
        }

        query.where(predicates.toArray(new Predicate[predicates.size()]));

        return em.createQuery(query).getResultList();
    }

}
