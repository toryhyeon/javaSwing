package syntax;
/*
 * @ Date	: 20150623
 * @ Author : 최승현
 * @ Story	: 상수 문법
 */
public class Constant {
	/*
	 * 상수는 프로그램이 실행되는 동안 (선언과 동시에 값을 설정했다면)
	 * 	값이 변하지 않는 것.
	 * (선언과 동시에 값을 설정하지 않았다면) 값을 한번만 설정이 가능한 것.
	 * 명령어로는 C++ 에서는 const 로 Java 에서는 final 이 있다.
	 * 상수는 literal 상수와 symbolic 상수로 나뉘어 진다.
	 */
	/*
	 * C언어에서는 상수를 종류에 따라 다음과 같이 정의함
	 * 1. 리터럴(literal) 상수는 이름이 없는 상수
	 * 2. 심볼릭(symbolic) 상수는 이름이 있는 상수
	 */
	
	/*
	 * 심볼릭 상수의 관례
	 * 1. 명사
	 * 2. 대문자
	 * 3. 여러 단어의 조합이면 COMPANY_ADDRESS 이런 식으로 _ 를 사용.
	 */
	
	/*
	 * final
	 * 1. final 클래스(abstract class)
	 * - final 클래스는 상속될 수 없음
	 * 2. final 메소드
	 * - 자식 클래스가 overriding 할 수 없음
	 */
	public final String BRAND_NAME = "삼성"; // 심볼릭 상수
	String brand = "삼성"; // 리터럴 상수
}
