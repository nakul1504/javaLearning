package com.pagination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tut.Student;

public class HQLPagination {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session s = factory.openSession();
		Query query = s.createQuery("from Student");
		
		//implementing pagination in java
		query.setFirstResult(5);
		
		query.setMaxResults(11);
		List<Student> list = query.list();
		for(Student st : list) {
			System.out.println(st.getId() + " : " + st.getName() + " : " + st.getCity() + " : " + st.getCerti().getCourse());
		}
		
		s.close();
		
		factory.close();
	}

}
