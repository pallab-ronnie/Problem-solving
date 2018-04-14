package com.prep;

public class NoOfOccurancesOfANumber {
	
	public int binarySearch(int arr[], int n, int x, boolean searchFirst) {
		int low = 0, high = n-1, result = -1;
		
		while(low<=high) {
			int mid = (low + high) /2;
			if(arr[mid] == x) {
				result = mid;
				if(searchFirst)
					high = mid - 1;
				else
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
		int a[] = {1,1,1,1,1,2,2,2,2,2,5,5,5,5,5,5,5,7};
		NoOfOccurancesOfANumber obj = new NoOfOccurancesOfANumber();
		int n = 5;
		int firstIndex = obj.binarySearch(a, a.length, n, true);
		if(firstIndex == -1) {
			System.out.println("Number " + n + " not present in the array");
		}
		else {
			int lastIndex = obj.binarySearch(a, a.length, n, false);
			System.out.println("Number of occurances of number " + n + " is :" + (lastIndex - firstIndex +1));
		}
	}
}
 