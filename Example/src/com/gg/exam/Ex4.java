package com.gg.exam;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// 학점 판별하기
		// 점수를 입력받아 90점 이상은 A
		// 80점 이상은 B, 70점 이상은 C, 그 외는 F를 출력하세요.

		Scanner kbd = new Scanner(System.in);

		// 정보 입력
		System.out.print("점수를 입력하세요 :");
		int num = kbd.nextInt();

		// 정보 처리

		if (num >= 90) {
			System.out.print("A");
		} else if (num >= 80) {
			System.out.print("B");
		} else if (num >= 70) {
			System.out.print("C");
		} else {
			System.out.print("F");
		}

	}

}
