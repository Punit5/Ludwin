package com.northland.ludwin.barbin.ludwin.domain;

public class Hotel implements Comparable<Hotel> {

    private String hotelName;
    private double price;

    public Hotel() {}

    public Hotel(String hotelName, double price) {
        this.hotelName = hotelName;
        this.price = price;
    }


    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Hotel h) {
        if(this.getPrice() == h.getPrice()) {
            return 0;
        } else {
            return this.getPrice() > h.getPrice() ? 1 : -1;
        }

    }
}
