package com.gg.method;

import java.util.Scanner;

public class MetHodExam2 {

	public static void main(String[] args) {
		// 메서드 : 입력 -> 처리 -> 출력

		// 사칙연산 계산기 만들기

		// 데이터 입력 : 정수2개
		int num1 = 5;
		int num2 = 7;

		int sum, sub, mul;
		double div;

		// 데이터 처리 : +,-,*,/
		sum = hap(num1, num2); // num1 + num2;

		sub = cha();// num1 - num2; 입력은 외부에서 받기
		
		kub(num1, num2); //mul = num1 * num2; 입력은 정수2개 출력 자체 출력
		
		nanuki(); //div = (double) num1 / num2;
		
		// 데이터 출력 : 사칙연산 결과 출력
		System.out.println("num1 num2 합 차 곱  몫");
		System.out.printf("%2d %4d %3d %2d %3d %.2f \n", num1, num2, sum, sub, 100, 12.3);
		
		System.out.println("프로그램 종료");

	}
	private static int hap(int n1, int n2) {
		// 정수 2개를 더해서 그 결과를 반환
		int sum = n1 + n2;

		return sum;
	}
	private static int cha() {
		// num1, num2를 키보드로 입력받아서
		// 차를 구한다.
//		Scanner kbd = new Scanner(System.in);
//		System.out.println("정수 입력 2개 : 10 20");
		
		int num1 =keyIn(); //kbd.nextInt();
		int num2 =keyIn(); //kbd.nextInt();
		
		return num1-num2;
	}
	private static void kub(int num1, int num2) {
		// 정수 2개를 받아서 곱한 결과를 자체 출력
		System.out.println("곱한 결과 : "+num1*num2);
		
	}
	private static void nanuki() {
//		Scanner kbd = new Scanner(System.in);
//		System.out.println("정수 입력 2개 : 10 20");
		
		int num1 =keyIn(); //kbd.nextInt();
		int num2 =keyIn(); //kbd.nextInt();
		
		double div = (double)num1 / num2;
		System.out.println("나눗셈 결과 :"+div);
		
	}
	private static int keyIn() {
		Scanner kbd = new Scanner(System.in);
		System.out.println("정수 입력 :");
		
		int num1 = kbd.nextInt();
				
		return num1;
	}
}

	/*
	 * 입력 : 정수 2개 
	 * 처리 : 정수 덧셈 
	 * 반환값 : 처리 결과 정수값 
	 * 작성자 : @author simple 
	 * 작성일자 : @since 2025년 12월 22일
	 */

	


