package com.javaex.ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[]args) {
		
		//09.조건문  [ if-else 조건문 ]
		
		/*점수를 입력받아
		 * 점수가 60점 이상이면 "합격입니다."를 출력하세요
		 */
		
		Scanner sc = new Scanner(System.in); //Scanner는 점수를 입력받는 것
		
		System.out.print("점수:");
		int point = sc.nextInt(); //점수 입력받는다
		
		
		if( point>=60 ) {  // '>='는 point 값이 60보다 작거나 같을때
			//true 일때 해야할일 나열
			System.out.println("합격입니다.");
		}
		
		
		sc.close();
				

	}
}
