package com.javaex.ex04;

public class Ex05 {

	public static void main(String[] args) {
		
		int sum = 0;
	
		for ( int i=1; i<=10; i++) { 
			sum = sum+i;
			System.out.println(i +"까지의 정수의 합은 "+sum);
		}
		System.out.println("1부터 10까지의 정수의 합은 "+ sum + "입니다.");
		
		//System.out.println("1부터 10까지의 정수의 합은 "+sum+ " 입니다.");		
		// 결과값 1부터 10까지의 정수의 합은 55 입니다.
	}

}
