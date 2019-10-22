package com.ccut.java191007;

/**
 * ������
 * @author DELL
 *
 */
public class Cone {
	
	Shape shape;
	double high;
	
	/**
	 * ���幹�췽��
	 * @param shape ����
	 * @param high ��
	 */
	public Cone(Shape shape,double high) {
		// TODO Auto-generated constructor stub
		this.shape=shape;
		this.high=high;
	}
	
	/**
	 * ���������
	 * @return �������
	 */
	public double getVolume() {
		return high*shape.getArea();
	}
	
	/**
	 * �����淽��
	 * @param shape ����
	 */
	public void setShape(Shape shape) {
		this.shape=shape;
	}
	
	
}
