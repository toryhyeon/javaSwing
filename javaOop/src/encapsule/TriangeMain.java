package encapsule;

/*
 * @ Date	: 20150619
 * @ Author : 최승현
 * @ Story	: 삼각형의 면적을 구하는 프로그램
 */
import java.util.Scanner;

public class TriangeMain {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("가로 길이를 입력 : ");
		double garo = scanner.nextDouble();
		System.out.println("세로 길이를 입력 : ");
		double sero = scanner.nextDouble();
		
		/*
		 * double 타입의 파라미터 에 int 타입의 값을
		 * 할당해도 아무 문제가 발생하지 않는 것은
		 * 자바내부적으로 작은 타입은 큰 타입에 적용 가능하기
		 * 때문이다. 다만 값의 손실은 피할 수 없다.
		 */
		TriangleVO triangle = new TriangleVO(garo, sero);
		
		System.out.println("면적 : " + triangle.getArea());
		
	}
}
