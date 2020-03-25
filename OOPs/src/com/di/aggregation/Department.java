package com.di.aggregation;

import java.util.List;

/* Department class contains list of student 
 Objects. It is associated with student 
 class through its Object(s). */
public class Department {

	String name;
	private List<Student> students;

	public Department(String name, List<Student> students) {
		super();
		this.name = name;
		this.students = students;
	}

	public List<Student> getStudents() {
		return students;
	}

}
