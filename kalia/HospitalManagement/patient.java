package com.kalia.hospitalManagemant_system;

public class patient {
private String name;
private int age;
private long phone;
protected patient(String name, int age, long phone) {
	super();
	this.name = name;
	this.age = age;
	this.phone = phone;
}
@Override
public String toString() {
	return "patient [name=" + name + ", age=" + age + ", phone=" + phone + "]";
}

}
