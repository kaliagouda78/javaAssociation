package com.kalia.car_manifacture;

public class Car {
	private String make; 
	private String model;
	private int year;
	private Engine engine;
	protected Car(String make, String model, int year) {
		super();
		
		if(year<0) {
			System.out.println("Error Invalid Input");
			System.exit(0);
		}
		this.make = make;
		this.model = model;
		this.year = year;
        engine=new Engine("turbo v6", 2025);
	}
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", engine=" + engine + "]";
	}
	
	
}
