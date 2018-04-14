package com.prep;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
	
	public static void main(String[] args) {

		String s1 = "ABC";
		String s2 = "BCA";
		System.out.println(s1.contains("AB"));
		boolean status = isAnagram(s1,s2);
		if(status)
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
		
	}

	private static boolean isAnagram(String s1, String s2) {
		
		String copyS1 = s1.replaceAll("\\s", "").toLowerCase();
		String copyS2 = s2.replaceAll("\\s", "").toLowerCase();
		if(s1.length() != s2.length()) {
			return false;
		}
		
		Map<Character, Integer> countMap = new HashMap<Character, Integer>();
		for(int i = 0;i<copyS1.length() ;i ++) {
			char c = copyS1.charAt(i);
			int charCount = 0;
			if(countMap.containsKey(c)) {
				charCount = countMap.get(c);
			}
			
			countMap.put(c, ++charCount);
			
			c = copyS2.charAt(i);
			charCount = 0;
			if(countMap.containsKey(c)) {
				charCount = countMap.get(c);
			}
			countMap.put(c,  --charCount);
			
		}
		for(int value: countMap.values()) {
			if(value!=0)
				return false;
		}
		
		return true;
	}

	/*private static boolean isAnagram(String s1, String s2) {
		
		if(s1.length()!=s2.length()) {
			return false;
		}
		
		char[] copyS1 = s1.toCharArray();
		StringBuilder sb = new StringBuilder(s2);
		for(char c: copyS1) {
			int index = sb.indexOf(""+c);
			if(index != -1) {
				sb.deleteCharAt(index);
			}
			else {
				return false;
			}
		}
		return true;
	}*/
	
	
	
}
