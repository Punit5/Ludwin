package com.northland.ludwin.barbin.ludwin.controller;


import com.northland.ludwin.barbin.ludwin.domain.Hotel;
import com.northland.ludwin.barbin.ludwin.service.HotelService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HotelController {

    HotelService hotelService = new HotelService();


    @RequestMapping(value = "/hotels")
    public ResponseEntity<Object> getProduct() {

        List<Hotel> hotels = hotelService.getCheapestHotels();

        return new ResponseEntity<>(hotels, HttpStatus.OK);
    }
}
