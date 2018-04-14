package com.prep;

public class MatrixSprialPrintReverse {
	
	public static void main(String[] args) {
		
		int mat[][] = { {10, 20, 30, 40},
				{15, 25, 35, 45},
				{27, 29, 37, 48},
				{32, 33, 39, 50} };
		
		int m = mat.length;
		int n = mat[0].length;
		printSpiralRev(mat, m, n);
	}
	
	public static void printSpiralRev(int[][] mat, int m, int n) {
		
		int top = 0;
		int bottom = m-1;
		int left = 0;
		int right = n-1;
		int dir = 0;
		
		while(top <= bottom && left <= right) {
			if(dir ==0) {
				for(int k= right; k>=left;k--) {
					System.out.print(mat[top][k] + " ");
				}
				top ++;
			} 
			else if(dir == 1) {
				for(int k = top; k<=bottom ;k++) {
					System.out.print(mat[k][left] + " ");
				}
				left ++;
			}
			else if(dir == 2) {
				for(int k= left ;k<=right;k++) {
					System.out.print(mat[bottom][k] + " ");
				}
				bottom --;
			}
			else {
				for(int k = bottom; k>=top ;k--) {
					System.out.print(mat[k][right] + " ");
				}
				right --;
			}
			dir = (dir + 1) %4;
		}
	}
	
}
