package com.prep;

public class BinarySearchInSortedAndRotatedArray {
	
	public int circularlySortedArraySearch(int arr[] , int n, int ele) {
		
		int low = 0, high = n-1;
		
		while(low <= high) {
			int mid = (low + high) /2;
			if(arr[mid] == ele) {
				return mid;
			}
			
			if(arr[mid] <= arr[high]) {
				if((ele > arr[mid]) && (ele <=arr[high])) {
					low = mid + 1;
				}
				else {
					high = mid - 1;
				}
			}
			else {
				if((arr[low] <= ele) && (ele < arr[mid])) {
					high = mid - 1;
				}
				else {
					low = mid + 1;
				}
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int a[] = {12,14,18,21,3,6,8,9};
		BinarySearchInSortedAndRotatedArray obj = new BinarySearchInSortedAndRotatedArray();
		System.out.println("Element found in position : " + obj.circularlySortedArraySearch(a, a.length, 8));
	}
}
