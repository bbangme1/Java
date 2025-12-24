package com.gg.array;

import java.util.Iterator;

public class ArrayEx2 {

	public static void main(String[] args) {
		// 배열기초 : 1차원 배열 n개의 데이터를 저장
		// 배열 준비
		int[] sungjuk = new int[10];
		int jumsu = 40;

		int size = sungjuk.length;
		// for 문으로 10개의 데이터 채우기
		for (int i = 0; i < size; i++) {

			// 점수 10개를 생성하여 배열에 넣기
			// 임의의 점수를 생성해서 점수 넣기
			jumsu = (int) (Math.random() *100+1);
			sungjuk[i] = jumsu;
		}

		System.out.println(" 성적배열");
//
//		int num;
//		for (int i = 0; i < size; i++) {
//			num = sungjuk[i];
//			System.out.print(num+" ");
//		}

		System.out.println();
		// 배열 처리
		// 점수 총점
		int tot = 0;
		for (int jum : sungjuk) {
//			tot = tot + jum;
			tot += jum;
			System.out.print(jum + " ");
		}
		System.out.println();
		// 총점 출력
		// 평균 출력
		double avg = tot / (double) size;
		System.out.printf("총점 : %d", tot);
		System.out.printf("\n평균 : %.2f", avg);
		// 배열 출력

	}

}
