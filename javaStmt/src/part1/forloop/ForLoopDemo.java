package part1.forloop;

public class ForLoopDemo {
	public static void main(String[] args) {
	//	int val = 0;
		/*for(val = 1; val < 11; val++){
			val++;
			System.out.println("1부터 10까지 범위의 수 : " + val);
		}*/
		for(int val = 1; val < 11; val++){
		/*
		 forloop 의 장점
		 1. 초기화 , 리미트값 설정, 증감값 설정을
		 	한 컨디션 내부에서 일괄 설정하므로
		 	가독성이 좋다.
		 	따라서 while loop 보다 권장한다.
		 */
			System.out.println("1부터 10까지 범위의 수 : " + val);
		}
	}
}
