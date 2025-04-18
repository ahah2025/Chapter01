package com.javaex.ex03; 

import java.util.Scanner;

public class Ex07 {    //조건문 if 와 if else

	public static void main(String[] args) {
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요 : ");		

		int point = sc.nextInt(); //점수 입력받기
		
		if(point>=90) {   //90점 이상 이면 "A등급"
			System.out.println("A등급");	
			
		}else if(point<90  &&  point>=80) {  //동시만족해야 되서 깐깐한 '&&'논리 연산자를 써야 함
			System.out.println("B등급"); //80점 이상~89점 이면 B등급
			
		}else if(point<80  &&  point>=70) {  //동시만족해야 되서 깐깐한 '&&'논리 연산자를 써야 함
			System.out.println("C등급"); //70점 이상~79점 이면 C등급
		
		}else if(point<70  &&  point>=60) {  //동시만족해야 되서 깐깐한 '&&'논리 연산자를 써야 함
			System.out.println("D등급"); //60점 이상~69점 이면 D등급
			
		}else if(point < 60 ) {  
			System.out.println("F등급"); //60점 이상~69점 이면 F등급	
		}
			
		sc.close();
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요 : ");		

		int point = sc.nextInt(); //점수 입력받기
		
		if(point>=90) {  
			System.out.println("A등급");	
			
		}else if(point>=80) {  
			System.out.println("B등급"); 
			
		}else if(point>=70) {  
			System.out.println("C등급"); 
		
		}else if(point>=60) {  
			System.out.println("D등급"); 
			
		}else if(point>=50 ) {  
			System.out.println("F등급"); 	
		}
			
		sc.close();
	}

}
