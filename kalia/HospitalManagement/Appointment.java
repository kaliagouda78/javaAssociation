package com.kalia.hospitalManagemant_system;

public class Appointment {
private int appointmentId; 
private Doctor doctor;
private patient patt;
private String dateTime;
protected Appointment(int appointmentId, Doctor doctor, patient patt, String dateTime) {
	super();
	this.appointmentId = appointmentId;
	this.doctor = doctor;
	this.patt = patt;
	this.dateTime = dateTime;
}
@Override
public String toString() {
	return "Appointment [appointmentId=" + appointmentId + ", doctor=" + doctor + ", patt=" + patt + ", dateTime="
			+ dateTime + "]";
}

}
