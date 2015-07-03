package part1.forloop;

import java.util.Scanner;

/*
 * @ Date	: 20150615
 * @ Author : 최승현
 * @ Story	: 1부터 입력값 사이의 짝수의 합을 구하는 프로그램
 *            continue 기능 연습 예제
 */

public class ContinueDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1부터 합사나고자 하는 범위의 값을 입력하세요");
		System.out.println("범위내의 짝수만 합산합니다.");
		int num = scanner.nextInt(), sum = 0; // 지역변수는 반드시 초기화
		
		for(int i = 1; i <= num; i ++){
			if (i % 2 == 1) { // 홀수인 경우
				continue; // 더하지 않고 다음으로 이동
			} else { // 짝수인 경우
				sum += i;
			}
		}
		System.out.println("짝수의 합 : " + sum);
		
	}
}
