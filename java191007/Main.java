package com.ccut.java191007;

import java.util.Scanner;

/**
 * ��������
 * 
 * @author DELL
 *
 */
public class Main {

	/**
	 * ���ýӿںͽӿڻص���ʵ�ּ򵥹���ģʽ�������벻ͬ���ַ���������Ӧͼ��ʱ�����ù�������ͼ�ζ����ټ����Ը�ͼ��Ϊ�׵����������
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		ShapeFactory factory = new ShapeFactory(); // �����࣬��������ͼ�ε�ʵ��������
		Shape shape; // shape�ӿ�
		Cone cone = null; // �������
		String shapeType;
		while (true) {
			shapeType="";
			System.out.println("������Ҫ��������ͣ�Rec��Squ��Cir,Tra,Tri����");
			shapeType = in.nextLine();

			if (shapeType.equals("Rec")) {
				System.out.println("��������εĳ�����");
				double length = in.nextDouble();
				double weigtht = in.nextDouble();
				shape = factory.getShapes(shapeType, length, weigtht);
				System.out.println("���������" + shape.getArea());
				System.out.println("����������ĸߣ�");
				double h = in.nextDouble();
				cone = new Cone(shape, h);
				System.out.println("����������" + cone.getVolume());

			} else if (shapeType.equals("Squ")) {
				System.out.println("�����������εĳ���");
				double length = in.nextDouble();
				shape = factory.getShape(shapeType, length);
				System.out.println("�����������" + shape.getArea());
				System.out.println("����������ĸߣ�");
				double h = in.nextDouble();
				cone = new Cone(shape, h);
				System.out.println("����������" + cone.getVolume());

			} else if (shapeType.equals("Cir")) {
				System.out.println("������Բ�εİ뾶��");
				double radius = in.nextDouble();
				shape = factory.getShape(shapeType, radius);
				System.out.println("Բ�������" + shape.getArea());
				System.out.println("����������ĸߣ�");
				double h = in.nextDouble();
				cone = new Cone(shape, h);
				System.out.println("����������" + cone.getVolume());

			} else if (shapeType.equals("Tra")) {
				System.out.println("���������ε��ϵס��µס��ߣ�");
				double t1 = in.nextDouble();
				double t2 = in.nextDouble();
				double h = in.nextDouble();
				shape = factory.getShapes(shapeType, t1, t2, h);
				System.out.println("���ε������" + shape.getArea());
				System.out.println("����������ĸߣ�");
				double h_ = in.nextDouble();
				cone = new Cone(shape, h_);
				System.out.println("����������" + cone.getVolume());

			} else if (shapeType.equals("Tri")) {
				System.out.println("�����������ε����ߣ�");
				double a = in.nextDouble();
				double b = in.nextDouble();
				double c = in.nextDouble();
				shape = factory.getShapes(shapeType, a, b, c);
				System.out.println("�����ε������" + shape.getArea());
				System.out.println("����������ĸߣ�");
				double h = in.nextDouble();
				cone = new Cone(shape, h);
				System.out.println("����������" + cone.getVolume());
			}

			System.out.println("���ף���������Ҫ���ĵ��棨Rec��Squ��Cir,Tra,Tri����");
			Scanner in_=new Scanner(System.in);
			String changeType=in_.nextLine();
			if (changeType.equals("Rec")) {
				System.out.println("��������εĳ�����");
				double length = in_.nextDouble();
				double weigth = in_.nextDouble();
				shape = factory.getShapes(changeType, length, weigth);
				System.out.println("���������" + shape.getArea());
				cone.setShape(shape);
				System.out.println("����������" + cone.getVolume());

			} else if (changeType.equals("Squ")) {
				System.out.println("�����������εĳ���");
				double length = in_.nextDouble();
				shape = factory.getShape(changeType, length);
				System.out.println("�����������" + shape.getArea());
				cone.setShape(shape);
				System.out.println("����������" + cone.getVolume());

			} else if (changeType.equals("Cir")) {
				System.out.println("������Բ�εİ뾶��");
				double radius = in_.nextDouble();
				shape = factory.getShape(changeType, radius);
				System.out.println("Բ�������" + shape.getArea());
				cone.setShape(shape);
				System.out.println("����������" + cone.getVolume());

			} else if (changeType.equals("Tra")) {
				System.out.println("���������ε��ϵס��µס��ߣ�");
				double t1 = in_.nextDouble();
				double t2 = in_.nextDouble();
				double h = in_.nextDouble();
				shape = factory.getShapes(changeType, t1, t2, h);
				System.out.println("���ε������" + shape.getArea());
				cone.setShape(shape);
				System.out.println("����������" + cone.getVolume());

			} else if (changeType.equals("Tri")) {
				System.out.println("�����������ε����ߣ�");
				double a = in_.nextDouble();
				double b = in_.nextDouble();
				double c = in_.nextDouble();
				shape = factory.getShapes(changeType, a, b, c);
				System.out.println("�����ε������" + shape.getArea());
				cone.setShape(shape);
				System.out.println("����������" + cone.getVolume());
			}
			
			System.out.println("----------------------------------------------");
			in.nextLine();
			in_.nextLine();
		}

	}

}
