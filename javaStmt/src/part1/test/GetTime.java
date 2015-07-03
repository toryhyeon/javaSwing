package part1.test;

import java.util.Scanner;

public class GetTime {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("초를 입력하세요");
		
		int time = scanner.nextInt(); //초
		int second = 0, minute = 0, hour = 0;
		
		second = time % 60; // 500초를 60으로 나눈 나머지는 초
		minute = (time / 60) % 60; // % 는 나머지값이고 / 는 몫을 리턴한다.
		hour = (time / 60) / 60;
		/*
		 * 500초를 60으로 나눈 몫을 다시 60으로 나눈 나머지는 분
		 * 일때 시간을 구하시고 출력되게끔하세요
		 */
		
		System.out.println(hour + "시");
		System.out.println(minute + "분");
		System.out.println(second + "초");
		
	}
}
