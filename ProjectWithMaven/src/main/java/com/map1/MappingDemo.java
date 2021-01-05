package com.map1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		//Employee objects
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.setEid(101);
		e1.setEname("Ramesh");
		
		e2.setEid(102);
		e2.setEname("Suresh");
		
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(e1);
		emp.add(e2);
		
		//Project objects
		Project p1 = new Project();
		Project p2 = new Project();
		
		p1.setPid(401);
		p1.setProjectName("ChatBot");
		
		p2.setPid(402);
		p2.setProjectName("Library Management System");
		
		List<Project> project = new ArrayList<Project>();
		project.add(p1);
		project.add(p2);
		
		e1.setProjects(project);
		p2.setEmp(emp);
		e2.setProjects(project);
		
		
		Session s = factory.openSession();
		
		Transaction tx = s.beginTransaction();
		s.save(e1);
		s.save(e2);
		s.save(p1);
		s.save(p2);
		
		
		tx.commit();
		s.close();
		factory.close();
	}

}
