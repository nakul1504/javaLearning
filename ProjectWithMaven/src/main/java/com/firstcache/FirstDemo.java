package com.firstcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.Student;

public class FirstDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		
		//by default, first level cache is enabled
		Student student = session.get(Student.class, 104);
		System.out.println(student);
		
		System.out.println("First level cache is working....");
		
		Student student1 = session.get(Student.class, 104);
		System.out.println(student1);
		
		System.out.println(session.contains(student));
		System.out.println(session.contains(student1));
		
		session.close();
		
		//System.out.println(session.contains(student));

	}

}
