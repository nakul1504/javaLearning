package com.springcore.javaconfig;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoClient {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext con  = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student student = con.getBean("dm",Student.class);
		System.out.println(student);
		student.study();
		con.close();
	}

}
