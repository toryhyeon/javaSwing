package inhebitance;

public class KiaMain {
	public static void main(String[] args) {
		KiaCar k5 = new KiaCar();
		k5.setCompanyName("기아");
		k5.setCarName("K5");
		System.out.println(
				k5.getCompanyName() + "\t" +
				k5.getCarName() + "\t" +
				Car.CAR
				// 우측 노란색 경고창이 뜨는 이유는
				// 문법적으로 크게 문제는 아니지만(프로그램이 중단될 정도는 아니지만)
				// 그렇다고 합법적인 코딩 방식도 아니다 비권장 방식으로 코딩했다라는 의미
				// 자바개갈자라면 이런 워닝현상도 제거해야 합니다.
				// 위 상황이라면 CAR 는 클래스변수이자 인스턴스 변수가 아니기때문에
				// 인스턴스로 호출하지 말고 (K5...) 클래스로 호출해라(Car.CAR) 라는 뜻이다.
				);
	}
}
