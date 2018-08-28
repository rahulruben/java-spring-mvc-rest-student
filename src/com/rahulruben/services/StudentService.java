package com.rahulruben.services;

import java.util.List;

import com.rahulruben.models.Student;

public interface StudentService {
	List<Student> getAllStudents();

	Student getStudent(int rollNo);

	boolean addStudent(Student student);

	boolean removeStudent(int rollNo);
	
	boolean updateStudent(int rollNo, Student student);
}
