package B;
import java.util.Scanner;

import A.Computer;

public class App {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		Computer com=new Computer();
		System.out.println(n+"£¡="+com.jc(n));
	}

}
