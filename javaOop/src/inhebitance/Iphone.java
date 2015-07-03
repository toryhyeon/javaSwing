package inhebitance;

public class Iphone extends CelPhone{
	private String data;
	public static final String BRAND = "아이폰";
	/* 아이폰은 브랜스 상속을 막았고, 무조건 휴대폰만 생산한다 */
	public static final boolean TRUE = true;
	
	// 디폴트 생성자를 생략함
	
	public String getData() {
		return data;
	}
	
	public void setData(String name, String data) {
		/*
		 * this. 은 해당 클래스 내부의
		 * 메소드나 필드의 인스턴스변수, 클래스 변수를
		 * 호출할 수 있고,
		 * super. 은 extends(상속)받은
		 * 부모클래스의 메소드나 필드값을 호출할 수 있다.
		 */
		super.setCompany(BRAND);
		super.setPortable(TRUE);
		super.setCall(name);
		this.data = 
				super.getCompany() + "\t" +
				super.getCall() + "\t" +
				data + " : 메지시 전달";
	}
	
}
