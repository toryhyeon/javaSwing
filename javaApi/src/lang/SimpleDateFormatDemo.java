package lang;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * @ Date	: 20150629
 * @ Author : 최승현
 * @ Story	: 날짜표현
 */
public class SimpleDateFormatDemo {
	public static void main(String[] args) {
		// import 단축키 : CTRL + SHIFT + O
		Date today = new Date();
		SimpleDateFormat date01,date02,date03,date04;
		// MM 은 월, mm 은 분
		date01 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(date01.format(today));
		date02 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		System.out.println(date02.format(today));
		date03 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(date03.format(today));
		
		// a 는 오전, 오후 표시
		date04 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
		System.out.println(date04.format(today));
	}
}
