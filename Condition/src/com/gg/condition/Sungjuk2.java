package com.gg.condition;

public class Sungjuk2 {

	public static void main(String[] args) {
		// if 제어문
		// 성적(국어,영어,수학)을 키보드로 입력 받아서
		// 총점, 평균, 등급을 구한다.
		// 등급 : 수,우,미,양,가
		
		// 데이터 입력
		// 입출력 변수 준비
		int kor,eng,mat; //과목변수
		int tot; // 총점변수
		double avg; // 평균변수
		char grade; // 등급변수
		String gradeMsg=""; // 
		
		kor = 10;
		eng = 10;
		mat = 10;
		
		// 데이터 처리
		// 총점, 평균 처리
		tot = kor+mat+eng;
		avg = (double)tot/3;
		
		// 등급 처리(수~가)
		if (avg >= 90.0) {
			grade = '수';
		}
		else if (avg >= 80.0) {
			grade = '우';
		}
		else if (avg >= 70.0) {
			grade = '미';
		}
		else if (avg >= 60.0) {
			grade = '양';
		}
		else {
			grade = '가';
		}
		
		// 등급별 평문글
		// switch case
		switch(grade) {
		case '수':
			gradeMsg = "참 잘했어요";
			break;
		case '우':
			gradeMsg = "잘했어요";
			break;
		case '미':
			gradeMsg = "보통이요";
			break;	
		case '양':
			gradeMsg = "노력해요";
			break;	
		default:
			gradeMsg = "집가요";
		}
		
		
		// 데이터 출력
		System.out.println("----------------------------------------------");
		System.out.println(" 국어 | 영어 | 수학 | 총점 |  평균  | 등급");
		System.out.println("----------------------------------------------");
		System.out.printf("%4d | %3d | %3d | %3d | %.2f | %s \n",kor,eng,mat,tot,avg,grade);
		System.out.println("----------------------------------------------");
		System.out.println("총평 :"+gradeMsg);
		
	}

}
