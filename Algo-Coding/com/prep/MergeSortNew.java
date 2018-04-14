package com.prep;

public class MergeSortNew {
	
	public static void main(String[] args) {
		int arr[] = {5,3,9,7,14,11,17,13};
		mergeSort(arr);	
		for(int i=0; i<arr.length ;i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void mergeSort(int[] arr) {
		
		int begin = 0;
		int end = arr.length - 1;
		int mid = (begin + end) /2;
		
		if(end <= begin)
			return;
		
		int L[] = new int[mid+1];
		int R[] = new int[end - mid];
		
		for(int i=0 ; i< L.length; i++) {
			L[i] = arr[i];
		}
		
		for(int i =0;i<R.length ;i++) {
			R[i] = arr[mid+1+i];
		}
		
		mergeSort(L);
		mergeSort(R);
		
		merge(L,R,arr);
	}

	private static void merge(int[] left, int[] right, int[] arr) {
		
		int i = 0, j = 0, k = 0;
		int nL = left.length;
		int nR = right.length;
		
		while(i<nL && j<nR) {
			if(left[i] < right[j]) {
				arr[k] = left[i];
				i++;k++;
			} else {
				arr[k] = right[j];
				j++;k++;
			}
		}
		
		while(i<nL) {
			arr[k] = left[i];
			i++;k++;
		}
		
		while(j<nR) {
			arr[k] = right[j];
			j++;k++;
		}
	}
}
