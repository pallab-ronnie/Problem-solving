package com.prep;

public class ArrayAddOneAtEnd {
	
	public static void main(String[] args) {

		int arr1[] = {1,3,4,5};
		int arr2[] = {1,9,9};
		int arr3[] = {9,9,9};
		
		int[] result = addOneAtEnd(arr3);
		for(int i: result) {
			System.out.println(i);
		}
	}

	private static int[] addOneAtEnd(int[] arr) {

		int result[] = new int[arr.length];
		int carry = 1;
		int total = 0;
		for(int i = arr.length-1 ;i>=0 ; i--) {
			total = arr[i] + carry;
			if(total == 10)
				carry = 1;
			else {
				result[i] = total % 10;
				carry = 0;
			}
		}
		if(carry == 1) {
			result = new int[arr.length + 1];
			result[0] = 1;
		}
		
		return result;
	}
	
}
