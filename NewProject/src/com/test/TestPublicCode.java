package com.test;

import java.util.Scanner;

public class TestPublicCode {

	public static void main(String[] args) {
		System.out.println("Entered a Number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		boolean Notation=false;
		for(int i=0;i<100;i++) {
			if(i%10==0) {
				break;
			}
			System.out.println(i);
		}
		int j=11;
		while(j<50) {
			System.out.println(j);
			j++;
		}
		System.out.println();
		int k=51;
		do {
			System.out.println(k);
			k++;
		}
		while(k<100);
	}

}
