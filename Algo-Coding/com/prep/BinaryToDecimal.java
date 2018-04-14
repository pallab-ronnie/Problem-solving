package com.prep;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a binary number ");
		int binary = s.nextInt();
		int decimal = 0;
		int power = 0;
		
		while(true) {
			if(binary==0) {
				break;
			}
			else {
				int tmp = binary%10;
				decimal = (int) (decimal + tmp*Math.pow(2, power));
				binary = binary/10;
				power++;
			}
		}
		System.out.println(decimal);
	}

}
