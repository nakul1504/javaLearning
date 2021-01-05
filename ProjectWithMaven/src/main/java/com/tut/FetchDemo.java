package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Student su = (Student)session.get(Student.class, 102);
		System.out.println(su);
		
		factory.close();
		session.close();
	}

}
