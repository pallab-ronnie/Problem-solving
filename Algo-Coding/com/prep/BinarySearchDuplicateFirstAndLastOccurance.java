package com.prep;

public class BinarySearchDuplicateFirstAndLastOccurance {
	
	public int firstOccuranceOfNumber(int arr[] , int n, int x) {
		
		int low = 0, high = n-1, result = -1;
		
		while(low<=high) {
			int mid = (low + high) /2;
			if(arr[mid] == x) {
				result = mid;
				high = mid - 1;
			}
			else if(x > arr[mid]) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		
		return result;
	}
	
public int lastOccuranceOfNumber(int arr[] , int n, int x) {
		
		int low = 0, high = n-1, result = -1;
		
		while(low<=high) {
			int mid = (low + high) /2;
			if(arr[mid] == x) {
				result = mid;
				low = mid + 1;
			}
			else if(x > arr[mid]) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int a[] = {1,2,4,10,10,10,10,67,89,99};
		BinarySearchDuplicateFirstAndLastOccurance obj = new BinarySearchDuplicateFirstAndLastOccurance();
		int search = 10;
		System.out.println("First occurance of number " + search + " is :" + obj.firstOccuranceOfNumber(a, a.length, search));
		System.out.println("Last occurance of number " + search + " is :" + obj.lastOccuranceOfNumber(a, a.length, search));
	}
}
