package com.gg.condition;

import java.util.Scanner;

public class IfElseEx1 {

	public static void main(String[] args) {
		// if 제어문
		// 나이를 키보드로 입력 받아서 성년/미성년 여부를 출력
		// 성년기준 : 20세 이상
		
		// 데이터 입력
		// 입출력 변수 준비
		int age;
		String result = "";
	    final int AGE20 = 20;
		
		Scanner kbd = new Scanner(System.in);
		
		System.out.print("나이 입력 :");
		String age_ = kbd.nextLine();
		age = Integer.parseInt(age_);
		
		
		// 데이터 처리
		// 성년/미성년 여부 판단
		if (age >= AGE20) {
			result = "성년";
		}
	    else {
	    	result = "미성년";
		}
		// 데이터 출력
		System.out.println("나이 :"+age);
		System.out.println("여부 :"+result);
		

	}

}
