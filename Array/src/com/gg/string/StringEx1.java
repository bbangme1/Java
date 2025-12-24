package com.gg.string;

import java.util.concurrent.ConcurrentSkipListSet;

public class StringEx1 {

	public static void main(String[] args) {
		
		// 문자열 다루기		
		String a1 = "Happy Java";
		String a = new String("Happy Java");
		String b = new String("a b");
		String c = new String("123 456");

		System.out.println(a1);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		// 첫번째 단어를 출력
		System.out.println(a1.substring(0, 5));
		System.out.println(a.substring(6));
		System.out.println(b.charAt(2));
		System.out.println(c.substring(4));
		
		// 문자열 비교 기능
		String name1 = new String("Hello");
		String name2 = new String("Java");
		String name3 = new String("Hello");
		
		if (name1.equals(name3)) {
			System.out.println("서로 같음");
		}else {
			System.out.println("서로 다름");
		}
		// 문자열의 위치 검색/ 문자가 있는지도 확인 가능
		//문자열이 없으면 -1을 반환
		String a2 = "Hello Java";
		System.out.println(a2.indexOf("Java")); // 6 출력
		
		// 문자열이 있는지 없는지 확인: true/false
		System.out.println(a2.contains("Java"));
		if (a2.contains("Java")) {
			System.out.println("있누");
		}else {
			System.out.println("없누");
		}
		
		// 위의 문제를 if문을 사용하지 않고 해결하세요.
		// 조건(삼항)연산자 ? :
		
		String result = (a2.contains("Java"))?"있누":"없누";
		System.out.println(result);
		
		// 찾아서 바꾸기
		a = "Hello Java";
		System.out.println(a.replaceAll("Java", "World"));  // Hello World 출력
		System.out.println(" a :"+a);
		
		String a4 = a.replaceAll("Java", "World");
		System.out.println(" a4 :"+a4);
		
		// 문자열 구분해서 추출
		String a5 = "a:b:c:d";
		String[] result1 = a5.split(":");  // result는 {"a", "b", "c", "d"}
		for (String str : result1) {
			System.out.print(str);
			
		}

	}

}
