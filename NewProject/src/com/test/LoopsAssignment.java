package com.test;

public class LoopsAssignment {

	public static void main(String[] args) {
 
		
		for(int i=1;i<100;i++) {
			
    	   if(i%10==0) {
    		   break;
    	   }
    	   System.out.println(i);
       }
		System.out.println("While");
	
		int j = 11;
		while(j<50) {
			System.out.println(j);
			j++;
		}
		System.out.println("do-while");
		
		int k = 21;
		do {
			System.out.println(k);
			k++;
		} while(k<100);		
	}

}
