package com.javaex.ex05;

public class Ex07 {

	public static void main(String[] args) {
		
		int[] intArry;
		
		intArry = new int[5];

		intArry[0]=3;
		intArry[1]=6;
		intArry[2]=9;
				
		for(int i=0; i<=intArry.length; i++) {
			System.out.println(intArry[i]);
		}
		
		System.out.println(intArry[4]);
	}

}
