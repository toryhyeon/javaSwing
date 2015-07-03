package inhebitance;

public class AndroidPhone extends Iphone{
	
	public static final String BRAND = "안드로이드";
	private String data;
	
	// 디폴트 생성자를 생략함
		
	@Override
	public void setData(String name, String data) {
		super.setCompany(BRAND);
		super.setPortable(TRUE);
		super.setCall(name);
		this.data = 
				super.getCompany() + "\t" +
				super.getCall() + "\t" +
				data + " : 카카오톡 전달";
	}

	@Override
	public String getData() {
		return data;
	}
}
