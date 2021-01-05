package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project Started..." );
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        //SessionFactory factory = new Configuration().configure().buildSessionFactory();
        
        //Creating Student details 
        Student st = new Student();
        st.setId(102);
        st.setName("Karan Ludhani C");
        st.setCity("Jaipur");
        System.out.println(st);
        
        //To physically save details in the database
        //Begin a transaction in the on-going session
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(st);
        tx.commit();
        session.close();
       
    }
}
