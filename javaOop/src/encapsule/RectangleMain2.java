package encapsule;

import java.util.Scanner;

/*
 * @ Date	: 20150618
 * @ Author : 최승현
 * @ Story	: 사각형의 면적을 구하는 프로그램
 */

public class RectangleMain2 {
	public static void main(String[] args) {
		
		/* 생성자로 면적 구하기 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("가로길이를 입력 : ");
		int width = scanner.nextInt();
		System.out.println("세로길이를 입력 : ");
		int height = scanner.nextInt();
		/*
		 * 생성자를 통해 인스턴스 생성에 제재를 가하는 기법
		 * 반드시 파라미터가 필요한 경우라면
		 * 이처럼 getter setter 를 제거하고
		 * 디폴트 생성자 역시 제거해서
		 * 반드시 파라미터 값을 받는 인스턴스(객체)를 만들도록
		 * 제약을 가한다.
		 * 글래스 제작자는 이처럼 하여 직접 클래스를 만들지 않고
		 * 사용만 하는 개발자가 실수로 프로그램에 해를 끼지는 것을
		 * 막는다.
		 */
		RectangleVO2 rectangle = new RectangleVO2(width, height);
		
		System.out.println("면적 : " + rectangle.getArea());
	}
}
