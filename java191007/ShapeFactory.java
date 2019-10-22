package com.ccut.java191007;


public class ShapeFactory {

	public Shape getShape(String shapeType,double a) {
		if (shapeType == null)
			return null;
		 if (shapeType.equals("Squ")) {
			return (Shape) new Square(a);
		}
		else if (shapeType.equals("Cir")) {
			return (Shape) new Circle(a);
		}  
		return null;
	}
	
	public Shape getShapes(String shapeType,double a,double b) {
		if (shapeType == null)
			return null;
		if (shapeType.equals("Rec")) {
			return new Rectangle(a, b);
		}		
		return null;
		
	}
	
	public Shape getShapes(String shapeType,double a,double b,double c) {
		if (shapeType == null)
			return null;
		if (shapeType.equals("Tra")) {
			return new Trapezium(a,b,c);
		} 
		if (shapeType.equals("Tri")) {
			return new Triangle(a,b,c);
		}
		return null;
	}

}
