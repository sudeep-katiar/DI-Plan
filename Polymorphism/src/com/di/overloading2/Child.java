package com.di.overloading2;

// Child class
public class Child extends Parent {
	
	public void m1(int x) { // var args method cannot be overridden

		System.out.println("Child method");
		
	}

}
