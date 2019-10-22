/*
 * 输入两个数，计算其最大公约数与最小公倍数
 */
package javaDemo;

import java.util.Scanner;

public class 最大公约数与最小公倍数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		System.out.println(a+"，"+b+"的最大公约数是："+getHCF(a,b));
		System.out.println(a+","+b+"的最小公倍数是："+getLCM(a,b));
	}

	/*
	 * 辗转相除法
	 */
	public static int getHCF(int m,int n) {
		if(m>n) {
			int tmp=m;
			m=n;
			n=tmp;
		}
		int z=m;
		while(m%n!=0) {
			z=m%n;
			m=n;
			n=z;
		}
		return z;	
	}
	
	/*
	 * 最大公倍数
	 */
	public static int getLCM(int m,int n) {
		int c=m*n;
		int max,min;
		max=m>n?m:n;
		min=m<n?m:n;
		while(true) {
			int tmp=max%min;
			if(tmp==0) {
				return c/min;
			}
			else {
				max=min;
				min=tmp;
			}
		}
	}
}
