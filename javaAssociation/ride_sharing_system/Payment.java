package com.kalia.ride_sharing_system;

public class Payment {
	  double amount;
	    String method;
	    	Payment(double amount) {
	        this.amount = amount;
	        this.method = "Cash";
	    }
	    Payment(double amount, String method) {
	        this.amount = amount;
	        this.method = method;
	    }
}
