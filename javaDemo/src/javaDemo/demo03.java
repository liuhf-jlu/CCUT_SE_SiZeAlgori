//��������n������n�Ľ׳˺�
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
		System.out.println(tmp+"�Ľ׳ˣ�"+F);
	}
}
