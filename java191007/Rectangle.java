package com.ccut.java191007;

/**
 * �����࣬ʵ��Shape�ӿ�
 * @author DELL
 *
 */
public class Rectangle implements Shape{
	private double length;
	private double weight;
	
	/**
	 * ���ι��췽��
	 * @param length
	 * @param weight
	 */
	public Rectangle(double length,double weight) {
		// TODO Auto-generated constructor stub
		this.length=length;
		this.weight=weight;
	}
	
	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	/**
	 * ��������
	 */
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length*weight;
	}
	

}
