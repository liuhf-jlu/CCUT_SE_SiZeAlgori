//ͨ����������Ϊ����Ϊ10��int�����鸳ֵ����������������Ԫ�صĶ����ֵ�����ֵ��λ��

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
