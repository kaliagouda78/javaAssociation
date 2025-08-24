package com.kalia.ride_sharing_system;

public class Car {
    String model;
    Engine engine;

    Car(String model, String engineNumber, int horsepower) {
        this.model = model;
        this.engine = new Engine(engineNumber, horsepower);
    }
}
