package com.di.upcasting;

public class Upcasting {
	
	public static void main(String[] args) {
		
		Sample1 ref1 = new Sample2();  // explicitly upcasting
		System.out.println("value is "+ref1.i);
		
		Sample1 ref2 = new Sample2();  // implicitly
		System.out.println("value is "+ref2.i);
		ref2.disp();
	}

}
