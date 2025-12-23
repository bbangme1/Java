package com.gg.exam;

import java.util.Scanner;

public class EEx2 {

	public static void main(String[] args) {
		// 간단한 계산기 (switch문 활용)
		// 두 수와 연산자(+,-,*,/)를 입력받아 계산 결과를 출력하세요.

		Scanner kbd = new Scanner(System.in);
		
		
		System.out.print("숫자입력 :");
		int n1 = kbd.nextInt();
		System.out.print("수식입력 :");
		char op = kbd.next().charAt(0);
		System.out.print("숫자입력 :");
		int n2 = kbd.nextInt();
		System.out.print("답 :");

		switch (op) {
		case '+':
			System.out.println(n1 + n2);
			break;
		case '-':
			System.out.println(n1 - n2);
			break;
		case '*':
			System.out.println(n1 * n2);
			break;
		case '/':
			System.out.println(n1 / n2);
			break;
		default:
			System.out.println("다시입력");
			break;					
		}
		

	}

}
