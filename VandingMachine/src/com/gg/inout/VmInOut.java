package com.gg.inout;

import java.util.Iterator;
import java.util.Scanner;

public class VmInOut {

	public static void main(String[] args) {
		// 1. 자판기 메뉴 출력
		// 밀크커피(300원)
		// 프로그램에 관련된 입출력 변수 준비
		int inCoin = 0;

		// String milkCoffee = "밀크커피";
		String[] coffeeNames = { "밀크커피", "설탕커피", "블랙커피" };
		// int milkPrice = 300;
		int[] coffeePrice = { 300, 200, 100 };
		// boolean milkOk = false;
		boolean[] isSale = { false, false, false };

		int menu;
		int vmcoin = 0;
		String coinRepeat = "n";
		String quit = "";

		Scanner kbd = new Scanner(System.in);

		do {
			// 메뉴 출력
			// System.out.print(MilkCoffee+"("+MilkPrice"+원)");
			for (int i = 0; i < coffeeNames.length; i++) {
				System.out.printf("%s:(%d원) %s\n", coffeeNames[i], coffeePrice[i], isSale[i] ? "O" : "X");

			}

			// 동전 입력
			do {

				System.out.print("동전 입력 :");
				inCoin += kbd.nextInt();
				kbd.nextLine(); // 키보드 버퍼에 남아있는 문자열 처리

				// 입력한 동전 출력
				System.out.println("잔액 : " + inCoin + "원");
				System.out.println("동전입력 계속하나요? y/n");
				coinRepeat = kbd.nextLine();

			} while (coinRepeat.equals("y"));

			// 밀크 커피 판매 가능 상태로 변환
			// 입력한 동전이 300원 이상이면 판매가능 상태 "O"로 변환
//			if (inCoin >= milkPrice) {
//				milkOk = true;
//			}
			for (int i = 0; i < coffeePrice.length; i++) {
				System.out.printf("%s:(%d원) %s\n", coffeeNames[i], coffeePrice[i], isSale[i] ? "O" : "X");
			}

//			System.out.printf("%s:(%d원) %s \n", milkCoffee, milkPrice, milkOk ? "O" : "X");

			// 밀크커피 판매 처리
			// 커피 선택하기
			// 판매에 따른 처리

//			if (milkOk) {
			if (isSale) {
//
//				System.out.println("잔액 :" + inCoin + "원");
				System.out.println("잔액 :" + inCoin+ "원");
//				System.out.println("메뉴 선택 : 밀크커피 : 1");
				System.out.println("메뉴 선택 :"+ coffeeNames);
//				menu = kbd.nextInt();
				coffeeNames = kbd.nextInt();
				kbd.nextLine(); // 키보드 버퍼에 남아있는 문자열 처리
//
//				switch (menu) {
//				case 1:
//					// 자판기가 판매금액 회수
//					vmcoin += milkPrice;
//					inCoin -= milkPrice;
//					System.out.println(milkCoffee + " 나왔습니다.");
//
//				}
//
//				System.out.println("잔액 :" + inCoin + "원");
//				if (inCoin >= milkPrice) {
//					milkOk = true;
//				} else {
//					milkOk = false;
//				}
//				System.out.printf("%s:(%d원) %s \n", milkCoffee, milkPrice, milkOk ? "O" : "X");
//			}

			System.out.println("종료 : quit 입력 ");
			quit = kbd.nextLine();
//		String quit = kbd.nextLine();
//		if (quit.equals("quit")) {
//			System.out.println("종료");
//		}
		} while (!quit.equals("quit"));

		System.out.println("종료");
	}

}
