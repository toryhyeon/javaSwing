package part1.whileloop;

public class WhileLoopDemo {
	public static void main(String[] args) {
		int count = 0; //
		/*
		 int count = 0; 이라고 주는 것은 count 변수를
		 0으로 초기화(initialize) 한다고 하낟.
		 그런데 정수형 타입인 int 의 디폴트 값인 0 으로 주지 않고
		 1 로 주는 것을 count 변수를 1 로 초기화한다라고 지칭함.
		 */
		
		while(count < 10){ // count 가 11 보다 작은 상태 일때만...
			System.out.println("[1] 1부터 10까지의 범위 안에 있는 수들은 " + count + " 입니다.");
			count++;
			System.out.println(count);
		}
		/*
		 초기값과 조건식(컨디션) 과 출력문과의 상관관계..
		 [1] 컨디션 + 연산식 + 출력문
		 	 시작값을 0 부터 시작하고 컨디션의 리미트값은 범위값 미만으로 설정한다.
		 [2] 컨디션 + 출력문 + 연산식
		 	 시작값을 1 부터 시작하고 컨디션의 리미트값은 범위값 보다 1 큰값 미만으로 설정한다.
		 */
	}
}
