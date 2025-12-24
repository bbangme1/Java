package com.gg.exam;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class EEx6 {

	public static void main(String[] args) {
		// 점수 평균으로 합격 여부 판별하기
		// 국어, 영어, 수학 점수를 입력받아 평균이 60점 이상이고 모든 과목이 40점 이상이면 합격, 아니면 불합격을 출력하세요.

		Scanner kbd = new Scanner(System.in);

		System.out.print("수학 :");
		int kor = kbd.nextInt();
		System.out.print("영어 :");
		int eng = kbd.nextInt();
		System.out.print("국어 :");
		int mat = kbd.nextInt();

		double avg = (kor + eng + mat) / 3.0;
		System.out.printf("평균 :%.2f\n", (double) avg);

		if (avg >= 60 && kor >= 40 && eng >= 40 && mat >= 40)
			System.out.println("합격");
		else
			System.out.println("불합격");

	}

}
