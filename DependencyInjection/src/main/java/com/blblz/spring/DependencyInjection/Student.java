package com.blblz.spring.DependencyInjection;

public class Student {

	private int id;
	private String studentName;
	
	//creating constructor for dependency injection by constructor
	public Student(int id, String studentName) {
		this.id = id;
		this.studentName = studentName;
	}
	
	public Student(int id)
	{
		this.id = id;
	}

	//creating constructor for dependency injection by setter method
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public void setStudentName(String studentName) {
//		this.studentName = studentName;
//	}

	public void displayStudentInfo() {
		System.out.println("Student name is : " + studentName);
		System.out.println("Id is :" + id);
	}

}
