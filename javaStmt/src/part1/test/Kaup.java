package part1.test;

import java.util.Scanner;

public class Kaup {
	public void testMethod() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("키를 입력하세요");
		double height = scanner.nextDouble();
		System.out.println("몸무게를 입력하세요");
		double weight = scanner.nextDouble();
		/*
		 * 아래식은 double 타입의 결과물을
		 * int 타입의 변수에 할당해야 하므로
		 * 캐스팅이 일어났으며, 보통 이클립스가
		 * 제안하는 자동완성 방식으로 해결한다.
		 */
		int idx = (int) ((weight/(height*height))*10000);
		String msg = "";
		
		if(idx > 30){
			msg = "비만";
		} else if (idx > 24){
			msg = "과체중";
		} else if (idx > 20){
			msg = "정상";
		} else if (idx > 15){
			msg = "저체중";
		} else if (idx > 13){
			msg = "마름";
		} else if (idx > 10){
			msg = "영양실조";
		} else {
			msg = "소모증";
		}
		/*
		 * idx>24 ... msg = "과체중"
		 * idx>20 ... msg = "정상"
		 * idx>15 ... msg = "저체중"
		 * idx>13 ... msg = "마름"
		 * idx>10 ... msg = "영양실조"
		 * 이도저도 아니면 msg = "소모증"
		 */
		System.out.println("카우프지수[키 = " + height + "cm, 몸무게 = " + weight + "kg, 카우푸지수 = " + msg + "]");
	}
	public static void main(String[] args) {
		Kaup kaup = new Kaup();
		kaup.testMethod();
	}
}
