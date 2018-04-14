package com.prep;

import java.util.Scanner;

public class PrimeArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i =0 ;i < arr.length ;i++) {
			arr[i] = scanner.nextInt();
		}
		for(int i = 0; i<arr.length ; i++) {
			boolean isPrime = true;
			if(arr[i] <= 1) {
				isPrime = false;
			}
			else {
				for(int j = 2; j<=Math.sqrt(arr[i]) ;j++) {
					if(arr[i] % j == 0) {
						isPrime = false;
						break;
					}
					else {
						isPrime = true;
					}
				}
			}
			if(isPrime) {
				System.out.println("Prime is " + arr[i]);
			}
		}
	}
}
