package com.springcore.autowire.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/autowire/annotations/autoconfig.xml");
		
		Emp emp = con.getBean("emp",Emp.class);
		System.out.println(emp);



	}

}
