package com.blblz.fascade;

import com.blblz.factory.Circle;
import com.blblz.factory.Rectangle;
import com.blblz.factory.Shape;
import com.blblz.factory.Square;

public class ShapeMaker {
	
	private Shape circle;
	private Shape rectangle;
	private Shape square;
	
	public ShapeMaker() {
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}
	
	public void drawCircle() {
		circle.draw();
	}
	
	public void drawRectangle() {
		rectangle.draw();
	}
	
	public void drawSquare() {
		square.draw();
	}

}
