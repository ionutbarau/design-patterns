package com.learn.designpatterns.structural.facade;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The facade class that hold references to subsystem classes and delegate all the requests to them.
 */
public class TravelFacade {

    private FlightBooker flightBooker = new FlightBooker();
    private HotelBooker hotelBooker = new HotelBooker();

    public Map<String, List<String>> getFlightsAndHotels(Date from, Date to){
        List<String> hotels = hotelBooker.getHotels(from, to);
        List<String> flights = flightBooker.getFlights(from, to);
        Map<String, List<String>> result = new HashMap<>(2);
        result.put("hotels", hotels);
        result.put("flights", flights);
        return result;
    }

    public void bookVacation(String hotel, String flight){
        System.out.println("Your vacation has te following bookings : ");
        hotelBooker.bookHotel(hotel);
        flightBooker.bookFlight(flight);
    }
}
