package cn.edu.ccut.java;

import cn.edu.ccut.java.MyInteger;

public class Test_MyInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInteger i;
		int[] testArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // 测试序列
		/*
		 * 循环测试，尽可能多的覆盖函数
		 */
		for (int t = 0; t < testArray.length; t++) {

			i = new MyInteger();

			i.setValue(testArray[t]);

			System.out.println(i.getValue());

			if (i.isPrime(i))
				System.out.println("isPrime yes");
			else
				System.out.println("is Prime no");

			if (i.isOdd(i))
				System.out.println("is Odd yes");
			else
				System.out.println("is Odd no");

			if (i.isEven(i))
				System.out.println("is Even yes");
			else
				System.out.println("is Even no");
		}
	}
}
