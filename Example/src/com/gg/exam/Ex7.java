package com.gg.exam;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// 요일 출력하기
		// 1~7 사이의 숫자를 입력받아 1은 월요일,2는 화요일...7은 일요일을 출력하세요.

		Scanner kbd = new Scanner(System.in);

		// 정보 입력
		System.out.print("숫자를 입력하세요 :");
		int num = kbd.nextInt();

		// 정보 처리
		if (num <= 1) {
			System.out.println("월요일");
		}else if (num <= 2) {
			System.out.println("화요일");
		}else if (num <= 3) {
			System.out.println("수요일");
		}else if (num <= 4) {
			System.out.println("목요일");
		}else if (num <= 5) {
			System.out.println("금요일");
		}else if (num <= 6) {
			System.out.println("토요일");
		}else {
			System.out.println("일요일");
		}	

	}

}
