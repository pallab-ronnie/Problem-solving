package com.prep;

public class LongestPalindromicSubstring {
	
	public static void main(String[] args) {

		System.out.println("The longest Palindromic Sunsequence is : " + "\"" + LPS("banana") + "\"");
	}

	private static String LPS(String s) {
		
		int n = s.length();
		int palindromeBeginsAt = 0;
		int maxLen = 0;
		boolean palin[][] = new boolean[n][n];
		
		//For subString of len 1
		for(int i = 0;i<n;i++) {
			palin[i][i] = true;
		}
		
		//for subString of length 2
		for(int i = 0;i<n-1;i++) {
			if(s.charAt(i) == s.charAt(i+1)) {
				palin[i][i+1] = true;
				palindromeBeginsAt = i;
				maxLen = 2;
			}
		}
		
		//for subString of length more than 2
		for(int k = 3; k<=n ;k++) {
			for(int i = 0; i<n-k+1 ; i++) {
				int j = i+k-1;
				if(s.charAt(i) == s.charAt(j) && palin[i+1][j-1]) {
					palin[i][j] = true;
					palindromeBeginsAt = i;
					maxLen = k;
				}
			}
		}
		
		System.out.println("Length of longest palindromic subsequence is " + maxLen);
		
		return s.substring(palindromeBeginsAt, palindromeBeginsAt+maxLen);
		
	}
	
}
