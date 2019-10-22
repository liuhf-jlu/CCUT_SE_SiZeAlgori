package javaDemo;

import javaDemo.MyPoint;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MyPoint[] p = new MyPoint[2];
		for (int i = 0; i < 2; i++) {
			System.out.println("输入点p" + (i + 1) + "的（x,y）坐标：");
			double x = input.nextDouble();
			double y = input.nextDouble();
			p[i] = new MyPoint(x, y);
		}
		System.out.println("点(" + p[0].x + "," + p[0].y + ")" + "与点" + "(" + p[1].x + "," + p[1].y + ")" + "的距离是 "
				+ MyPoint.distance(p[0], p[1]));
	}
}



