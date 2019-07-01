package com.learn.designpatterns.structural.facade;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Subsystem class that books flights.
 */
public class FlightBooker {

    public List<String> getFlights(Date from, Date to){
        return Arrays.asList("TAROM","British Airways");
    }

    public void bookFlight(String flight){
        System.out.println("Booked flight with " + flight);
    }
}
