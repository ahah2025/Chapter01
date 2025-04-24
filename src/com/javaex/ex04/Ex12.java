package com.javaex.ex04;

public class Ex12 {

	public static void main(String[] args) {
		
		  for(int i = 1; i<=10; i++) {
			  if(i==6) {
				  continue; //이번 회차의 나머지 일을 하지 않는다
	     	  }
	     	  System.out.println(i);
		  }
     	  System.out.println("=========================");
     	  
     	  for(int i = 1; i<=10; i++) {
     		  
	       	  if(i==6) {
	       		   //아무것도 안함
	       	  }else {
	       		  System.out.println(i);
	       	  }
       	  
     }
     	  System.out.println("========================== ");
     	  for(int i=1; i<=10 ;i++) {
     		  if(i != 6) { //!= 입력X
     			  System.out.println(i);
     		  	}
     	  	}
		}
		
	}

	
	