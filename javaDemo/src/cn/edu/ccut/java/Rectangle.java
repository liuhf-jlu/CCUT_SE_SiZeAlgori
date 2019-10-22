package cn.edu.ccut.java;

/*
 * Rectangle矩阵类封装了长、宽、面积、周长成员变量以及带参构造方法、求面积、求周长的实例方法
 */
public class Rectangle {
	double length;	//矩形长
	double weight;	//矩形宽
	
	public Rectangle(double length,double weight) {
		this.length=length;
		this.weight=weight;
	}
	/*
	 * 求矩形周长
	 */
	public double getPerimeter() {
		return 2*(length+weight);
	}
}