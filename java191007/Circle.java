package com.ccut.java191007;

/**
 * Բ�࣬ʵ��Shape�ӿ�
 * @author DELL
 *
 */
public class Circle implements Shape{
	private double radius;
	private static double PI=3.1415926;
	
	/**
	 * Բ�ι��췽��
	 * @param radius
	 */
	public Circle(double radius) {
		// TODO Auto-generated constructor stub
		this.radius=radius;
	}
	

	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public static double getPI() {
		return PI;
	}
	
	/**
	 * ��Բ�����
	 */
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return PI*Math.pow(radius, 2);
	}

}
