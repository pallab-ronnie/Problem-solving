package com.prep;

public class LongestConsecutiveCharacters {
	
	public static void main(String[] args) {

		String s = "AABCDDBBBBBEEEAAA";
		System.out.println(longestConsecutiveCharacters(s));
	}

	private static char longestConsecutiveCharacters(String s) {

		char[] arr = s.toCharArray();
		int maxCount = 0;
		char maxChar = '\0';
		int count = 1;
		
		for(int i = 0; i< arr.length -1 ;i++) {
			if(arr[i] == arr[i+1]) {
				count ++;
			}
			else {
				count = 1;
			}
			
			if(maxCount < count) {
				maxCount = count;
				maxChar = arr[i];
			}
		}
		
		return maxChar;
		
	}
	
}
