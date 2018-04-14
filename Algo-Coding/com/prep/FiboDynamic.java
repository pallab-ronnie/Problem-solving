package com.prep;

public class FiboDynamic {
	
	public static void main(String[] args) {

		System.out.println(fibo(5));
	}

	private static int fibo(int n) {
		if(n==1 || n==2)
			return 1;
		int[] fib = new int[n+1];
		fib[1] = 1;
		fib[2] = 1;
		
		return 1;
	}
	
}
