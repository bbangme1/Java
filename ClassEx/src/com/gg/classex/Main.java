package com.gg.classex;

public class Main {

	public static void main(String[] args) {
		// 생성자 오버로딩 테스트
		Person p1 = new Person();
		Person p2 = new Person("홍길동");
		Person p3 = new Person("김철수", 25);

		// 객체 간 메시지 교환
		Phone galaxy = new Phone("Galaxy S24");

		p3.buyPhone(galaxy); // 사람 → 스마트폰에게 메시지 전달
		p3.call("엄마"); // 사람 → 스마트폰 → 대상
	}

}
