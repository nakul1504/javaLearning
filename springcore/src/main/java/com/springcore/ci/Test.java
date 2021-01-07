package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
		Person p = (Person) con.getBean("person");
		System.out.println(p);
		/*
		 * Certi c = (Certi) con.getBean("certi"); System.out.println(c);
		 */
		Addition add = (Addition) con.getBean("add");
		add.doSum();
	}

}
