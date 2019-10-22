package com.ccut.java191007;

/**
 * 梯形类，实现了Shape接口
 * @author DELL
 *
 */
public class Trapezium implements Shape{
	private double t1;
	private double t2;
	private double h;
	
	/**
	 * 梯形构造方法
	 * @param t1
	 * @param t2
	 * @param t
	 */
	public Trapezium(double t1,double t2,double t) {
		// TODO Auto-generated constructor stub
		this.t1=t1;
		this.t2=t2;
		this.h=h;
	}


	public double getT1() {
		return t1;
	}

	public void setT1(double t1) {
		this.t1 = t1;
	}

	public double getT2() {
		return t2;
	}

	public void setT2(double t2) {
		this.t2 = t2;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	/**
	 * 求梯形面积
	 */
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (t1+t2)*h/2;
	}
	
	
}
