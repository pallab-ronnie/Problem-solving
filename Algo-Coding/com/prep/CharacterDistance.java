package com.prep;

import java.util.Arrays;

public class CharacterDistance {

	public static void main(String[] args) {

		String str = "PallabSengupta";
		char[] arrStr = str.toCharArray();
		char a = 'S';
		char b = 'l';
		int mindist = findMinDist(arrStr, a, b);
		int mindist2 = findMinDist2(arrStr, a, b);
		System.out.println("Minimum dist " + mindist2);
	}


	private static int findMinDist(char[] arr, char a, char b) {

		int dist = Integer.MAX_VALUE;
		int i = 0;
		int n = arr.length;
		int prev = 0;

		for(i=0; i<n; i++) {
			if(arr[i] == a || arr[i] == b) {
				prev = i;
				break;
			}
		}

		for(; i<n ;i++) {
			if(arr[i] == a || arr[i] == b) {
				if((arr[prev] != arr[i]) && ((i - prev) < dist)) {
					dist = i - prev;
					prev = i;
				}
				else {
					prev = i;
				}
			}
		}
		return dist;
	}
	
	private static int findMinDist2(char[] arr, char a, char b) {
		int dist = Integer.MAX_VALUE;
		int n = arr.length;
		for(int i = 0; i<n ;i ++) {
			for(int j = i+1; j<n ;j++) {
				if((arr[i] == a && arr[j] == b || (arr[i] == b && arr[j] == a))
						&& dist > Math.abs(i-j)) {
					dist = Math.abs(i-j);
				}
			}
		}
		return dist;
	}

}
