package com.di.association;

// Java program to illustrate the concept of Association
/**Association is relation between two separate classes which establishes through their Objects.
 * Association can be one-to-one, one-to-many, many-to-one, many-to-many.
 * In OOP, an Object communicates to other Object to use functionality and services provided by that object.
 * Composition and Aggregation are the two forms of association.**/
public class Association {
	public static void main(String[] args) {

		Bank bank = new Bank("SBI");
		Employee emp = new Employee("Sudeep");

		System.out.println(emp.getEmployeeName() + " is employee of "
				+ bank.getBankName());
	}

}
