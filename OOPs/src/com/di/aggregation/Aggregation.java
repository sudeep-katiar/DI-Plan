package com.di.aggregation;

import java.util.ArrayList;
import java.util.List;

// Java program to illustrate the concept of Aggregation.
/**It is a special form of Association where:
 * It represents Has-A relationship.
 * It is a unidirectional association i.e. a one way relationship.
 * For example, department can have students but vice versa is not possible
 * and thus unidirectional in nature. In Aggregation, both the entries can survive
 * individually which means ending one entity will not effect the other entity filter_none.**/

// Code reuse is best achieved by aggregation.
public class Aggregation {

	public static void main(String[] args) {

		Student s1 = new Student("Sudeep", 1, "EE");
		Student s2 = new Student("Shivani", 1, "ECE");
		Student s3 = new Student("Naveen", 2, "ECE");
		Student s4 = new Student("Kavya", 1, "CSE");

		// making a List of CSE Students
		List<Student> ee_students = new ArrayList<Student>();
		ee_students.add(s1);

		// making a List of CSE Students
		List<Student> ece_students = new ArrayList<Student>();
		ece_students.add(s2);
		ece_students.add(s3);

		// making a List of CSE Students
		List<Student> cse_students = new ArrayList<Student>();
		cse_students.add(s4);

		Department EE = new Department("EE", ee_students);
		Department ECE = new Department("ECE", ece_students);
		Department CSE = new Department("CSE", cse_students);

		List<Department> departments = new ArrayList<Department>();
		departments.add(EE);
		departments.add(ECE);
		departments.add(CSE);
		
		// creating an instance of Institute. 
        Institute institute = new Institute("CVRCE", departments);
        
        System.out.print("Total students in institute: "); 
        System.out.print(institute.getTotalStudentsInInstitute());
	}

}
