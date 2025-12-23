package com.gg.classex;

public class TriangleTest {

	public static void main(String[] args) {
		
		Triangle t1;
		
		t1 = new Triangle(); 
		
		t1.setBaseline(20);
		t1.setHigh(50);
		
		
		System.out.println("삼각형의 밑변 :"+t1.getBaseline());
		System.out.println("삼각형의 높이 :"+t1.getHigh());
		System.out.println("삼각형의 넓이 :"+t1.baseline*t1.high/2);
		

	}

}
