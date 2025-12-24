package com.gg.Operator;

public class OperatorArith {

	public static void main(String[] args) {
		
		// 산술연산자
		// 어떤숫자가 짝수인지 홀수인지 처리
		
		int num = 6;
		int num1 = 5;
		
		
		//int even = num % 2;
		boolean even = 0 == (num % 2);
		boolean even1 = 0 == (num1 % 2);
		
		System.out.println("홀짝? :"+even);
		System.out.println("홀짝? :"+even1);
		
		// 어떤 숫자가 3의 배수인지 아닌지 확인하기
		
		int num2 = 9;
		
		boolean even2 = 0 == (num2 % 3);
		
		System.out.println("3배? :"+even2);

	}

}
