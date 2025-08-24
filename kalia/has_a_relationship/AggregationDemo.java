package com.kalia.has_a_relationship;

public class AggregationDemo {

	public static void main(String[] args) {
		Collage col=new Collage("atc", "lathi");
		Student sc=new Student("kalia", 1001, col);
		System.out.println(sc);
    }
	}
