package com.javaex.ex01;

public class Ex09 {
	public static void main(String[] args) {
		
		//대입연산자  = 
		int a = 7;
		int b = 2;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("----------------------------------");
		
		//산술연산자
		int sum = a + b;
		System.out.println(sum); //+	 
		
		System.out.println(a+b); //+
		System.out.println(a-b); //+
		System.out.println(a*b); //*
		System.out.println(a/b); // 7/2=>3.5 (정수와 정수를 더하면 3.5가 아닌 3으로 결과 나옴 소수점 버려짐)
		System.out.println(a%b); // 7/2=3---(1)
		
		System.out.println(7/2); //정수/정수=>정수
		System.out.println(7.0/2); // 7.0실수형/2.0정수형=>3.5실수형
		System.out.println(7.0/2.0); //7.0/2.0=>3.5
	
		System.out.println("----------------------------------");
		
		//부호연산자
		int var = -3;
		int pVar = -var; 			// -(-3) ==> 3
		System.out.println(pVar);
		
		int mVar = +var;     		// +(-3) ==> -3
		System.out.println(mVar);
		
		System.out.println("----------------------------------");
		
		//증가, 감소 연산자
		System.out.println(a); 	 // 7
		System.out.println(++a); // 7=>8 변수값 변경 +1 출력
		System.out.println(a);   //원래 값이 7이지만 하나만 올려해서 8이 되어서 a값을 8로 바꿔서 보여줌	
		
		System.out.println(b);  // 2
		System.out.println(--b); // 2-1 =>1
		System.out.println(b);  //원래 값이 2지만 하나만 내려서 1이 되어 b값을 1로 바꿔서 보여줌	
		
		System.out.println("----------------------------------");
		System.out.println(a); 		 // 8
		System.out.println(a++); 	 // 8    +1, 출력
		System.out.println(a); 		 // 9
		
		System.out.println(b);  	//1
		System.out.println(b--); 	//1      -1 출력
		System.out.println(b); 		//0
		
		//해야할일을 나열 가장먼저  가장 나중에 할지 결정
		System.out.println("----------------------------------");
		int c = 5; 
		System.out.println(c); //
		System.out.println(++c * 2); // (+1) 6   *2 =12
		System.out.println(c); //6
		
		int d =5;
		System.out.println(d);
		System.out.println(d++ * 2); 	//5 *2 => 10
		System.out.println(d); 			// 5 +1 => 6
		
		
	}
		
}
