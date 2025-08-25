package com.kalia.car_manifacture;

public class Engine {
	private String engineModel; 	
	private int engineCapacity;
	protected Engine(String engineModel, int engineCapacity) {
		super();
		if(engineCapacity<0) {
			System.out.println("Error Invalid Input");
			System.exit(0);
		}
		this.engineModel = engineModel;
		this.engineCapacity = engineCapacity;
	}
	public String getModel() {
		return engineModel;
	}
	public int getEngineCapacity() {
		return engineCapacity;
	}
	@Override
	public String toString() {
		return "Engine [model=" + engineModel + ", engineCapacity=" + engineCapacity + "]";
	} 
	
	
}
