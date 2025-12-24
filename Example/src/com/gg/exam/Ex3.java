package com.gg.exam;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// 나이 판별하기
		// 나이를 입력받아 성인(20세이상)인지 미성년자인지 출력하세요

		Scanner kbd = new Scanner(System.in);

		// 정보 입력
		System.out.print("나이를 입력하세요 :");
		int age = kbd.nextInt();

		// 정보 처리

		if (age >= 20) {
			System.out.print("성인");
		} else if (age < 20) {
			System.out.print("미성년자");
		}

	}

}
