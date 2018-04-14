package com.prep;

import java.util.Scanner;

public class PascalTriangle {
	
	public static void main(String[] args) {

		System.out.println("Enter number of lines");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int num = 1;
		
		for(int i = 0;i<n;i++) {
			//print spaces
			for(int k = n;k>i;k--) {
				System.out.print(" ");
			}
			num = 1;
			for(int j = 0; j<=i;j++) {
				System.out.print(num + " ");
				num = num * (i-j)/(j+1);
			}
			System.out.println();
		}
	}
	
}
