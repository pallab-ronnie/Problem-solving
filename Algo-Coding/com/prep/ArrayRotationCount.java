package com.prep;


public class ArrayRotationCount {
	
	public int findRotationCount(int arr[], int n) {
		
		int low = 0, high = n-1;

		while(low<= high) {
			if(arr[low] <= arr[high]) {
				return low;
			}
			int mid = (low + high) /2;
			int prev = (mid + n -1) % n; // To handle underflow adding n. 
			int next = (mid + 1) % n; //If mid reaches 0, next should be 1.
			
			//This will be the case when we will get the smallest element in a rotated and sorted array.This is the exit
			//condition.
			if((arr[mid] <= arr[prev]) && (arr[mid] <= arr[next])) {
				return mid;
			}
			
			//If right half of the array is sorted, then definitely the smallest element will be in the other half.
			else if(arr[mid] <= arr[high]) {
				high = mid -1;
			}
			
			//If left half is sorted the definitely the smallest element will be in the right side.
			else if(arr[low] <= arr[mid]) {
				low = mid+1;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		int a[] = {6,7,8,9,1,2,3,4,5};
		ArrayRotationCount obj = new ArrayRotationCount();
		System.out.println("The number of time array rotated is : " + obj.findRotationCount(a, a.length));
	}
	
}
