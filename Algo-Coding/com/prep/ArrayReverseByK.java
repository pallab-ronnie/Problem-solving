package com.prep;

public class ArrayReverseByK {
	
	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5};
		int k = 3;
		reverseByK(arr ,k);
		for(int i = 0; i<arr.length ;i++) {
			System.out.println(arr[i]);
		}
	}

	private static void reverseByK(int[] arr, int k) {

		int n = arr.length;
		int begin = 0;
		
		while(n >= k) {
			reverse(arr, begin, begin + k -1);
			begin = begin + k;
			n = n-k;
		}
	}

	private static void reverse(int[] arr, int begin, int end) {

		while(begin <= end) {
			int tmp = arr[begin];
			arr[begin] = arr[end];
			arr[end] = tmp;
			begin ++;
			end --;
		}
	}
	
}
