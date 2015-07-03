package lang;

import test.CardVO;

/*
 * import 단축키 : CTRL + SHIFT + O
 */

public class ObjectClass {
	public static void main(String[] args) {
		/*
		 * toString() : 해시코드(객체 주소값)을 리턴하는 메소드.
		 * 따라서 일반 객체에서는 이를 오버라이딩 해서 사용함
		 */
		CardVO cardVO = new CardVO("하트", 7);
	}
}
