package com.di.regex;

//A Simple Java program to demonstrate working of 
// Pattern.matches() in Java 
import java.util.regex.Pattern;

public class MatchPattern {

	public static void main(String args[]) {
		
		System.out.println(Pattern.matches("sudeepkumarkatiar", "sudeepkumarkatiar"));

		System.out.println(Pattern.matches("s*deepkumar", "sandeepkumar"));
	}
}
