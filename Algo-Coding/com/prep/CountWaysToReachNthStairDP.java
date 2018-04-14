package com.prep;

import java.util.Scanner;

/*
 * A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3 steps at a time.
 * Implement a method to count how many possible ways the child can run up the stairs.
 */
public class CountWaysToReachNthStairDP {
	
	public static void main(String[] args) {

		System.out.println("Enter the number of the stair");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("Number of ways to reach the stair is : " + findWays(n));
	}

	private static int findWays(int n) {
		int res[] = new int[n+1];
		res[0] = 1;
		res[1] = 1;
		res[2] = 2;
		
		for(int i = 3; i<=n;i++) {
			res[i] = res[i-3] + res[i-2] + res[i-1];
		}
		
		return res[n];
	}

	/*private static int findWays(int n) {
		if (n==1 || n==0)
			return 1;
		else if(n==2)
			return 2;
		else
			return findWays(n-3) + findWays(n-2) + findWays(n-1);
	}
	*/
	
}
