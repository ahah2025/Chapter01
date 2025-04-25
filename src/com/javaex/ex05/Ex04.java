package com.javaex.ex05;

public class Ex04 {

	public static void main (String[]args) {

		//배열 선언 "방이 3개라는 뜻-new int[3]"
		int[] intArr = new int[3];
		
		//값 대입
		intArr[0]=3;
		intArr[1]=6;
		intArr[2]=9;
		
		
		//System.out.println(intArr[1]);
		for(int i=0; i<3; i++) {
			System.out.println(intArr[i]);
		}
		
		for(int i=0; i<intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		System.out.println("====================");
		System.out.println(intArr.length);
	}
}
