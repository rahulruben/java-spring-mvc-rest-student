package com.rahulruben.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahulruben.dao.StudentDao;
import com.rahulruben.models.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao dao;
	
	@Override
	public List<Student> getAllStudents() {
		return dao.getAllStudents();
	}

	@Override
	public Student getStudent(int rollNo) {
		return dao.getStudent(rollNo);
	}

	@Override
	public boolean addStudent(Student student) {
		return dao.addStudent(student);
	}

	@Override
	public boolean removeStudent(int rollNo) {
		return dao.removeStudent(rollNo);
	}

	@Override
	public boolean updateStudent(int rollNo, Student student) {
		return dao.updateStudent(rollNo, student);
	}

}
