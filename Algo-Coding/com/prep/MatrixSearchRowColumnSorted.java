package com.prep;

public class MatrixSearchRowColumnSorted {
	public static void main(String[] args) {
		
		int mat[][] = { {10, 20, 30, 40},
				{15, 25, 35, 45},
				{27, 29, 37, 48},
				{32, 33, 39, 50} };
		
		int n = mat.length;
		searchNum(mat, n, 29);
	}
	
	public static void searchNum(int[][] mat, int n, int ele) {
		
		int i=0 , j = n-1;
		
		while(i< n && j>= 0) {
			if(mat[i][j] == ele) {
				System.out.println("Found at : (" + i + ", " + j + ")");
				return;
			}
			else if(mat[i][j] > ele) {
				j--;
			}
			else {
				i++;
			}
		}
		
		System.out.println("Element not found");
	}
}
