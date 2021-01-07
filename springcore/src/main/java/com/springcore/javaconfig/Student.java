package com.springcore.javaconfig;

import org.springframework.stereotype.Component;


public class Student {
	
	private Samosa samosa;
	
	
	
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}



	public void study() {
		samosa.dispaly();
		System.out.println("Student is studying");
	}
	

}
