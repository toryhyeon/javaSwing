package encapsule;

import java.util.Scanner;

/*
 * @ Date	: 20150616
 * @ Author : 최승현
 * @ Story	: 메인메소드에서 모듈화 로직의 분리 예제;
 */
public class LeapYearVO {
	/*
	 * 메소드 구성 형태 : 접근제한자 + 리턴타입 + 메소드이름+()+{}
	 * () 는 파라미터(매개변수)가 들어오는 위치. 빈공간일 경우도 있음
	 * {} 는 메소드바디라고 부르며 구문(statement)가 위치함
	 * 접근제한자는 권한(퍼미션)을 구분하는 역할
	 * 리턴타입은 메소드가 반환하는 값이 있을 경우 설정하고
	 * 없으면 void
	 */
	public String getLeapYear(int year){
		/*
		 * 연도를 4로 나눈 값이 0 이라면 윤년일 수 있다.
		 * 그러나 해당 연수가 100으로 나누어 떨어지면 평년이다.
		 * 평년이라 해도 다시 400으로 나누어 지는 연도는 윤년이다.
		 */

		//System.out.println("입력된 해 : " + year);
		String msg = "";
		
		if((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0){
			msg = "윤년";
		} else {
			msg = "평년";
		}
	
		return msg;
	}
	/*
	 * 출력값을 독립시키기 위해서는
	 * 메소드에 리턴타입을 void 가 아닌
	 * 리턴값에 따른 데이터타입을 주면 된다.
	 */
}
