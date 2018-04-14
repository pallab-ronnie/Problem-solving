package com.prep;

import java.util.Scanner;

public class CheckNuberPowerOf {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = scanner.nextInt();
		System.out.println("Enter the power");
		int pow = scanner.nextInt();
		boolean result = isPowerOf(num, pow);
		if(result) {
			System.out.println("The number " + num  + " is power of " + pow );
		}
		else {
			System.out.println("The number " + num  + " is not power of " + pow );
		}
	}

	private static boolean isPowerOf(int num, int pow) {
		if(num ==0) {
			return false;
		}
		while(num != 1) {
			if(num % pow != 0) {
				return false;
			}
			num = num/pow;
		}
		return true;
	}

}
