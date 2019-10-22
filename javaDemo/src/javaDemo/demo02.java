package javaDemo;

import java.util.Scanner;

public class demo02 {
	
 public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int x=input.nextInt();
	int tmp=x;
	int[] num= {0,0,0};
	int i=0;
	while(x!=0) {
		num[i]=x%10;
		x/=10;
		i++;
	}
	System.out.println(tmp+"µÄÄæĞò×éºÏ£º"+num[0]+num[1]+num[2]);
}
}
