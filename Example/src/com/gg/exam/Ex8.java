package com.gg.exam;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// 짝수인지 3의 배수인지 판별하기
		// 정수를 입력받아 짝수인지,3의 배수인지,둘 다인지,아무것도 아닌지 출력하세요.

		Scanner kbd = new Scanner(System.in);

		// 정보 입력
		System.out.print("숫자를 입력하세요 :");
		int num = kbd.nextInt();

		// 정보 처리
		if (num % 6 == 0) {
			System.out.println("둘다 포함");
		} else if (num % 3 == 0) {
			System.out.println("3배수");
		} else if (num % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("두다 미포함");
		}

	}
}
