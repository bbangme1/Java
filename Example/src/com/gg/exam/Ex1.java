package com.gg.exam;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// 홀수 / 짝수 판별하기
		// 사용자로부터 정수를 입력받아 짝수인지 홀수인지 출력하세요.

		// 정보 입력
		System.out.print("숫자입력 :");

		String resule = "";
		Scanner kbd = new Scanner(System.in);
		int num = kbd.nextInt();

		// 정보 처리
		int num_ = num % 2;
		if (num_ == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}

	}

}
