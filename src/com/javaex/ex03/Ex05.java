package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간:");
		int time = sc.nextInt();
		
		double sum;

		if(time <= 8) {
			sum = time*10000;
			
		}else {
			sum = time*10000 + (time-8)*5000; //철수 편의점 알바 8시간 초과시 시간당 1.5배 받음 (95000.0원)
		}
		
		System.out.println("임금은 "+sum+"원 입니다." );
		
		sc.close();
	}

}
