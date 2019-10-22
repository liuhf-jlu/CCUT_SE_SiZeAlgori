package com.ccut.java191007;

/**
 * 柱体类
 * @author DELL
 *
 */
public class Cone {
	
	Shape shape;
	double high;
	
	/**
	 * 柱体构造方法
	 * @param shape 底面
	 * @param high 高
	 */
	public Cone(Shape shape,double high) {
		// TODO Auto-generated constructor stub
		this.shape=shape;
		this.high=high;
	}
	
	/**
	 * 求柱体体积
	 * @return 柱体体积
	 */
	public double getVolume() {
		return high*shape.getArea();
	}
	
	/**
	 * 换底面方法
	 * @param shape 底面
	 */
	public void setShape(Shape shape) {
		this.shape=shape;
	}
	
	
}
