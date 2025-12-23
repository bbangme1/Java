package com.gg.exam;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// 최댓값 구하기(두수)
		// 두 정수를 입력받아 더 큰 수를 출력하세요

		Scanner kbd = new Scanner(System.in);

		// 정보 입력
		//int max = 0;
		System.out.print("1번 정수를 입력하세요 :");
		int num = kbd.nextInt();
		System.out.print("2번 정수를 입력하세요 :");
		int num1 = kbd.nextInt();

		// 정보 처리

		// max = (num > num1) ? num : num1;

		if (num > num1)
			System.out.println("1번");
		else {
			System.out.println("2번");

		}

	}

}
