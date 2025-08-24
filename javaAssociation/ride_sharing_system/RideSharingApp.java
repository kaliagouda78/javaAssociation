package com.kalia.ride_sharing_system;

import java.util.Scanner;

public class RideSharingApp {
	public static void main(String[] args) {
        
		 Scanner sc = new Scanner(System.in);
		 	System.out.print("Enter Driver Name: ");
	        String dName = sc.nextLine();
	        System.out.print("Enter Driver License Number: ");
	        String dLicense = sc.nextLine();
	        System.out.print("Enter Driver Rating: ");
	        double dRating = sc.nextDouble();
	        sc.nextLine(); 
	        Driver driver = new Driver(dName, dLicense, dRating);
	        System.out.print("Enter Passenger Name: ");
	        String pName = sc.nextLine();
	        System.out.print("Enter Passenger Phone: ");
	        String pPhone = sc.nextLine();
	        Passenger passenger = new Passenger(pName, pPhone);
	        System.out.print("Enter Car Model: ");
	        String cModel = sc.nextLine();
	        System.out.print("Enter Engine Number: ");
	        String eNum = sc.nextLine();
	        System.out.print("Enter Engine Horsepower: ");
	        int hp = sc.nextInt();
	        sc.nextLine(); 
	        Car car = new Car(cModel, eNum, hp);
	        System.out.print("Enter Pickup Location: ");
	        String pickup = sc.nextLine();
	        System.out.print("Enter Drop Location: ");
	        String drop = sc.nextLine();
	        Ride ride = new Ride(driver, passenger, car, pickup, drop);
	        System.out.print("Enter Payment Amount: ");
	        double amount = sc.nextDouble();
	        sc.nextLine(); 
	        System.out.print("Enter Payment Method (Cash/UPI/Card): ");
	        String method = sc.nextLine();
	        Payment payment = new Payment(amount, method);
	        ride.makePayment(payment);
	        System.out.println("\n--- Ride Summary ---");
	        System.out.println("Passenger: " + ride.passenger.name + " (" + ride.passenger.phone + ")");
	        System.out.println("Driver: " + ride.driver.name + " [License: " + ride.driver.licenseNumber +
	                           ", Rating: " + ride.driver.rating + "]");
	        System.out.println("Car: " + ride.car.model + " [Engine: " + ride.car.engine.engineNumber +
	                           ", HP: " + ride.car.engine.horsepower + "]");
	        System.out.println("Pickup: " + ride.pickup.address);
	        System.out.println("Drop: " + ride.drop.address);
	        System.out.println("Payment: " + ride.payment.amount + " via " + ride.payment.method);

	        sc.close();
	    }
}
