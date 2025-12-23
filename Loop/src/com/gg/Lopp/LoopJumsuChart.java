package com.gg.Lopp;

import java.util.Iterator;
import java.util.Scanner;

public class LoopJumsuChart {

	public static void main(String[] args) {
		// 점수에 해당하는 별점 표시
		// 점수에 별점을 10점당 1개로 표시

		Scanner kbd = new Scanner(System.in);

		int kor = 33;
		int starSize = kor / 10;

		System.out.println("원하는 모양을 입력하세요 :");
		String shape = kbd.nextLine();

		System.out.print("국어 : ");

		for (int i = 0; i < starSize; i++) {
			System.out.print(shape);
		}
		// 수학
		int mat = 55;
		int starSize1 = mat / 10;
		starSize1 = mat / 10;
		System.out.print("\n수학 : ");

		System.out.println("원하는 모양을 입력하세요 :");
		String shape1 = kbd.nextLine();

		for (int i = 0; i < starSize1; i++) {
			System.out.print(shape);
		}

	}
}
