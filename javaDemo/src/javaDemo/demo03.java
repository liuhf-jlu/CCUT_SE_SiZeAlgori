//输入整数n，计算n的阶乘和
package javaDemo;

import java.util.Scanner;

public class demo03 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int tmp=n;
		int F=1;
		while(n>0) {
			F*=n;
			n--;
		}
		System.out.println(tmp+"的阶乘："+F);
	}
}
