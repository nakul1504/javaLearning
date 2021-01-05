package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbedDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        
        Session session = factory.openSession();
        
        Student st1 = new Student();
        st1.setName("Nakul");
        st1.setCity("Tonk");
        st1.setId(101);
        
        Student st2 = new Student();
        st2.setName("Karan");
        st2.setCity("jaipur");
        st2.setId(102);
        
        
        Certificate certi1 = new Certificate();
        certi1.setCourse("Android");
        certi1.setDuration("2 months");
        st1.setCerti(certi1);
        
        Certificate certi2 = new Certificate();
        certi2.setCourse("Machine Learning");
        certi2.setDuration("1.5 months");
        st2.setCerti(certi2);
        
        Transaction tx = session.beginTransaction();
        
        session.save(st1);
        session.save(st2);
        tx.commit();
        session.close();
        factory.close();
        System.out.println("**--Done--**");
	}

}
