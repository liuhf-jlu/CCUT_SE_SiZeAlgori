package cn.edu.ccut.java;

/*
 * 正方形类继承了矩形类，定义了求正方形面积的方法，重写了求正方形周长的方法。
 */
public class Square extends Rectangle {
	
	/*
	 * 构造方法
	 */
	public Square(double length) {
		super(length, length);
	}
	/*
	 * 求正方形面积
	 */
	public double getArea() {
		return this.length*this.weight;
	}
	/*
	 * 求正方形的周长
	 */
	public double getPerimeter() {
		return 2*(length+weight);
	}
}
