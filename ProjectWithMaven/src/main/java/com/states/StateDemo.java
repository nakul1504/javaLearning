package com.states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tut.Certificate;
import com.tut.Student;

public class StateDemo {
	public static void main(String[] args) {
		//Hibernate Object States
		// Transient
		// Persistent
		// Detached
		// Removed
		System.out.println("Example...");
		SessionFactory f = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		//Creating student object
		Student st = new Student();
		st.setId(101);
		st.setName("Student 1");
		st.setCity("Somewhere in India");
		st.setCerti(new Certificate("Data Science Certification","3 months"));
		//Student object : transient state - session, database
		
		//creating session
		Session s = f.openSession();
		Transaction tx = s.beginTransaction();
		s.save(st);
		//Student object : persistent state
		st.setName("Student 2");
		tx.commit();
		
		s.close();
		
		st.setName("Student 3");
		System.out.println(st);
		//Student object : Detached state
		
		
		f.close();
	}

}
