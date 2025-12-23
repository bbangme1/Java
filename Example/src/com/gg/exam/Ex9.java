package com.gg.exam;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		// 합격/불합격 판별하기
		// 점수를 입력받아 60점 이상이면 합격, 아니면 불합격을 출력하세요.

		Scanner kbd = new Scanner(System.in);

		// 정보 입력
		System.out.print("점수를 입력하세요 :");
		int num = kbd.nextInt();
		String num_ = kbd.nextLine();

		// 정보 처리
		if (num >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}

	}
}
