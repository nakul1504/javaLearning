package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.helper.FactoryProvider;
import com.tut.Student;

public class CriteriaExample {

	public static void main(String[] args) {
		SessionFactory factory = FactoryProvider.getFactory();
		Session s = factory.openSession();
		
		Criteria c = s.createCriteria(Student.class);
		
		//c.add(Restrictions.eq("certi.duration", "2 months"));
		c.add(Restrictions.ge("certi.duration", "4 months"));
		List<Student> st = c.list();
		
		for (Student student : st) {
			
			System.out.println(student);
			
		}
		
		s.close();
		factory.close();

	}

}
