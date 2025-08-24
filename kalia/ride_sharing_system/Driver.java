package com.kalia.ride_sharing_system;

public class Driver {
    String name;
    String licenseNumber;
    double rating;
    Driver(String name) {
        this.name = name;
    }
        Driver(String name, String licenseNumber, double rating) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.rating = rating;
    }
}

