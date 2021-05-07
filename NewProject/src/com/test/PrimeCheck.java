package com.test;

import java.util.Scanner;
public class PrimeCheck {
	
	public static void main(String[] args) {
		System.out.println("Please enter a number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		boolean flag = false;
		int i = 2;
		
		while(i < number) {
			if(number%i == 0) {
				flag = true;
				break;
			}
			i++;
		}
		
		if(flag) {
			System.out.println("Not a prime no");
		} else {
			System.out.println("Prime no");
		}
	}
}