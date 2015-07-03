package lang;
/*
 * @ Date	: 20150629
 * @ Author : 최승현
 * @ Story	: trim() 문법
 */
public class Trim {
	public static void main(String[] args) {
		String str = "    Hello    Java    World !!    ";
		System.out.println(str.trim());
		// trim() 은 리터럴값의 앞뒤 공벽을 없애는 기능을 한다.
		
		/*
		 * 메소드 체인기법 : 리넌하는 값이 String 이라면
		 * String 의 메소드들을 연결해서 사용할 수 있는데
		 * 이것을 메소드 체인이라고 한다.
		 */
		System.out.println(str.trim().replace("Java", "JSP"));
	}
}
