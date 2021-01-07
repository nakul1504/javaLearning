package com.springcore.ci;

import java.util.List;

public class Person {
	private String name;
	private int id;
	private Certi certi;
	private List<String> addresses;
	
	public Person(String name, int id, Certi certi, List<String> addresses) {
		super();
		this.name = name;
		this.id = id;
		this.certi = certi;
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return this.name + " : " + this.id + "{ " + this.certi.name + " } " + this.addresses;
	}
	
	
	
	

}
