package com.ccut.java191007;

import java.util.Scanner;

/**
 * 主方法类
 * 
 * @author DELL
 *
 */
public class Main {

	/**
	 * 利用接口和接口回调，实现简单工厂模式，当输入不同的字符，代表相应图形时，利用工厂类获得图形对象，再计算以该图形为底的柱体体积。
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		ShapeFactory factory = new ShapeFactory(); // 工厂类，用于生产图形的实例化对象
		Shape shape; // shape接口
		Cone cone = null; // 柱体对象
		String shapeType;
		while (true) {
			shapeType="";
			System.out.println("输入你要计算的类型（Rec，Squ，Cir,Tra,Tri）：");
			shapeType = in.nextLine();

			if (shapeType.equals("Rec")) {
				System.out.println("请输入矩形的长、宽：");
				double length = in.nextDouble();
				double weigtht = in.nextDouble();
				shape = factory.getShapes(shapeType, length, weigtht);
				System.out.println("矩形面积：" + shape.getArea());
				System.out.println("请输入柱体的高：");
				double h = in.nextDouble();
				cone = new Cone(shape, h);
				System.out.println("柱体的体积：" + cone.getVolume());

			} else if (shapeType.equals("Squ")) {
				System.out.println("请输入正方形的长：");
				double length = in.nextDouble();
				shape = factory.getShape(shapeType, length);
				System.out.println("正方形面积：" + shape.getArea());
				System.out.println("请输入柱体的高：");
				double h = in.nextDouble();
				cone = new Cone(shape, h);
				System.out.println("柱体的体积：" + cone.getVolume());

			} else if (shapeType.equals("Cir")) {
				System.out.println("请输入圆形的半径：");
				double radius = in.nextDouble();
				shape = factory.getShape(shapeType, radius);
				System.out.println("圆形面积：" + shape.getArea());
				System.out.println("请输入柱体的高：");
				double h = in.nextDouble();
				cone = new Cone(shape, h);
				System.out.println("柱体的体积：" + cone.getVolume());

			} else if (shapeType.equals("Tra")) {
				System.out.println("请输入梯形的上底、下底、高：");
				double t1 = in.nextDouble();
				double t2 = in.nextDouble();
				double h = in.nextDouble();
				shape = factory.getShapes(shapeType, t1, t2, h);
				System.out.println("梯形的面积：" + shape.getArea());
				System.out.println("请输入柱体的高：");
				double h_ = in.nextDouble();
				cone = new Cone(shape, h_);
				System.out.println("柱体的体积：" + cone.getVolume());

			} else if (shapeType.equals("Tri")) {
				System.out.println("请输入三角形的三边：");
				double a = in.nextDouble();
				double b = in.nextDouble();
				double c = in.nextDouble();
				shape = factory.getShapes(shapeType, a, b, c);
				System.out.println("三角形的面积：" + shape.getArea());
				System.out.println("请输入柱体的高：");
				double h = in.nextDouble();
				cone = new Cone(shape, h);
				System.out.println("柱体的体积：" + cone.getVolume());
			}

			System.out.println("换底：请输入你要换的底面（Rec，Squ，Cir,Tra,Tri）：");
			Scanner in_=new Scanner(System.in);
			String changeType=in_.nextLine();
			if (changeType.equals("Rec")) {
				System.out.println("请输入矩形的长、宽：");
				double length = in_.nextDouble();
				double weigth = in_.nextDouble();
				shape = factory.getShapes(changeType, length, weigth);
				System.out.println("矩形面积：" + shape.getArea());
				cone.setShape(shape);
				System.out.println("柱体的体积：" + cone.getVolume());

			} else if (changeType.equals("Squ")) {
				System.out.println("请输入正方形的长：");
				double length = in_.nextDouble();
				shape = factory.getShape(changeType, length);
				System.out.println("正方形面积：" + shape.getArea());
				cone.setShape(shape);
				System.out.println("柱体的体积：" + cone.getVolume());

			} else if (changeType.equals("Cir")) {
				System.out.println("请输入圆形的半径：");
				double radius = in_.nextDouble();
				shape = factory.getShape(changeType, radius);
				System.out.println("圆形面积：" + shape.getArea());
				cone.setShape(shape);
				System.out.println("柱体的体积：" + cone.getVolume());

			} else if (changeType.equals("Tra")) {
				System.out.println("请输入梯形的上底、下底、高：");
				double t1 = in_.nextDouble();
				double t2 = in_.nextDouble();
				double h = in_.nextDouble();
				shape = factory.getShapes(changeType, t1, t2, h);
				System.out.println("梯形的面积：" + shape.getArea());
				cone.setShape(shape);
				System.out.println("柱体的体积：" + cone.getVolume());

			} else if (changeType.equals("Tri")) {
				System.out.println("请输入三角形的三边：");
				double a = in_.nextDouble();
				double b = in_.nextDouble();
				double c = in_.nextDouble();
				shape = factory.getShapes(changeType, a, b, c);
				System.out.println("三角形的面积：" + shape.getArea());
				cone.setShape(shape);
				System.out.println("柱体的体积：" + cone.getVolume());
			}
			
			System.out.println("----------------------------------------------");
			in.nextLine();
			in_.nextLine();
		}

	}

}
