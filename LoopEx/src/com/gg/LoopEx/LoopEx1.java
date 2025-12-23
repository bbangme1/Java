package com.gg.LoopEx;

import java.util.Scanner;

public class LoopEx1 {

	public static void main(String[] args) {
		// 점수 평균으로 합격 여부 판별하기
		// 국어, 영어, 수학 점수를 입력받아 평균이 60점 이상이고 모든 과목이 40점 이상이면 합격, 아니면 불합격을 출력하세요.

		Scanner kbd = new Scanner(System.in);

		// 점수 입력받기
		System.out.print("국어 점수 :");
		int kor = kbd.nextInt();
		System.out.print("영어 점수 :");
		int eng = kbd.nextInt();
		System.out.print("수학 점수 :");
		int mat = kbd.nextInt();

		// 합계 및 평균
		int tot = kor + eng + mat;
		double avg = (double) tot / 3;

		// 합격 불합격
		if (kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60) {
			System.out.printf("총점 :" + tot + ", 평균 : %.2f", avg);
			System.out.println("\n합격");
		} else {
			System.out.printf("총점 :" + tot + ", 평균 : %.2f", avg);
			System.out.println("\n불합격");

		}

	}

}
