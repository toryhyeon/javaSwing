package inhebitance;

/*
 * @ Date	: 20150622
 * @ Author : 최승현
 * @ Story	: Phone 을 가지고 상속의미 학습
 */

public class Phone {
	private String company; // 제조사
	private String call; // 통화
	
	// 디폴트 생성자는 생략합니다.
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getCall() {
		return call;
	}
	
	public void setCall(String call) {
		this.call = call;
	}
	
}
