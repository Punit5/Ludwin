package com.northland.ludwin.barbin.ludwin.dao;

import com.northland.ludwin.barbin.ludwin.domain.Hotel;

import java.util.ArrayList;
import java.util.List;

public class HotelDao {

    public List<Hotel> getHotels() {

        // dummy for now, replace with actual API call later
        List<Hotel> hotels = new ArrayList<>();
        Hotel h1 = new Hotel("Sandman", 100);
        Hotel h2 = new Hotel("Sheraton", 200);
        Hotel h3 = new Hotel("Holiday Inn", 150);
        Hotel h4 = new Hotel("Ramada", 120);

        hotels.add(h1);
        hotels.add(h2);
        hotels.add(h3);
        hotels.add(h4);

        return hotels;
    }
}
