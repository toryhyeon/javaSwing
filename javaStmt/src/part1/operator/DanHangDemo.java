package part1.operator;

public class DanHangDemo {
	public static void main(String[] args) {
		
		int i = 5; // 선언과 동시에 할당
		i = i + 1; // i 변수에 다시 i 값을 연산시켜라
		System.out.println("i 값을 이항연산자로 계산 했을 경우 : " + i);
		
		i++;
		System.out.println("i 값을 단항연산자로 계산 했을 경우 : " + i);
		/*
		 i = i + 1 과 i++ 은 동일한 결과를 추출하지만
		 i++ 이 속도가 더 빠르므로 이 형태를 사용한다.
		 */
	}
}
