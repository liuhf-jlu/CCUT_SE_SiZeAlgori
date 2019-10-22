package A;

public class Computer {
	public int jc(int n) {
		if(n==1)
			return 1;
		else 
			return n*jc(n-1);
	}
}
