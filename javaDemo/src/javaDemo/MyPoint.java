package javaDemo;

import java.util.Scanner;

public class MyPoint {
	double x;
	double y;

	public MyPoint() {
		x = 0.0;
		y = 0.0;
	}

	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public static double distance(MyPoint A, MyPoint B) {
		double distance = Math.sqrt((A.x - B.x) * (A.x - B.x) + (A.y + B.y) * (A.y + B.y));
		return distance;
	}

}