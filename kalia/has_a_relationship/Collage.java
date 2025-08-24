package com.kalia.has_a_relationship;

public class Collage {
private String Collagename;
private String location;
protected Collage(String collagename, String location) {
	super();
	Collagename = collagename;
	this.location = location;
}
@Override
public String toString() {
	return "Collage [Collagename=" + Collagename + ", location=" + location + "]";
}

}
