package part1.operator;

public class TwoHangDemo2 {
	public static void main(String[] args) {
		
		int result = 0; // 디폴트 값이 0인 정수형 변수 선언과 할당
		result = 10; // 0 이 담겨있는 result 값을 10으로 변환시킨다.
		
		int x = 11, y = 5;
	//	int y = 0;
		
		result = x + y;
		System.out.println("x + y = " + result);
		
		result = x - y;
		System.out.println("x - y = " + result);
		
		result = x * y;
		System.out.println("x * y = " + result);
		
		result = x / y;
		System.out.println("x / y = " + result);
		
		result = x % y;
		System.out.println("x % y = " + result);
	}
}
