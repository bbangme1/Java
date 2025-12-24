package com.gg.exam;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class EEx3 {

	public static void main(String[] args) {
		// 윤년 판별하기
//		연도를 입력받아 윤년인지 아닌지 판별하세요.
//		조건: 4의 배수이면서 100의 배수가 아니거나, 400의 배수인 해는 윤년.

		Scanner kbd = new Scanner(System.in);

		System.out.print("년도 입력 :");
		int year = kbd.nextInt();

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("윤년 입니다");
		} else {
			System.out.println("평년 입니다");
		}

	}

}
