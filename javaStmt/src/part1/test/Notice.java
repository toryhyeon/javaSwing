package part1.test;

import java.util.Scanner;

public class Notice {
	public static void main(String[] args) {
		
		int kor = 0, eng = 0, math = 0, sum = 0; // 지역변수는 초기화 필수
		double avg = 0.0d; // 실수(소수점)타입은 더블타입으로 초기화
		String msg = ""; // 스트링 타입은 리터럴중에서 null 로 초기화
		
		/*
		 * 스캐너로 성적을 입력하면
		 * 합계에 따라 합력여부를 통지하는 프로그램
		 */
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요");
		kor = scanner.nextInt();
		System.out.println("영어 점수를 입력하세요");
		eng = scanner.nextInt();
		System.out.println("수학 점수를 입력하세요");
		math = scanner.nextInt();
		
		sum = kor + eng + math;
		avg = sum / 3d;
		
		/*
		 * 조건에 따라 결과값의 통지 내용이 달라짐
		 * 평균 100점이면 보너스 지급
		 * 평균 70 이상이면 합격
		 * 평균 70 미만이면 불합력
		 */
		
		if(avg == 100){
			msg = "보너스 지급";
		} else if(avg >= 70){
			msg = "합격";
		} else {
			msg = "불합격";
		}
		
		System.out.println(msg);
		
	}
}
