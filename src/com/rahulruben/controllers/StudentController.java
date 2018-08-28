package com.rahulruben.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rahulruben.models.Student;
import com.rahulruben.services.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService service;

	@GetMapping("/students")
	public List<Student> getAllStudents() {
		return service.getAllStudents();
	}

	@GetMapping("/student/{rollNo}")
	public Student getStudent(@PathVariable("rollNo") int rollNo) {
		return service.getStudent(rollNo);
	}
	
	@PostMapping("/students")
	public boolean addStudent(@RequestBody Student student) {
		return service.addStudent(student);
	}
	
	@PutMapping("/students/{rollNo}")
	public boolean updateStudent(@PathVariable("rollNo") int rollNo, @RequestBody Student student) {
		return service.updateStudent(rollNo, student);
	}
	
	@DeleteMapping("/student/{rollNo}")
	public boolean removeStudent(@PathVariable("rollNo") int rollNo) {
		return service.removeStudent(rollNo);
	}
}
