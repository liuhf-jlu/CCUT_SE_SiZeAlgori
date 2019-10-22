//输入整数n,判断n是否为素数
package javaDemo;

import java.util.Scanner;

public class demo04 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		boolean flag=true;
		for(int i=2;i<n;i++) {
			if(n%i==0)
				flag=false;
		}
		if(flag)
			System.out.print(n+"是素数");
		else
			System.out.print(n+"不是素数");
		
	}

}
