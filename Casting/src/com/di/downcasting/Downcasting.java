package com.di.downcasting;

import com.di.upcasting.Sample1;
import com.di.upcasting.Sample2;

public class Downcasting {
	
	public static void main(String[] args) {
		
		Sample1 ref = new Sample2();  //First upcasting
		Sample2 ref1 = (Sample2) ref; //Explicitly downcasting
		
		System.out.println("value is "+ref1.d);
		ref1.disp();
		
		System.out.println("value is "+ref1.i);
		ref1.demo();
		
	}

}
