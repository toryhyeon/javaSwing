package vector;

import java.util.Vector;

public class GradeServiceImpl implements GradeService{
	private Vector<Grade> grades = new Vector<Grade>();
	private Grade grade;
	
	/*
	 * 파라미터 타입이 객체 자체이므로, 개발자 국어, 영어 이런 값들을
	 * 핸들링 할 필요가 없다.
	 */
	@Override
	public void input(Grade grade) {
		grades.add(grade);
	//	grades.addElement(grade);
	}

	@Override
	public void printList() {
		/*
		 * 백터 내부에 toString() 을 호출하면
		 * 요소(엘리먼트) 내부에 정의된 to String() 을
		 * 각각 호출해 준다.
		 */
		System.out.println(grades.toString());
		
	}

	@Override
	public String SearchGradeByHak(String hak) {
		String msg = "";
		String searchdHak = "", name = ""; // 검색하려는 학번
		int kor = 0, eng = 0, math = 0;
		for (int i = 0; i < grades.size(); i++) {
			searchdHak = grades.elementAt(i).getHak();
			if (hak.equalsIgnoreCase(searchdHak)) {
				name = grades.elementAt(i).getName();
				kor = grades.elementAt(i).getKor();
				eng = grades.elementAt(i).getEng();
				math = grades.elementAt(i).getMath();
				// 객체를 이루는 필드값을 다 알아낸 다음...
				grade = new Grade(searchdHak, name, kor, eng, math);
				msg = grade.toString();
				break;
			} else {
				msg = "검색하려는 학번이 없습니다.";
			}
		}
		return msg;
	}
	/*
	 * 이쯤으로 정적조회인데 리턴값이 백터인 이유는 오더에서 동명이인을 허용하라고
	 * 했기 때문입니다. 결과값이 하나이든 여러개이든 출력 알고리즘은
	 * forloop + if 조합을 사용한다.
	 */

	@Override
	public Vector<Grade> searchGradesByName(String name) {
		/*
		 * 코딩패턴
		 * 1. 인터페이스가 있으면 무조건 인터페이스이름 + Impl 클래스 제작
		 * 2. 그 클래스는 인터페이스를 무조건 implements 함
		 * 3. 메소드가 출력한 값을 담아 둘(공통) 자료구조를 필드에 선언
		 *    - 자료구조를 선언시에는 자료구조 내부에 있는 객체 변수 더불어 선언
		 * 4. 메소드 내부에 리턴타입의 변수를 선언하고 초기화한후 리턴값에 배치
		 *    - 자료구조를 선언시에는 자료구조 내부에 있는 객체 변수 더불어 선언
		 * 5. 알고리즘이 필요한 상황에서 그 출력값이 검색결과라면 for + if 문 배치
		 */
		Vector<Grade> temp = new Vector<Grade>();
		Grade grade = null; // 객체 초기화는 null
		for (int i = 0; i < grades.size(); i++) {
			if (name.equalsIgnoreCase(grades.elementAt(i).getName())) {
				temp.add(new Grade(
						grades.elementAt(i).getHak(),
						grades.elementAt(i).getName(),
						grades.elementAt(i).getKor(),
						grades.elementAt(i).getEng(),
						grades.elementAt(i).getMath()));
				break;
			} else {
				temp.remove(new Grade());
			}
			
		}
		return temp;
	}

}
