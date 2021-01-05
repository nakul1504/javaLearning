package com.secondcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


import com.helper.FactoryProvider;
import com.tut.Student;

public class SecondCacheExample {

	public static void main(String[] args) {
		
		
		SessionFactory factory = FactoryProvider.getFactory();
		Session session1 = factory.openSession();
		
		Student st1 = session1.get(Student.class, 104);
		System.out.println(st1);

		session1.close();

		Session session2 = factory.openSession();
		
		Student st2 = session2.get(Student.class, 104);
		System.out.println(st2);

		session2.close();

	}

}
