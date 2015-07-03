package polymorphism;

import java.util.Scanner;

/*
 * @ Date	: 20150619
 * @ Author : 최승현
 * @ Story	: 커피 객체클래스를 통해 생성자
 * 			★★★ 오버로딩을 이해 해보는 실행클래스
 * 			오버로딩 = 다형성(polymorghism)
 */

public class CoffeeMain2 {
	public static void main(String[] args) {
		CoffeeVO vendingMachine = new CoffeeVO();
		
		System.out.println(vendingMachine.getMsg());
		System.out.println("판매자님 커피 한잔 가격을 설정해 주세요 ");
		
		Scanner scanner = new Scanner(System.in);
		int price = scanner.nextInt();
		
		CoffeeVO coffeePrice = new CoffeeVO(price);
		System.out.println(coffeePrice.getMsg());
	}
}
