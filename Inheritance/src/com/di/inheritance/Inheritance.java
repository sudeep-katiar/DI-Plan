package com.di.inheritance;

public class Inheritance {

	public static void main(String[] args) {

		Sample2 ref1 = new Sample2();
		System.out.println(ref1.d);
		ref1.data();
		System.out.println(ref1.i);

		Sample3 ref2 = new Sample3();
		System.out.println(ref2.c);
		ref2.demo();
		System.out.println(ref2.i);

	}

}
