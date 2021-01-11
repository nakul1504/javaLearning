package com.spring.orm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App {
	public static void main(String[] args) {
		// System.out.println( "Hello World!" );
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
		System.out.println("-----   Welcome to my Spring ORM console application  +++++");

//    	Student student = new Student(597, "Himani", "Jaipur");
//    	int i = studentDao.insert(student);
//    	System.out.println("Done : " + i);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean go = true;
		while (go) {

			System.out.println();
			System.out.println("Press 1 for add new student");
			System.out.println("Press 2 for display all students");
			System.out.println("Press 3 for display the detail of a single student");
			System.out.println("Press 4 for deleting student");
			System.out.println("Press 5 for updating student data");
			System.out.println("Press 6 for exit the console");

			try {
				int choice = Integer.parseInt(br.readLine());

				switch (choice) {
				case 1:
					// for adding new student

					System.out.println("Enter student details: ");
					System.out.println("Enter student id: ");
					int uId = Integer.parseInt(br.readLine());

					System.out.println("Enter student name: ");
					String uName = br.readLine();

					System.out.println("Enter student city: ");
					String uCity = br.readLine();

					Student student = new Student(uId, uName, uCity);
					int done = studentDao.insert(student);
					System.out.println("Student successfully added to the database...." + done);

					break;
				case 2:
					// for displaying all students data
					
					List<Student> students = studentDao.getAllStudents();
					System.out.println("Woaahhh....all the students are here");
					System.out.println("Get ready......bitch");
					System.out.println();
					for (Student st : students) {
						
						System.out.println("ID : " + st.getStudentId());
						System.out.println("Name : " + st.getStudentName());
						System.out.println("City : " + st.getStudentCity());
						System.out.println("+++++++++++++++++++++++++++++++");
						System.out.println();
					}
					break;
				case 3:
					// for display single student data
					System.out.println("Enter the id of student :");
					int id = Integer.parseInt(br.readLine());
					System.out.println("Here is the student data you wanted......bitch");
					System.out.println();
					
					Student st2 = studentDao.getStudent(id);
					System.out.println("Name : " + st2.getStudentName());
					System.out.println("City : " + st2.getStudentCity());
					System.out.println("+++++++++++++++++++");
					System.out.println();
					break;
				case 4:
					// for deleting student data
					System.out.println("Enter the id to delete a student :");
					int id1 = Integer.parseInt(br.readLine());
					String st = studentDao.deleteStudent(id1);
					System.out.println("The student with name " + st + " is deleted");
					System.out.println("++++++++++++++++++++++++++++++");
					break;
				case 5:
					// for updating student data
					System.out.println("Enter the following details to update student data ");
					System.out.println();
					System.out.println("ID : ");
					int id2 = Integer.parseInt(br.readLine());
					System.out.println("Updated name : ");
					String name1 = br.readLine();
					System.out.println("Updated city : ");
					String city1 = br.readLine();
					
					Student st3  = new Student(id2, name1, city1);
					studentDao.updateStudent(st3);
					System.out.println(" Corresponding student details successfully updated.....");
					System.out.println();
					break;
				case 6:
					go = false;
					break;

				}
			} catch (Exception e) {
				System.out.println("Invalid choice.....Try with another one");
				System.out.println();
				e.getMessage();
			}

		}
		System.out.println("----Thankyou for using my application----");
		System.out.println("+++++ See you soon +++++");

	}
}
