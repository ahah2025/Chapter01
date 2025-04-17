package com.javaex.ex02;

public class Ex01 {
	public static void main(String[] args) {
	
		System.out.println("안녕");
		System.out.println("하세요");
		
		System.out.print("안녕");
		System.out.println("하세요");
		
		System.out.println("---------------------------");
		
		int i = 2345;
		double d = 3.14;		
		char c = '한';
		
		String s = "";
		String str ="굿모닝";
		String name = "이아름";
		
		System.out.println(i);
		System.out.println(name);
		System.out.println(5+3);
		System.out.println("굿모닝"+"이아름");
		System.out.println(str + name);
		System.out.println(str + name + str + name);
		
		System.out.println(i+i); // 정수+정수
		System.out.println(i + d); // 정수+실수==> 실수(자동형변환)+실수
		System.out.println(str + i);
		System.out.println(str + d);

		String result=  name + d;  //문자열 + 정수 ==> 문자열, 문자열 + 실수 =>문자열
		System.out.println(result);
		
		//굿모닝랑이아름
		
		String r = "랑";
		System.out.println(str + r + name);
		System.out.println(str +"랑" + name);
		
		//굿모닝 랑 이아름
		System.out.println(str +" 랑 " + name);
		
		//굿모닝 이아름
		System.out.println(str+" "+name);
		
		//제이름은 이아름 입니다.
		System.out.println("제이름은 " + name+" 입니다");
		
		System.out.println("---------------------------");
		System.out.println(c);		//한
		System.out.println(c+c);	//한한 char 형은 + 숫자더하기
		// char 형은 코드값을 가지고 있어서 결과값이 문자열이 될 수 없음 . c가 가지고 있는 코드값이 더해짐
		
		//제이름은 "이아름" 입니다.  \"이자체가 글자 
		System.out.println("제이름은 \"" + name + " \" 입니다");
		
		//제이름은 "이아름" 입니다.  
		System.out.println("제이름은 '" + name + "' 입니다");
		
		//제이름은 \이아름\ 입니다. 
		System.out.println("제이름은 \\"+ name + "\\ 입니다");
		
		System.out.println("제이름은\t"+ name + "입니다.");
		System.out.println("나의이름은\t"+ name + "입니다.");
		System.out.println("---------------------------");
		
		System.out.println("제이름은\n"+ name + "입니다");
	}
}
