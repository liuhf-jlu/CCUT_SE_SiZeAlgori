package com.ccut.java191007;

/**
 * 三角形类，实现了Shape接口
 * @author DELL
 *
 */
public class Triangle implements Shape{
	private double edgeA;
	private double edgeB;
	private double edgeC;
	
	/**
	 * 三角形构造方法
	 * @param edgeA
	 * @param edgeB
	 * @param edgeC
	 */
	public Triangle(double edgeA,double edgeB,double edgeC) {
		// TODO Auto-generated constructor stub
		this.edgeA=edgeA;
		this.edgeB=edgeB;
		this.edgeC=edgeC;
	}

	public double getEdgeA() {
		return edgeA;
	}

	public void setEdgeA(double edgeA) {
		this.edgeA = edgeA;
	}

	public double getEdgeB() {
		return edgeB;
	}

	public void setEdgeB(double edgeB) {
		this.edgeB = edgeB;
	}

	public double getEdgeC() {
		return edgeC;
	}

	public void setEdgeC(double edgeC) {
		this.edgeC = edgeC;
	}

	/**
	 * 求三角形面积
	 */
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double p=(edgeA+edgeB+edgeC)/2;
		return Math.sqrt(p*(p-edgeA)*(p-edgeB)*(p-edgeC));
	}
	
	
}
