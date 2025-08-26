package com.kalia.hospitalManagemant_system;

public class Department {
private String deptName;
private String headDoctor;
protected Department(String deptName, String headDoctor) {
	super();
	this.deptName = deptName;
	this.headDoctor = headDoctor;
}
@Override
public String toString() {
	return "Department [deptName=" + deptName + ", headDoctor=" + headDoctor + "]";
}

}
