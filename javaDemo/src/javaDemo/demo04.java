//��������n,�ж�n�Ƿ�Ϊ����
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
			System.out.print(n+"������");
		else
			System.out.print(n+"��������");
		
	}

}
