package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력해주세요");
		System.out.println("단 : ");
		
		int dan = sc.nextInt();
				
		int i=0; //초기화
		int index = 1;
		
		while(i<=9) {
			System.out.println(dan + "*" + index + "="+ dan*index);
			
			i++;
			index++;
		}
		sc.close();
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력해주세요");
		System.out.print("단 : ");
		
		int dan = sc.nextInt();
		int i=1; //초기화
		int index = 1;
				
		while(i<=9) {
			System.out.println(dan + "*" + (i) + "="+ dan*(i) );
			i++; // 증감식
		}
		sc.close();
		
		
		
	}

}
