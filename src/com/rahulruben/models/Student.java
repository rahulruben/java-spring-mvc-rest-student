package com.rahulruben.models;

public class Student {
	private int rollNo;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNo, String firstName, String lastName, String dateOfBirth) {
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}	
}
