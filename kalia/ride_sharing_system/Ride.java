package com.kalia.ride_sharing_system;

public class Ride {
	   Driver driver;       
	    Passenger passenger; 
	    Car car;             
	    Location pickup;   
	    Location drop;      
	    Payment payment;   

	   
	    Ride(Driver driver, Passenger passenger, Car car, String pickupAddress, String dropAddress) {
	        this.driver = driver;
	        this.passenger = passenger;
	        this.car = car;
	        this.pickup = new Location(pickupAddress); 
	        this.drop = new Location(dropAddress);   
	    }

	  
	    void makePayment(Payment payment) {
	        this.payment = payment;
	    }
}
