package com.gg.classex;

public class Circle1 {
	final double PI = 3.141592;
	String name;
	int radius; // 반지름
	int x, y; // 중심점

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCircle(int r, int x, int y) {
		radius = r;
		this.x = x;
		this.y = y;

	}

	// 원 그리기
	public void drawCircle() {
		System.out.println("원의 크기" + radius);
		System.out.println("원의 위치" + x + "," + y);
	}

	// 원의 면적
	public double getArea() {
		return PI * radius * radius;
	}

}
