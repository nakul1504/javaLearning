package com.springcore.lifecycle;

// imported from the old version of java annotations in the pom.xml file
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}
	
	@PostConstruct
	public void start() {
		//super();
		System.out.println("starting method");
	}
	@PreDestroy
	public void end() {
		//super();
		System.out.println("ending method");
	}
	

}
