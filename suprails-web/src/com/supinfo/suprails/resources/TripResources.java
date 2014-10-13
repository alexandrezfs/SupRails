package com.supinfo.suprails.resources;

import com.supinfo.suprails.entity.Trip;
import com.supinfo.suprails.service.TripService;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.awt.*;
import java.util.List;

/**
 * Created by Alexandre NGUYEN on 13/10/2014.
 */

@Path("/trips")
@Stateless
public class TripResources {

    @EJB
    private TripService tripService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Trip> getTrips() {
        return tripService.getAllTrips();
    }
}
