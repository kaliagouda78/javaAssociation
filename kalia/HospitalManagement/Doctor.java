package com.kalia.hospitalManagemant_system;

public class Doctor {
private String name;
private String specialization;
private int experience;
protected Doctor(String name, String specialization, int experience) {
	super();
	this.name = name;
	this.specialization = specialization;
	this.experience = experience;
}
@Override
public String toString() {
	return "Doctor [name=" + name + ", specialization=" + specialization + ", experience=" + experience + "]";
}

}
