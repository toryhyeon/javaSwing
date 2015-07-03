package inhebitance;

/*
 * @ Date	: 20150622
 * @ Author	: 최승현
 * @ Story	: 
 */

public class CarMain {
	public static void main(String[] args) {
		Car car = new Car();
		// 클래스명(데이터타입) 인스턴스 = new 생성자();
		car.setCompanyName("현대차");
		System.out.println(car.getCompanyName());
		
	}
}
