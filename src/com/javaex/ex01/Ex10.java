package com.javaex.ex01;

public class Ex10 {
	public static void main(String[] args) {
		//관계연산자
		int a=5;
		int b=3;
		System.out.println(a<b);   // 5<3  false
		System.out.println(a>b);   // 5>3 true
		
		System.out.println(a<=b); // 5<=3   false
		System.out.println(a>=b); // 5>=3   true
		
		System.out.println(a==b); //5==3 --> false 5=3 5를 3에 대입해라
		System.out.println(a!=b); //5!=3 --> true
		
		boolean result = a==b;  // (1)a와 b가 같니 / a와 b를 result 에 대입하라
		System.out.println(result);
	}
}
