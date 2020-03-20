package com.di.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaseInsensitiveSearch {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("",Pattern.CASE_INSENSITIVE);
		
		Matcher matcher = pattern.matcher("SudeepKumarKatiar");
		while (matcher.find()) 
            System.out.println("Pattern found from " + matcher.start() + " to " + (matcher.end()-1)); 
	}

}
