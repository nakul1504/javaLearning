package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entities.Student;

public interface StudentDao {
	//insert 
	public int insert( Student student);
	
	//update
	public int change( Student student);
	
	//delete
	public int delete( int studentId);
	
	//Getting single Student object
	public Student getStudent( int studentId);
	
	//Getting multiple/All Student data
	public List<Student> getAllStudent();
	

}
