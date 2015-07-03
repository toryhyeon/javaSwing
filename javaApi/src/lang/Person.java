package lang;

public class Person {
	
	private String ssn; // 주민번호
	
	public Person(String ssn) {
		this.ssn = ssn; // 태어나자마자 주민번호 생성
	}
	
	public String getSsn() {
		return ssn;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean flag = false; // 지역변수 초기화
		/*
		 * Object 는 모든 데이터 타입을 의미하기 때문에
		 * 반드시 주민번호를 가지고 있는 Person 인지를
		 * 확인해야 주민번호 일치여부를 따질 수 있기 때문에
		 * 객체 캐스팅 연산자 instanceof 를 사용한다.
		 * 이런 기능을 Valudation 즉 유효성 체크라고 한다.
		 */
		if (obj != null && obj instanceof Person) {
			// 위 컨디션의 의미는 obj 가 null 이 아니면서 Person 의
			// 인스턴스여야 true 를 리턴한다.
			return ssn == ((Person)obj).ssn;
		} else {
			return flag; // false 로 초기화 했으니 false 를 리턴
		}
	}
}
