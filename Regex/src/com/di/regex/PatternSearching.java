package com.di.regex;

// A Simple Java program to demonstrate working of 
//String matching in Java 
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternSearching {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("Sudeep");

		Matcher matcher = pattern.matcher("SudeepKumarKatiar");

		while (matcher.find())
			System.out.println("Pattern found from " + matcher.start() + " to " + (matcher.end() - 1));
	}

}
