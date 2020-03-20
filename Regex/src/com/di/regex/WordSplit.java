package com.di.regex;

import java.util.regex.Pattern;

public class WordSplit {
	public static void main(String[] args) {
		String text = "Sudeep1Kumar2Katiar3";
		
	String delimiter = "\\d";
	Pattern pattern = Pattern.compile(delimiter, Pattern.CASE_INSENSITIVE);
	String[] result =  pattern.split(text);
	
	for(String temp:result)
		System.out.println(temp);
	}

}
