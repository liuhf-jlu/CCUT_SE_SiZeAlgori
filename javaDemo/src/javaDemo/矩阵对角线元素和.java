package javaDemo;

import java.util.Scanner;

public class 矩阵对角线元素和 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a=new int[3][3];
		Scanner in=new Scanner(System.in);
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++) {
				a[i][j]=in.nextInt();
			}
		int sum=0;
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++) {
				if(i==j)
					sum+=a[i][j];
			}
		System.out.println("sum="+sum);
	}

}
