package cn.edu.ccut.java;

/*
 * ��������̳��˾����࣬������������������ķ�������д�����������ܳ��ķ�����
 */
public class Square extends Rectangle {
	
	/*
	 * ���췽��
	 */
	public Square(double length) {
		super(length, length);
	}
	/*
	 * �����������
	 */
	public double getArea() {
		return this.length*this.weight;
	}
	/*
	 * �������ε��ܳ�
	 */
	public double getPerimeter() {
		return 2*(length+weight);
	}
}
