package com.gg.Lopp;

import java.util.Iterator;

public class LoopGugudan2 {

	public static void main(String[] args) {
		// 구구단

		// for
		// 구구단의 단
		for (int i = 1; i <= 9; i++) {
			// System.out.println(2 + " x " + i + " = " + (2 * i));
			
			for (int j = 2; j <= 5; j++) {

				System.out.printf("%d x%2d = %2d  ", j, i, (j * i));
				
			

			}System.out.println();
			

		}
		System.out.println();
		for (int i = 1; i <= 9; i++) {
		for (int k = 6; k <= 9; k++) {
			
			System.out.printf("%d x%2d = %2d  ", k, i, (k * i));
			
		}System.out.println();}
	}
}
