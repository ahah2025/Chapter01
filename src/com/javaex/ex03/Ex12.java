package com.javaex.ex03;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요");
		int month = sc.nextInt();
		
		switch(month) { 
			case 1: 
				System.out.println("31일");
				break;
				
			case 2: 
				System.out.println("28일");
				break;
				
			case 3: 
				System.out.println("31일");
				// break;	
				
			case 4: 
				System.out.println("30일");
				break;		
				
			case 5: 
				System.out.println("31일");
				break;		
				
			case 6: 
				System.out.println("30일");
				break;	
				
			case 7: 
				System.out.println("31일");
				break;		
				
			case 8: 
				System.out.println("31일");
				break;	
				
			case 9: 
				System.out.println("30일");
				break;	
				
			case 10: 
				System.out.println("31일");
				break;	
				
			case 11: 
				System.out.println("30일");
				break;	
				
			case 12: 
				System.out.println("31일");
				break;	
				
			default: //나머지 else 
				//default 값을 D E F A U L T 영어 정확히 적을 것 da 라고 적지 말고 DE로 적기 
				System.out.println("31일 입니다.");
				
		}
				
		sc.close();
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요");
		int month = sc.nextInt();
		
		switch(month) { 
			case 4: 
			case 6:
			case 9:
			case 11:
				System.out.println("30일");
				break;
				
			case 2: 
				System.out.println("28일");
				break;
				
			default:	
				System.out.println("31일");
				break;
				
		}	
		sc.close();

	}
	
}	
