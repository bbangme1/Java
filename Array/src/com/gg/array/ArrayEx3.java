package com.gg.array;

public class ArrayEx3 {

	public static void main(String[] args) {
		// 배열 초기화
		int[] scores = { 10, 20, 50, 60, 78 };

		for (int i : scores) {
			System.out.print(i + " ");
		}

		// 문자열 배열 초기화
		String[] topping = { "\n버섯", "양파", "소세지", "베이컨", "토마토" };
		for (String str : topping) {
			System.out.print(" " + str);
		}

		// 문자열 배열로 다루기
		String str = "Hello Java!";

		System.out.println("\n" + str);
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(4));

		// 문자열 배열로 다루기
		String jumin = "020625-4403619";

		int year = 2000 + Integer.parseInt(jumin.substring(0, 2));
		System.out.println("\n" + year);
		// System.out.println(jumin.substring(0, 2));

	}

}
