package com.kalia.ordermanagement;

import java.util.Scanner;

public class Zomoto {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter Your Order Id :");
	   String ordeid=sc.nextLine();
	   System.out.println("Enter your Item name :");
	   String Item=sc.nextLine();
	   System.out.println("enter item price :");
	   
	   double price=sc.nextDouble();
	   if(price<0) {
		   System.out.println("Invalid Input");
		   System.exit(0);
	   }
	   sc.nextLine();
	Order order=new Order(ordeid, Item, price);
	System.out.println("customer's name :");
	String name=sc.nextLine();
	System.out.println("customer's email :");
	String email=sc.nextLine();
	System.out.println("customer's address :");
	String add=sc.nextLine();
	System.out.println("customer's mobile number :");
	long nu=sc.nextLong();
	CustomerClass custo=new CustomerClass(name, email, add, nu, order);
	System.out.println(custo);
}
}
