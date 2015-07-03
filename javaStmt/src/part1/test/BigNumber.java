package part1.test;

import java.util.Scanner;

public class BigNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = 0, b = 0, c = 0; 
		System.out.println("A 의 값을 입력하세요");
		// a 값을 입력받는 로직
		a = scanner.nextInt();
		System.out.println("B 의 값을 입력하세요");
		// b 값을 입력받는 로직
		b = scanner.nextInt();
		System.out.println("C 의 값을 입력하세요");
		// c 값을 입력받는 로직
		c = scanner.nextInt();
		
		if(a > b && a > c){ // a가 b 보다 크면서 c 보다도 크다 (교집합)
			System.out.println("가장 큰 수는 A 값인 " + a + " 입니다.");
		} else if(b > a && b > c){
			System.out.println("가장 큰 수는 B 값인 " + b + " 입니다.");
		} else {
			System.out.println("가장 큰 수는 C 값인 " + c + " 입니다.");
		}
	}
}
