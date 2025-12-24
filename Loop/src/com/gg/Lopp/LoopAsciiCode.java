package com.gg.Lopp;

import java.util.Iterator;

public class LoopAsciiCode {

	public static void main(String[] args) {
		// 점수에 해당하는 별점 표시
		// 점수에 별점을 10점당 1개로 표시
		int kor = 33;
		int mat = 55;
		int starSize = kor / 10;
		int starSize1 = mat / 10;
		

		System.out.print("국어 : ");
		for (int i = 0; i < starSize; i++) {
			System.out.printf("■");
		}
		
		System.out.print("\n수학 : ");
			for (int i = 0; i < starSize1; i++) {
				System.out.printf("■");
		}

	}
}
