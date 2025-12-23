package com.gg.exam;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// 최댓값 구하기(세수)
		// 세 정수를 입력받아 더 큰 수를 출력하세요

		Scanner kbd = new Scanner(System.in);

		// 정보 입력
		System.out.print("1번 정수를 입력하세요 :");
		int num = kbd.nextInt();
		System.out.print("2번 정수를 입력하세요 :");
		int num1 = kbd.nextInt();
		System.out.print("3번 정수를 입력하세요 :");
		int num2 = kbd.nextInt();

		// 정보 처리
		if (num > num1)
			System.out.println("1번");
		else if (num1 > num2) {
			System.out.println("2번");
		} else {
			System.out.println("3번");
		}

	}

}
