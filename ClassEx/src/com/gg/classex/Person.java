package com.gg.classex;

public class Person {

	private String name;
	private int age;
	private Phone phone;

	// 기본 생성자
	public Person() {
		this("이름없음", 0); // this()로 다른 생성자 호출
	}

	// 이름만 받는 생성자
	public Person(String name) {
		this(name, 0); // this()로 또 다른 생성자 호출
	}

	// 이름 + 나이 생성자 (실제 초기화 담당)
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 스마트폰을 소유하는 메서드
	public void buyPhone(Phone phone) {
		this.phone = phone;
		System.out.println(name + "이(가) " + phone.getModel() + "을(를) 구매했습니다.");
	}

	// 스마트폰에게 메시지를 보내는 메서드 (객체 간 메시지 교환)
	public void call(String target) {
		if (phone == null) {
			System.out.println(name + "은(는) 아직 스마트폰이 없습니다.");
			return;
		}
		phone.call(target); // Phone 객체에게 메시지 전달
	}
}
