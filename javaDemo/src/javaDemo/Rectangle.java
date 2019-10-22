package javaDemo;

import java.util.Scanner;

/*
  * Quadrangular为四棱柱类，封装了底面、高、体积成员变量以及带参构造方法、更换底面、求体积的实例方法
 */
class Quadrangular {
	Rectangle rec;
	double high;
	double volume;
	
	public Quadrangular(Rectangle rec,double high) {
		this.rec=rec;
		this.high=high;
	}
	
	public double get_volume() {
		volume=high*rec.getArea();
		return volume;
	}
	
	public void change_Rec(Rectangle rec) {
		this.rec=rec;
	}
	
}

/*
 * Rectangle矩阵类封装了长、宽、面积、周长成员变量以及带参构造方法、求面积、求周长的实例方法
 */
public class Rectangle {
	double length;
	double weight;
	double area;
	double perimeter;
	
	public Rectangle(double length,double weight) {
		this.length=length;
		this.weight=weight;
	}
	public double getArea() {
		area=length*weight;
		return area;
	}
	public double getPerimeter() {
		perimeter=2*(length+weight);
		return perimeter;
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double length=0.0, weight=0.0,high=0.0;
		
		System.out.println("输入长、宽、高 ：");
		length=input.nextDouble();
		weight=input.nextDouble();
		high=input.nextDouble();
		Rectangle rec=new Rectangle(length, weight);
		Quadrangular qua=new Quadrangular(rec, high);
		System.out.println("Area="+rec.getArea()+",Perimeter="+rec.getPerimeter()+",Volume="+qua.get_volume());
		
		System.out.println("换底，重新输入长、宽：");
		length=input.nextDouble();
		weight=input.nextDouble();
		rec=new Rectangle(length,weight);
		qua.change_Rec(rec);
		System.out.println("Area="+rec.getArea()+",Perimeter="+rec.getPerimeter()+",Volume="+qua.get_volume());
	}
}
