package com.gg.Operator;

public class OperatorRelation {

	public static void main(String[] args) {
		
		// 관계 연산자
		// 어떤 사람이 성년인지 아닌지 판별
		// 성년은 나이가 20세
		// 020625-4403619 : 2002 -> 2025=2002 => 23				
		
		// 1. 태어난 해를 입력받는다.
		int Age;
		int BirthYear = 2002;
		boolean FullAge;
		
	    final int Age20 = 20;
		final int YEAR = 2025; // 상수값
		
		
		// 2. 나이 구하기
		Age = YEAR - BirthYear;
		
		// 3. 성년여부 비교 판단
		FullAge = Age >= Age20;
		
		System.out.println("나이 :"+Age);
		System.out.println("성인유무 :"+FullAge);
		
		
	}

}
