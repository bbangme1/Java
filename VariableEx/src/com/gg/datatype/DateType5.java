package com.gg.datatype;

public class DateType5 {

	public static void main(String[] args) {
		// 출력제어 특수문자(이스케이프 문자)
		
		System.out.println("Java program");
		System.out.println("Java\nprogram");
		System.out.println("Java\rprogram");
		System.out.println("Java\tprogram");
		System.out.println("Java\bprogram");
		System.out.printf("%s \n","Java program");
		
		System.out.println();

		
		// ", ' \
		System.out.println("Java 'program'");
		System.out.println("Java \"program\"");
		System.out.println("Java \\program\\");
		

	}

}
