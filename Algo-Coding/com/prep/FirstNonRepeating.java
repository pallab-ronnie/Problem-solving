package com.prep;

public class FirstNonRepeating {

	static char[] count = new char[256];
	
	public static void main(String[] args) {

		String str = "aabbccghhhjk";
		int index = findFirstNonRep(str);
		System.out.println("First non-repeating " + str.charAt(index));
	}

	private static int findFirstNonRep(String str) {

		getCountArr(str);
		int index = -1;
		
		for(int i = 0; i< str.length(); i++) {
			if(count[str.charAt(i)] == 1) {
				index = i;
				break;
			}
		}
		
		return index;
	}

	private static void getCountArr(String str) {

		for(int i = 0 ;i<str.length();i++) {
			count[str.charAt(i)]++;
		}
	}

}
