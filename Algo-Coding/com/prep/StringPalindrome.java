package com.prep;

public class StringPalindrome {
	public static void main(String[] args) {
		String str = "kkkkllllkkkkllllllllkkkkllllkkkk";
		boolean status = isPalin(str);
		if(status)
			System.out.println("Palindrome");
		else
			System.out.println("Not palindrome");
	}

	private static boolean isPalin(String str) {
		char [] strArr = str.toCharArray();
		int n = strArr.length;
		for(int i=0;i<n/2;i++) {
			if(strArr[i] != strArr[n-i-1])
				return false;
		}
		return true;
	}
}
