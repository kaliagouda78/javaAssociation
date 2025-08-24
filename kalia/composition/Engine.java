package com.kalia.composition;

public class Engine {
private String engine;
private int horsePower;
protected Engine(String engine, int horsePower) {
	super();
	this.engine = engine;
	this.horsePower = horsePower;
}
@Override
public String toString() {
	return "Engine [engine=" + engine + ", horsePower=" + horsePower + "]";
}

}
