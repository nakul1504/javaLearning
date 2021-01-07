package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifeconfig.xml");
		//registering shut-down hook
		con.registerShutdownHook();
		/*
		 * Samosa s1 = (Samosa) con.getBean("s1");
		 * 
		 * System.out.println(s1);
		 * 
		 * Pepsi p1 = (Pepsi) con.getBean("p1"); System.out.println(p1);
		 */
		Example ex = (Example) con.getBean("example");
		System.out.println(ex);
		
		
		

	}

}
