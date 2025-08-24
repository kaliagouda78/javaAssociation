package com.kalia.composition;

public class Car {
private String CarName;
private String CarColour;
private int  price;
private Engine engine;
protected Car(String carName, String carColour, int price) {
	super();
	CarName = carName;
	CarColour = carColour;
	this.price = price;
	engine=new Engine("CNG", 1200);
}
@Override
public String toString() {
	return "Car [CarName=" + CarName + ", CarColour=" + CarColour + ", price=" + price + ", engine=" + engine + "]";
}

}
