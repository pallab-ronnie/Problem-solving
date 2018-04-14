package com.prep;

import java.util.Arrays;

public class FindMinDifference {

	public static void main(String[] args) {
		int arr[] = {1, 3,8, 20};
		int minDiff = findMinDiff(arr);
		System.out.println("Minimum difference " + minDiff);
		int minDiff2 = findMinDiff2(arr);
		System.out.println("Minimum difference " + minDiff2);
	}

	private static int findMinDiff2(int[] arr) {
		int minDiff = Integer.MAX_VALUE;
		int n = arr.length;
		Arrays.sort(arr);
		for(int i = 0;i<n-1;i++) {
			if((arr[i+1] - arr[i]) < minDiff) {
				minDiff = (arr[i+1] - arr[i]);
			}
		}
		return minDiff;
	}

	private static int findMinDiff(int[] arr) {
		int minDiff = Integer.MAX_VALUE;
		int n = arr.length;
		for(int i = 0; i< n-1; i++) {
			for(int j = i+1; j<n ; j++) {
				if(Math.abs(arr[i] - arr[j]) < minDiff) {
					minDiff = Math.abs(arr[i] - arr[j]);
				}
			}
		}
		return minDiff;
	}
}
