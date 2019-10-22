package javaDemo;

import java.util.Scanner;

/*
  * QuadrangularΪ�������࣬��װ�˵��桢�ߡ������Ա�����Լ����ι��췽�����������桢�������ʵ������
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
 * Rectangle�������װ�˳�����������ܳ���Ա�����Լ����ι��췽��������������ܳ���ʵ������
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
		
		System.out.println("���볤������ ��");
		length=input.nextDouble();
		weight=input.nextDouble();
		high=input.nextDouble();
		Rectangle rec=new Rectangle(length, weight);
		Quadrangular qua=new Quadrangular(rec, high);
		System.out.println("Area="+rec.getArea()+",Perimeter="+rec.getPerimeter()+",Volume="+qua.get_volume());
		
		System.out.println("���ף��������볤����");
		length=input.nextDouble();
		weight=input.nextDouble();
		rec=new Rectangle(length,weight);
		qua.change_Rec(rec);
		System.out.println("Area="+rec.getArea()+",Perimeter="+rec.getPerimeter()+",Volume="+qua.get_volume());
	}
}
