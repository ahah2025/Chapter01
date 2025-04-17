package com.javaex.ex01;

public class Ex01 {
	
	public static void main(String[ ] args) {

		int myAge;   //선언 'myAge'는 개발자가 이름 정하는 것
		myAge = 25;  //초기화 (25를 myAge에 넣어라)
		
		System.out.println(myAge); //화면출력
		
		myAge = 26; 
		
		System.out.println(myAge);
		
		/**************************************/
		 
		byte no; // 선언 'no'는 개발자가 이름 정하는 것
		no=127; //byte는 -128~127 만 허용가능
		System.out.println(no);
		
		/**************************************/
		
		/* long현
		 * int 범위까지는 L을 붙이지 않아도 된다.
		 * int 범위를 벗어나는 경우 L을 붙인다.
		 * ==>L을 붙여서 쓴다.
		 */
		long no2;
		/*no2=2147483648; int값을 넘었을때 */
		/*no2=2147483648L;*/
		no2=2147483648L;
		
		
	}
}

