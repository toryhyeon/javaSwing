package part1.test;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		/*
		 * 스캐너 클래스의 객체인 scanner 를 생성하였다.
		 */
		// Scanner scanner = new Scanner(System.in);
		// Scanner scanner = new Scanner(System.in);
		// Scanner scanner = new Scanner(System.in);
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("숫자를 입력해 주세요");
		 int a = scanner.nextInt();
		 //System.out.println(a);
		
		/*
		 * for 문으로 입력된 값만큼의 합을 구하는 연산식을 구현하세요
		 */
		 int sum = 0; // for 문의 결과값을 출력하는 변수는 바깥쪽에 선언 및 초기화
		 for(int i = 1; i <= a; i++){
			 // System.out.print(i + "\t");
			 sum += i;
		 }
		 System.out.println("For-Loop : 1부터 " + a + "까지의 합" + sum); // 출력값은 for문이 다 돈 다음에 나와야 하므로 바깥쪽
	}
}
