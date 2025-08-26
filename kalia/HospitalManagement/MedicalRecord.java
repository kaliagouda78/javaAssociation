package com.kalia.hospitalManagemant_system;

public class MedicalRecord {
private int recordId;
private String disease;
private String prescription;
private patient patientt;
protected MedicalRecord(int recordId, String disease, String prescription, patient patientt) {
	super();
	this.recordId = recordId;
	this.disease = disease;
	this.prescription = prescription;
	this.patientt = patientt;
}
@Override
public String toString() {
	return "MedicalRecord [recordId=" + recordId + ", disease=" + disease + ", prescription=" + prescription
			+ ", patientt=" + patientt + "]";
}

}
