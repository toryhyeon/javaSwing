package part1.array;

import java.util.Scanner;

public class ArrayLengthDemo {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("3개의 숫자를 입력하세요");
		
		int[] intArr = new int[3]; // 숫자 3개만 입력받도록 지정했으므로..
		int sum = 0;
		
		for(int i = 0; i<intArr.length; i++){ // 가운데 리미트 부분 채워주세요
			intArr[i] = scanner.nextInt(); // 0 대신에 입력값 할당 부분 완성해주세요.
		}
		
		for(int i = 0; i<intArr.length; i++){
			sum += intArr[i];
		}
		System.out.println("입력받은 배열값의 합계는 " + sum + "입니다.");
		
	}
}
