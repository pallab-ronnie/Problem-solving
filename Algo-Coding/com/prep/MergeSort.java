package com.prep;

public class MergeSort {
	
	public static void main(String[] args) {

		int arr[] = {5,3,9,7,14,11,17,13};
		mergeSort(arr);
		for(int i=0; i<arr.length-1 ; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void mergeSort(int[] arr) {

		int n = arr.length;
		if(n<2)
			return;
		int mid = n/2;
		int L[] = new int[mid];
		int R[] = new int[n-mid];
		
		int i = 0;
		while(i<mid) {
			L[i] = arr[i];
			i++;
		}
		while(i<n) {
			R[i-mid] = arr[i];
			i++;
		}
		
		mergeSort(L);
		mergeSort(R);
		merge(L,R,arr);
		
	}

	private static void merge(int[] L, int[] R, int[] A) {

		int i = 0,j = 0 ,k = 0;
		int nL = L.length;
		int nR = R.length;
		
		while(i<nL && j<nR) {
			if(L[i] < R[j]) {
				A[k] = L[i];
				i++;
			} else {
				A[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(i<nL) {
			A[k] = L[i];
			i++;
			k++;
		}
		
		while(j<nR) {
			A[k] = R[j];
			j++;
			k++;
		}
	}

	
	
}
