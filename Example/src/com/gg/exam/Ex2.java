package com.gg.exam;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// 양수/음수/0 판별하기
		// 정수를 입력받아 양수, 음수, 0 중 어떤 값인지 출력하세요.

		Scanner kbd = new Scanner(System.in);

		// 정보 입력
		System.out.print("정수를 입력하세요 :");
		int num = kbd.nextInt();

		// 정보 처리

		if (num > 0) {
			System.out.print("양수");
		} else if (num < 0) {
			System.out.print("음수");
		} else {
			System.out.print("제로");
		}

	}

}
