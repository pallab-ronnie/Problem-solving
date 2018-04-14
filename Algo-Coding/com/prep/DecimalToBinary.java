package com.prep;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		Integer test;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number ");
		int number = s.nextInt();
		int i = 0;
		int binary[]  = new int[100];
		
		while(number!=0) {
			binary[i] = number%2;
			number = number/2;
			i++;
		}
		
		for(int j = i-1 ;j>=0 ;j--) {
			System.out.print(binary[j]);
		}
	}

}
