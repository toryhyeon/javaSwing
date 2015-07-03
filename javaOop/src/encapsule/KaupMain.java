package encapsule;

import java.util.Scanner;

public class KaupMain {
	public static void main(String[] args) {
		
		KaupVO kaupVO = new KaupVO();
		// 객체를 생성하는 패턴
		// 클래스명 객체명 = new 생성자명
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("키를 입력하세요");
		double height = scanner.nextDouble();
		System.out.println("몸무게를 입력하세요");
		double weight = scanner.nextDouble();
		
		String msg = kaupVO.getKaup(height, weight);
		// 객체명(=인스턴스 참조변수 = 참조변수).메소드이름
		// 객체가 메소드를 호출하는 패턴
		// height 와 weight 는 파라미터로 값을 전달하는 역할
		System.out.println("카우프지수[키 = " + height + "cm, 몸무게 = " + weight + "kg, 카우푸지수 = " + msg + "]");
	}
}
