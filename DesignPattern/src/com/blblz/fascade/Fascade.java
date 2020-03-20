package com.blblz.fascade;

public class Fascade {
	
	public static void main(String[] args) {
		
		ShapeMaker shapeMaker = new ShapeMaker();
		
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
}
