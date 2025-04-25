package com.javaex.ex05;

public class Ex06 {

	public static void main(String[] args) {
		
		double[] doubleArr = new double[3];
		
		doubleArr[0]=3.14;
		doubleArr[1]=6;
		doubleArr[2]=9.5;
		
		for(int i=0; i<doubleArr.length; i++) {
			System.out.println(doubleArr[i]); 
		
		}
		System.out.println("===================="); 
		
		char[] charArr = new char[3];
		
		charArr[0]='a'; //캐릭터형은 사용할때 숫자가 아닌 알파벳으로 입력
		charArr[1]='h';
		charArr[2]=67; //코드를 67로 줬음 67=>알파벳 c
		
		for(int i=0; i<charArr.length; i++) {
			System.out.println(charArr[i]);
		}
		System.out.println("====================");
		
		String[] strArr = new String[3];
		
		strArr[0]="정우성";
		strArr[1]="유재석";
		strArr[2]="이효리";
		
		for(int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		System.out.println("반장 "+strArr[1]);
		
	}
}
