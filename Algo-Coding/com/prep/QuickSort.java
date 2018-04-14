package com.prep;

public class QuickSort {
	
	public static void main(String[] args) {

		int arr[] = {5,3,9,7,14,11,17,13};
		quickSort(arr ,0, arr.length-1);
		for(int i=0; i<arr.length-1 ; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void quickSort(int[] arr, int begin, int end) {

		if(begin>=end)
			return;
		int pIndex = partition(arr, begin, end);
		quickSort(arr, begin, pIndex-1);
		quickSort(arr, pIndex+1, end);
	}

	private static int partition(int[] arr, int begin, int end) {
		
		int pivot = arr[end];
		int pIndex = begin;
		for(int i=begin; i<end;i++) {
			if(arr[i]<=pivot) {
				//swap(arr[i], arr[pIndex]);
				int tmp = arr[i];
				arr[i] = arr[pIndex];
				arr[pIndex] = tmp;
				pIndex++;
			}
		}
		int tmp = arr[end];
		arr[end] = arr[pIndex];
		arr[pIndex] = tmp;
		
		return pIndex;
	}

	private static void swap(int i, int pivot) {

		int tmp = i;
		i = pivot;
		pivot = tmp;
	}
	
}
