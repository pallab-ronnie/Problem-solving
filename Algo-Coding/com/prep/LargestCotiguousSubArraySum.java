package com.prep;

public class LargestCotiguousSubArraySum {
	
	public static void main(String[] args) {

		int a[] = {-2, -3, -4, -1, -2, -1, -5, -3 , 0};
	    int n = a.length;   
	    int max_sum = maxSubArraySum(a, n);
	    System.out.println("Maximum contiguous sum is "
	                       + max_sum);
	}

	private static int maxSubArraySum(int[] a, int n) {

		int maxSum = a[0];
		int currMax = a[0];
		
		for(int i = 1; i< n;i++) {
			currMax = Math.max(a[i], currMax + a[i]);
			maxSum = Math.max(maxSum, currMax);
		}
		
		return maxSum;
	}
	
}
