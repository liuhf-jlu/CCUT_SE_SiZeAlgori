//通过键盘输入为长度为10的int型数组赋值，并求得数组中最大元素的额最大值及最大值的位置

package javaDemo;

import java.util.Scanner;

public class demo05 {
	public static void main(String[] args) {
		int[] n=new int[10];
		int max;
		int position;
		Scanner input=new Scanner(System.in);
		for(int i=0;i<n.length;i++) {
			n[i]=input.nextInt();
		}
		max=n[0];
		position=0;
		for(int j=0;j<n.length;j++) {
			if(max<n[j]) {
				max=n[j];
				position=j+1;
			}
		}
		System.out.println("Max="+max+",Position="+position);
	}
}
