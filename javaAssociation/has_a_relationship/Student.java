package com.kalia.has_a_relationship;

public class Student {
private String StudentName;
private int StudentMark;
private Collage collage;
protected Student(String studentName, int studentMark, Collage collage) {
	super();
	StudentName = studentName;
	StudentMark = studentMark;
	this.collage = collage;
}
@Override
public String toString() {
	return "Student [StudentName=" + StudentName + ", StudentMark=" + StudentMark + ", collage=" + collage + "]";
}

}
