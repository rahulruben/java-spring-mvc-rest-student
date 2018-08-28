package com.rahulruben.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.springframework.stereotype.Repository;

import com.rahulruben.models.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	private List<Student> students = new ArrayList<Student>();

	public StudentDaoImpl() {
		students.add(new Student(1, "Rahulruben", "Mule", "04/11/1994"));
		students.add(new Student(2, "Manoj", "Mule", "05/04/1994"));
	}

	@Override
	public List<Student> getAllStudents() {
		return students;
	}

	@Override
	public Student getStudent(int rollNo) {
		for (Student student : students) {
			if (student.getRollNo() == rollNo) {
				return student;
			}
		}
		return null;
	}

	@Override
	public boolean addStudent(Student student) {
		return students.add(student);
	}

	@Override
	public boolean removeStudent(int rollNo) {
		ListIterator<Student> iterator = students.listIterator();
		boolean isRemoved = false;
		while (iterator.hasNext()) {
			Student student = iterator.next();
			if (student.getRollNo() == rollNo) {
				iterator.remove();
				isRemoved = true;
			}
		}
		return isRemoved;
	}

	@Override
	public boolean updateStudent(int rollNo, Student student) {
		boolean isUpdated = false;
		for(Student std: students) {
			if(student.getRollNo() == std.getRollNo()) {
				if(!student.getFirstName().isEmpty() && !student.getFirstName().equals(std.getFirstName())) {
					std.setFirstName(student.getFirstName());
					isUpdated = true;
				}
				
				if(!student.getLastName().isEmpty() && !student.getLastName().equals(std.getLastName())) {
					std.setLastName(student.getLastName());
					isUpdated = true;
				}
				
				if(!student.getDateOfBirth().isEmpty() && !student.getDateOfBirth().equals(std.getDateOfBirth())) {
					std.setDateOfBirth(student.getDateOfBirth());
					isUpdated = true;
				}
			}
		}
		return isUpdated;
	}

}
