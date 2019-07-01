package com.learn.designpatterns.structural.facade;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Subsystem class that books hotels.
 */
public class HotelBooker {

    public List<String> getHotels(Date from, Date to){
        return Arrays.asList("MARRIOT","INTERCONTINENTAL");
    }

    public void bookHotel(String hotel){
        System.out.println("Booked hotel " + hotel);
    }
}
