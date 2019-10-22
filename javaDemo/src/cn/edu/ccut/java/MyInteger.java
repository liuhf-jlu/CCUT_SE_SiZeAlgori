package cn.edu.ccut.java;
import org.junit.Test;

public class MyInteger {
	/*
	 * 私有成员变量
	 */
	private int value;
	
	/*
	 * 无参数构造方法
	 */
	public MyInteger() {
		value=0;
	}
	/*
	 * set方法
	 */
	public int getValue() {
		return value;
	}
	/*
	 * get方法
	 */
	public void setValue(int value) {
		this.value = value;
	}
	/*
	 * 判断是否是偶数
	 */
	public boolean isEven(MyInteger i) {
		boolean flag=false;
		if((i.getValue()&1)==0)
			flag=true;	
		else
			flag=false;
		return flag;
	}
	/*
	 * 判断是否是奇数
	 */
	public boolean isOdd(MyInteger i) {
		boolean flag=false;
		if((i.getValue()&1)==1)
			flag=true;	
		else
			flag=false;
		return flag;
	}
	/*
	 * 判断是否是素数
	 */
	public boolean isPrime(MyInteger i) {
		boolean flag=true;
		for(int j=2;j<(i.getValue()/2);j++){
			if((i.getValue())%j==0) {
				flag=false;
				break;
			}
		}
		return flag;
	}
	
	/*
	 * 测试方法
	 */
	@Test
	public void test() {
		MyInteger i;
		int[] testArray= {1,2,3,4,5,6,7,8,9,10}; //测试序列
		/*
		 * 循环测试，尽可能多的覆盖函数
		 */
		for(int t=0;t<testArray.length;t++) {
			
			i=new MyInteger();
			
			i.setValue(testArray[t]);
			
			System.out.println(i.getValue());
			
			if(i.isPrime(i))
				System.out.println("isPrime yes");
			else
				System.out.println("is Prime no");
		
			if(i.isOdd(i))
				System.out.println("is Odd yes");
			else
				System.out.println("is Odd no");
		
			if(i.isEven(i))
				System.out.println("is Even yes");
			else
				System.out.println("is Even no");
			
		}
	}
}
