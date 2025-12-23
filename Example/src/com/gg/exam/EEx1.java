package com.gg.exam;

import java.util.Scanner;

public class EEx1 {

	public static void main(String[] args) {
		// BMI 계산기
		// 키(Cm)와 몸무게(Kg)를 입력받아 BMI를 계산하고, 정상/과체중/저체중을 판별하세요.
		// 키를 170으로 입력하면 Cm이므로 나누기 100을 하여 1.7을 구해서 단위를 M로 변경해야 합니다.
		// BMI = 몸무게(Kg) / (키(M) * 키(M))

		Scanner kbd = new Scanner(System.in);

		// 정보 입력
		System.out.print("키를 입력하세요 :");
		int num = kbd.nextInt();
		double num_ = (num / 100.0);

		System.out.print("몸무게를 입력하세요 :");
		int num1 = kbd.nextInt();
		double bmi = (num1 / (num_ * num_));

		// 정보 처리
		System.out.printf("BMI :%.2f", bmi);

	}

}
