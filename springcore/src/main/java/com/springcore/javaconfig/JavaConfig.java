 package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaconfig")
public class JavaConfig {

	@Bean
	public Samosa getSamosa() {

		return new Samosa();
	}
	
	
	@Bean(name = {"nk","dm","ss"})
	public Student getStudent() {

		Student student = new Student(getSamosa());
		return student;
	}

}
