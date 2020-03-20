package com.blblz.prototype;

public class Square extends Shape {
	
	public Square() {
		String type = "Square";
	}

	@Override
	void draw() {
		System.out.println("Square");
	}

}
