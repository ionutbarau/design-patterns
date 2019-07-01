package com.learn.designpatterns.structural.facade;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Client {

    public static void main(String[] args){
        Date now  = new Date();
        TravelFacade travelFacade = new TravelFacade();
        Map<String, List<String>> flightsAndHotels = travelFacade.getFlightsAndHotels(now, now);
        String hotel = flightsAndHotels.get("hotels").get(0);
        String flight = flightsAndHotels.get("flights").get(0);
        travelFacade.bookVacation(hotel, flight);
    }
}
