package com.javaex.ex04;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int sum = 0;
		System.out.println("숫자를 입력하세요");
		
		while(true) {
			int num = sc.nextInt(); //숫자 입력받음
			//sum = sum + num;   				//누적 
			//System.out.println("합계: "+ sum); //합계가 출력 되고 난 이후 종료가 보임
		
			if(num==0) {//0이면 끝
				break; //반복문 끝
			}
			sum = sum + num;   				  //누적
			System.out.println("합계: "+ sum); //출력
			
		}	
		
		System.out.print("종료");
		sc.close();
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int sum = 0; //숫자를 누적한 값
		
		 do{
		 
			//숫자입력
			num = sc.nextInt();
			//합계
			sum = sum + num;
			//합계 출력
			System.out.println("합계 : " + sum);
		
		 }while(num != 0);
		 
		 System.out.println("종료");
		 sc.close();
		 */
		
		//////////////////////////////////
	}

}	
	