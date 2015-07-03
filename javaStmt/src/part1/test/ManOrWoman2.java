package part1.test;

import java.util.Scanner;

public class ManOrWoman2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("주민번호를 입력하세요 (예) 123456-4123456");
		String ssn = "", msg = ""; // int 형 초기화는 0 String 초기화는 ""
		ssn = scanner.next();
		/*
		 * int 타입을 받을 때는 nextInt()
		 * String 타입을 받을 때는 next() 를 선택하세요.
		 */
		
		char ch = ssn.charAt(7); // 적당한 인덱스값을 0 대신 대체하세요.
		/*
		 * 남자인지 여자인지를 판별하는 부분은 예문에서 -다음 숫자인 4에 해당합니다.
		 * 스트링 문자열의 순서값은 인덱스라고 하는데..
		 * 0부터 시작합니다.
		 * 따라서 예무에서 인덱스 0값은 1이고
		 * 인덱스1 값은 2입니다.
		 */
		// 디버킹 .. 에러나 원하는 값이 나오지 않을 경우 테스트값을 출력해보는 경우
	//	System.out.println("ch : " + ch);
		
		switch (ch) {
		case '1': case '3': msg = "남자";					break;
		case '2': case '4': msg = "여자";					break;
		case '5': case '6': msg = "외국인";					break;
		
		default:			msg = "잘못된 입력값입니다.";	break;
		}
		/*
		 * 남자출력부분은 제가 했구요 2와 4는 여자.. 5와 6은 외국인.. 나머지 값은
		 * 잘못된 입력값입니다.라고 출력하세요.
		 */
		System.out.println(msg);
	}
}
