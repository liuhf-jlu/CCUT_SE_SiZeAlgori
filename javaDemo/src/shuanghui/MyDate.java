package shuanghui;

public class MyDate {
	/*
	 * �����ճ�Ա����
	 */
	int year;
	int month;
	int day;
	
	/*
	 * ��ȡ��
	 */
	public int getYear() {
		return this.year;
	}
	/*
	 * ������
	 */
	public void setYear(int year) {
		this.year=year;
	}
	/*
	 * ��ʾ����
	 */
	public void show() {
		System.out.println(year+month+day);
	}
}
