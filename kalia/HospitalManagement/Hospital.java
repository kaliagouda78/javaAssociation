package com.kalia.hospitalManagemant_system;

public class Hospital {
private String hospitalName;
private String location;
private Department department;
protected Hospital(String hospitalName, String location, Department department) {
	super();
	this.hospitalName = hospitalName;
	this.location = location;
	this.department = department;
}
@Override
public String toString() {
	return "Hospital [hospitalName=" + hospitalName + ", location=" + location + ", department=" + department + "]";
}

}
