package com.kalia.hospitalManagemant_system;

import java.util.Scanner;

public class HospitalManagement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Doctor Name :");
		String doctorname=sc.nextLine();
		System.out.print("Enter Doctor specialization :");
		String specialization=sc.nextLine();
		System.out.print("enter Doctor Experience :");
		int year=sc.nextInt();
		 sc.nextLine();
		Doctor doctor =  new Doctor(doctorname, specialization, year);
		System.out.println("Enter Patient Name :");
		String patientName=sc.nextLine();
		System.out.println("Enter Patient Age :");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Patient Mobile Number :");
		long num=sc.nextLong();
		sc.nextLine();
		patient patients=new patient(patientName, age, num);
		 System.out.print("Enter Record ID: ");
	        int recordId = sc.nextInt();
	        sc.nextLine(); 
	        System.out.print("Enter Disease: ");
	        String disease = sc.nextLine();
	        System.out.print("Enter Treatment: ");
	        String treatment = sc.nextLine();
	       
		MedicalRecord medicalRecord = new MedicalRecord(recordId, disease, treatment, patients);
		
		System.out.print("Enter Department Name: ");
        String deptName = sc.nextLine();
        System.out.print("Enter Department Head: ");
        String head = sc.nextLine();
        Department department = new Department(deptName, head);
        System.out.print("Enter Hospital Name: ");
        String hospitalName = sc.nextLine();
        System.out.print("Enter Hospital Location: ");
        String location = sc.nextLine();
        Hospital hospital = new Hospital(hospitalName, location, department);
        System.out.print("Enter Appointment ID: ");
        int appId = sc.nextInt();
        sc.nextLine();
        
        
        System.out.print("Enter Appointment Date & Time: ");
        String dateTime = sc.nextLine();
        Appointment appointment = new Appointment(appId, doctor, patients, dateTime);

        
        System.out.print("Enter Bill ID: ");
        int billId = sc.nextInt();
        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();
        Billing billing = new Billing(billId, amount, qty);
		
		System.out.println("----------------------------------------------medicalRecord -----------------------------------------");
	    System.out.println(medicalRecord);
	   
	    System.out.println("-------------------------------------------------------Hospital-------------------------------------");
	    System.out.println(hospital);
	    
	    System.out.println("------------------------------------------------------Apointment Deatil-----------------------------");
        System.out.println(appointment);
        System.out.println("----------------------------------------------------Billing----------------------------------------");
        System.out.println(billing);
	}

}
