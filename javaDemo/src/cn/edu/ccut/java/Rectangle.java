package cn.edu.ccut.java;

/*
 * Rectangle�������װ�˳�����������ܳ���Ա�����Լ����ι��췽��������������ܳ���ʵ������
 */
public class Rectangle {
	double length;	//���γ�
	double weight;	//���ο�
	
	public Rectangle(double length,double weight) {
		this.length=length;
		this.weight=weight;
	}
	/*
	 * ������ܳ�
	 */
	public double getPerimeter() {
		return 2*(length+weight);
	}
}