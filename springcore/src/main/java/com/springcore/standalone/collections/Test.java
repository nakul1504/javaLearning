package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/scconfig.xml");
		
		Person person = con.getBean("person1",Person.class);
		System.out.println(person);
		System.out.println(person.getFriends().getClass().getName());
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(person.getFeestructure());
		System.out.println(person.getFeestructure().getClass().getName());
		System.out.println("-----------------------------------------------");
		System.out.println(person.getProps());
		System.out.println(person.getProps().getClass().getName());

	}

}
