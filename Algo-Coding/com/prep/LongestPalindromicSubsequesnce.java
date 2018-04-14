package com.prep;

public class LongestPalindromicSubsequesnce {
	
	public static void main(String[] args) {

		String s = "LPASPAL";
		int subsequesnceLen = lps(s);
		System.out.println("Lenght of longest palindromic subsequence is : " +subsequesnceLen);
	}

	private static int lps(String s) {
		int n = s.length();
		int[][] palindrome = new int[n][n];
		
		for(int i = 0; i<n ;i++) {
			palindrome[i][i] = 1;
		}
		
		for(int k = 2; k<=n ;k++) {
			for(int i =0 ;i< n-k+1 ;i++) {
				int j = i+k-1;
				if(s.charAt(i)== s.charAt(j)) {
					palindrome[i][j] = 2 + palindrome[i+1][j-1];
				}
				else {
					palindrome[i][j] = Math.max(palindrome[i+1][j], palindrome[i][j-1]);
				}
			}
		}
		
		return palindrome[0][n-1];
	}
	
}
