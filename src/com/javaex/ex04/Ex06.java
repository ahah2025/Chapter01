package com.javaex.ex04;

public class Ex06 {

	public static void main(String[] args) {
		
		//구구단 2단, 9단 중간생략(중첩 반복문)
		
		for(int dan=2; dan<=9; dan++) {
			
			for(int i=1; i<=9; i++) {
				System.out.println(dan + "*" + i  + "=" + (dan*i) );
			}
		}
	}
}
