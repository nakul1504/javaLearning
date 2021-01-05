package com.sql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;

import com.helper.FactoryProvider;

public class SQLExample {

	public static void main(String[] args) {

		SessionFactory factory = FactoryProvider.getFactory();
		
		Session s = factory.openSession();
		
		//Implementing SQL Queries in java
		NativeQuery nq = s.createSQLQuery("select * from student");
		List<Object []> list = nq.list();
		for(Object[] st : list) {
			System.out.println(Arrays.deepToString(st));
		}
		for(Object[] st: list) {
			System.out.println(st[0] + " : " + st[4]);
		}
		
		s.close();

		factory.close();

	}

}
