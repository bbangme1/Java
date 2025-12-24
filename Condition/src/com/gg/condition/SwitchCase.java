package com.gg.condition;

public class SwitchCase {

	public static void main(String[] args) {
		
		// switch~case
		// 1월 ~ 12월까지 입력을 받아서
		// 해당하는 월의 4계절을 출력	
		
		// 데이터 입력
		int month = 5;
		String season ="";
		
		
		// 데이터 처리
		switch (month) {
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			break;
		default:
			season = "겨울";
		
		}
		
		// 데이터 출력
		System.out.println(month+" 월");
		System.out.println("계절 :"+season);
		
	}
}
