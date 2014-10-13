package com.supinfo.suprails.resources;

import com.supinfo.suprails.entity.TrainStation;
import com.supinfo.suprails.service.TrainStationService;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

/**
 * Created by Alexandre NGUYEN on 13/10/2014.
 */

@Path("/trainStations")
@Stateless
public class TrainStationResources {

    @EJB
    private TrainStationService trainStationService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<TrainStation> getTrainStations() {

        return trainStationService.getAllTrainStations();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addTrainStation(TrainStation trainStation) {

        trainStationService.addTrainStation(trainStation);

        String location = "/" + trainStation.getId();

        return Response.created(URI.create(location)).build();
    }
}
