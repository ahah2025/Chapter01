package com.javaex.ex04;

public class Ex09 {

	public static void main(String[] args) {
		int no = 1;
		//6의 배수이자 14의 배수인 가장 적은 정수 찾기
		
		boolean action = true;
		
		while( action ) {
								
			if( no%6 == 0 && no%14 ==0) {
				action=false;//while문 탈출
			}
			System.out.println("현재"+no); 
			no++;
		}
		System.out.println("정답"+no);// 정답 43
	}

}
