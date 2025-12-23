package com.gg.method;

public class MetHodExam {

	public static void main(String[] args) {
		// 메서드 : 입력 -> 처리 -> 출력

		// 사칙연산 계산기 만들기

		// 데이터 입력 : 정수2개
		int num1 = 5;
		int num2 = 2;

		int sum, sub, mul;
		double div;

		// 데이터 처리 : +,-,*,/
		sum = num1 + num2;
		sub = num1 - num2;
		mul = num1 * num2;
		div = (double) num1 / num2;

		// 데이터 출력 : 사칙연산 결과 출력
		System.out.println("num1 num2 합 차 곱  몫");
		System.out.printf("%2d %4d %3d %2d %3d %.2f \n", num1, num2, sum, sub, mul, div);

	}

}
