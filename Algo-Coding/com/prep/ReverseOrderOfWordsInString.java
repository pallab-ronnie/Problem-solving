package com.prep;

public class ReverseOrderOfWordsInString {
	
	public static void main(String[] args) {

		String str = "My Name Is Pallab";
		reverseOrderOfWords(str);
	}

	private static void reverseOrderOfWords(String str) {

		String[] words = str.split(" ");
		String reverseLine = "";
		for(int i = 0; i<words.length ; i++) {
			reverseLine = reverseLine + reverse(words[i]) + " ";
		}
		System.out.println(reverse(reverseLine.trim()));
	}

	private static String reverse(String string) {
		int len = string.length()-1;
		char[] strArr = string.toCharArray();
		for(int i = 0; i<=len/2 ; i++) {
			char tmp = strArr[i];
			strArr[i] = strArr[len-i];
			strArr[len-i] = tmp;
			
		}
		return String.valueOf(strArr);
	}
	
}
