package com.javaex.ex03;

import java.util.Scanner;

public class Ex09 {
		
		public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("과목번호를 입력하세요");
		System.out.print("과목번호: ");

		int code = sc.nextInt();
		
		if(code==1){ //과목코드 1일때
			System.out.println("R101호");
		
		}else if(code==2) { //과목코드 2일 때
				System.out.println("R202호");
				
		}else if(code==3) { //과목코드 3일 때
			System.out.println("R303호");
			
		}else if(code==4) { //과목코드 4일 때
			System.out.println("R404호");
		}else {
			System.out.println("상담원에게 문의하세요");
		}
				
		
		sc.close();
		}
				
		}


