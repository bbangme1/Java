package com.gg.Lopp;

import java.util.Scanner;

public class LoopDoWHILE {

	public static void main(String[] args) {

		// 키보드로 점수를 입력받아서 총점과 평균을 구한다.
		// 입력받은 점수의 숫자를 카운트 하여 평균을 구한다.

		int quit = 0;
		int jumsu = 0;
		int tot = 0; // 총점
		Double avg; // 평균
		int count = 0; // 카운트 초기화

		Scanner kbd = new Scanner(System.in);

		do {

			do {
				System.out.print("점수 입력 (0~100) :");
				jumsu = kbd.nextInt(); // 점수입력

			} while (jumsu < 0 || jumsu > 100);

			// 총점,카운트
			// tot = tot + jumsu;
			tot += jumsu;
			count++; // 점수 카운트

			System.out.println("점수" + count + ":" + jumsu);
			System.out.print("99 입력시 종료 :");
			quit = kbd.nextInt(); // 점수입력

		} while (quit != 99);

		// 평균 구하기
		avg = (double) tot / count;
		System.out.println("총점:" + tot);
		System.out.printf("평균: %.2f \n", avg);

		System.out.println("프로그램 종료");

	}

}
