package com.hql;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tut.Student;
import com.tut.Certificate;

public class HQLExample {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session s = factory.openSession();
		//HQL
		//Syntax
		/*
		 * String query = "from Student as st where st.city = :x and st.name = :n";
		 * Query q = s.createQuery(query); q.setParameter("x", "Delhi");
		 * q.setParameter("n", "Nakul");
		 */
		//Single result - unique
		//Multiple result - list
		/*
		 * List<Student> list = q.list(); for(Student student : list) {
		 * System.out.println(student.getName() + ":" + student.getCerti().getCourse());
		 * }
		 */
		Transaction tx = s.beginTransaction();
		
		//delete operation in HQL
		/*
		 * Query q1 = s.createQuery("delete from Student as st where st.city=:c");
		 * q1.setParameter("c", "Jaipur"); int r = q1.executeUpdate(); tx.commit();
		 * System.out.println("Deleted...."); System.out.println(r);
		 */
		
		//update operation in HQL
		/*
		 * Query q2 =
		 * s.createQuery("update Student as st set st.city=:c where st.name=:n");
		 * q2.setParameter("c", "Delhi"); q2.setParameter("n", "Karan Ludhani");
		 * q2.executeUpdate();
		 */
		
		
		tx.commit();
		Query q = s.createQuery("select q.question,q.questionId,a.answer from Question q INNER JOIN q.answer as a");
		List<Object []> list = q.getResultList();
		for(Object [] arr: list) {
			System.out.println(Arrays.deepToString(arr));
		}
		
		factory.close();
	}

}
