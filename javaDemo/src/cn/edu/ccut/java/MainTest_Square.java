package cn.edu.ccut.java;

import java.util.Scanner;

/*
 * ����Square��
 */
public class MainTest_Square {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("�����������εĳ��ȣ�");
		double length=in.nextDouble();
		Square square=new Square(length);
		System.out.println("�ܳ���"+square.getPerimeter()+"�����"+square.getArea());

	}

}
