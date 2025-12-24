package com.gg.condition;

import java.util.Scanner;

public class IfElseIFEx1 {

	public static void main(String[] args) {
		// if 제어문
		// 나이를 키보드로 입력 받아서
		// 나이에 맞는 연령대를 출력
		// 14 -> 10대, 54 -> 50대
		
		// 데이터 입력
		// 입출력 변수 준비
		int age;
		String result = "";
		
		Scanner kbd = new Scanner(System.in);
		
		System.out.print("나이 입력 :");
		String age_ = kbd.nextLine();
		age = Integer.parseInt(age_);
		
		
		// 데이터 처리
		// 성년/미성년 여부 판단
		if (age >= 10 && age <=19) {
			result = "10대";
		}
		
	    else if (age >= 20 && age <=29) {
	    	result = "20대";
	    }
	    else if (age >= 30 && age <=39) {
	    	result = "30대";
	    }
	    else if (age >= 40 && age <=49) {
	    	result = "40대";
	    }
	    else if (age >= 50 && age <=59) {
	    	result = "50대";
	    }
	    else if (age >= 60) {
	    	result = "그외";
	    }
	 

		
		// 데이터 출력
		System.out.println("나이 :"+age);
		System.out.println("연령대 :"+result);
		

	}

}
