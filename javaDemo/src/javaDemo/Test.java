package javaDemo;

import javaDemo.MyPoint;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MyPoint[] p = new MyPoint[2];
		for (int i = 0; i < 2; i++) {
			System.out.println("�����p" + (i + 1) + "�ģ�x,y�����꣺");
			double x = input.nextDouble();
			double y = input.nextDouble();
			p[i] = new MyPoint(x, y);
		}
		System.out.println("��(" + p[0].x + "," + p[0].y + ")" + "���" + "(" + p[1].x + "," + p[1].y + ")" + "�ľ����� "
				+ MyPoint.distance(p[0], p[1]));
	}
}



