package abstraction;

public abstract class CardGameRule {
	private String result; // 카드 결과를 보여줌

	// 생성자 생략
	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	public abstract void play(Card card1, Card card2);
	// 메소드에 abstract 을 붙이면
	// 클래스에도 abstract 이 붕어야 하며
	// 이 클래스를 추상클래스라고 한다.
	// 그리고 abstract 이 붙은 메소드를 추상메소드라고 하낟.
	// 추상메소드는 바디가 없다.
}
