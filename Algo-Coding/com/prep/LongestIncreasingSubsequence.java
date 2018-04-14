package com.prep;

/*
 * Input  : arr[] = {3, 10, 2, 1, 20}
Output : Length of LIS = 3
The longest increasing subsequence is 3, 10, 20

Input  : arr[] = {3, 2}
Output : Length of LIS = 1
The longest increasing subsequences are {3} and {2}

Input : arr[] = {50, 3, 10, 7, 40, 80}
Output : Length of LIS = 4
The longest increasing subsequence is {3, 7, 40, 80}
 */

public class LongestIncreasingSubsequence {
	
	public static int lis(int arr[], int n) {
		int max = 0;
		int lis[] = new int[n];
		
		for(int i = 0; i<n ;i++) {
			lis[i] = 1;
		}
		
		for(int i = 1;i<n;i++) {
			for(int j = 0;j<i;j++) {
				if(arr[i] > arr[j] && lis[i] < lis[j] + 1) {
					lis[i] = lis[j] + 1;
				}
			}
		}
		
		for(int i = 0;i<n;i++) {
			if(max<lis[i]) {
				max = lis[i];
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		int arr[] = {3, 10, 2, 1, 20};
		int n = arr.length;
		int lisLen = lis(arr, n);
		System.out.println(lisLen);
	}
}
