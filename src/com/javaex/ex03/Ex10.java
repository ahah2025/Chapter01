package com.javaex.ex03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("과목을 선택하세요");
		System.out.print("과목: ");
		int code = sc.nextInt();
		
		//char code = 'A';
		
		switch(code) { 
			case 1: //코드가 1과 같으면
				System.out.println("R101");
				break;
				
			case 2: //코드가 2와 같으면	
				System.out.println("R202");
				break;
				
			case 3: //코드가 3와 같으면	
				System.out.println("R303");
				break;	
			case 4: //코드가 3와 같으면	
				System.out.println("R404");
				break;	
				
			default: //나머지 else 
				//default 값을 D E F A U L T 영어 정확히 적을 것 dafault 라고 적지 말고 DE로 적기 
				System.out.println("상담원에게 문의하세요");
				
		}
				
		sc.close();

	}


}
