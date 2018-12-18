package com.northland.ludwin.barbin.ludwin.service;

import com.northland.ludwin.barbin.ludwin.dao.HotelDao;
import com.northland.ludwin.barbin.ludwin.domain.Hotel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HotelService {

    private HotelDao hotelDao = new HotelDao();

    public List<Hotel> getCheapestHotels() {

        List<Hotel> hotels = hotelDao.getHotels();
        if (hotels.size() <= 3) return hotels;

        // sort here
        Collections.sort(hotels);

        // get the cheapest 3 hotels
        List<Hotel> cheapestHotels = new ArrayList<>();

        int ctr = 0;

        for (Hotel h : hotels) {
            if (ctr >= 3) break;
            cheapestHotels.add(h);
            ctr++;
        }

        return cheapestHotels;

    }
}
