package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("My SpringJdbc started.....");
		//ApplicationContext con = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		ApplicationContext con = new AnnotationConfigApplicationContext(JdbcConfig.class);

		StudentDao studentDao = con.getBean("studentDao", StudentDao.class);

		Student student = new Student();
		
		//INSERT
        student.setId(440);
        student.setName("SA");
        student.setCity("Indore");
        int res = studentDao.insert(student);
        System.out.println("Students inserted : " + res);
		
		//UPDATE

//		student.setId(487);
//		student.setName("Nk Mathur");
//		student.setCity("Pune");
//		
//		int res = studentDao.change(student);
		
//		int res = studentDao.delete(487);
//		int res1 = studentDao.delete(445);
//		System.out.println("Students deleted : " + (res+res1));
		
//		Student student = studentDao.getStudent(998);
//		System.out.println(student);
		
		List<Student> students = studentDao.getAllStudent();
		for (Student student2 : students) {
			
			System.out.println(student2);
			
		}
	
		

	}
}
