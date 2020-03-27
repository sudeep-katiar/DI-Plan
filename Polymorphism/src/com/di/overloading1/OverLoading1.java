package com.di.overloading1;

// simple overloading program
public class OverLoading1 {

	public static void main(String[] args) {

		SimpleCalculator calculator = new SimpleCalculator();

		System.out.println(calculator.add(10, 20));
		System.out.println(calculator.add(10, 20, 30));

	}

}
