package cn.edu.ccut.java;
import org.junit.Test;

public class MyInteger {
	/*
	 * ˽�г�Ա����
	 */
	private int value;
	
	/*
	 * �޲������췽��
	 */
	public MyInteger() {
		value=0;
	}
	/*
	 * set����
	 */
	public int getValue() {
		return value;
	}
	/*
	 * get����
	 */
	public void setValue(int value) {
		this.value = value;
	}
	/*
	 * �ж��Ƿ���ż��
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
	 * �ж��Ƿ�������
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
	 * �ж��Ƿ�������
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
	 * ���Է���
	 */
	@Test
	public void test() {
		MyInteger i;
		int[] testArray= {1,2,3,4,5,6,7,8,9,10}; //��������
		/*
		 * ѭ�����ԣ������ܶ�ĸ��Ǻ���
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
