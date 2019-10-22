package shuanghui;

public class MyDate {
	/*
	 * 年月日成员变量
	 */
	int year;
	int month;
	int day;
	
	/*
	 * 获取年
	 */
	public int getYear() {
		return this.year;
	}
	/*
	 * 设置年
	 */
	public void setYear(int year) {
		this.year=year;
	}
	/*
	 * 显示日期
	 */
	public void show() {
		System.out.println(year+month+day);
	}
}
