package cn.edu.ccut.java;

import java.util.Scanner;

/*
 * 测试Square类
 */
public class MainTest_Square {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("请输入正方形的长度：");
		double length=in.nextDouble();
		Square square=new Square(length);
		System.out.println("周长："+square.getPerimeter()+"面积："+square.getArea());

	}

}
