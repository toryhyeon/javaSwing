package test;

import java.util.Scanner;

public class PayMain {
	public static void main(String[] args) {
		/*
		 * 문제
		 * 
		 * === 홍길동의 6월 급여내역 ===
		 * 본봉 : 300만원
		 * 세금 : 30만원
		 * 실급여 : 270만원
		 * === 강감찬의 6월 급여내역 ===
		 * 본봉 : 400만원
		 * 세금 : 40만원
		 * 실급여 : 360만원
		 */
		
		PayVo hong = new PayVo(); // 클래스를 통한 hong 이라는 객체 생성문법
		PayVo kang = new PayVo();
		Scanner scanner = new Scanner(System.in);
		
		
		/* 이름 및 급여 입력 */
		System.out.println("이름을 입력하세요(홍길동)");
		hong.setName(scanner.next());
		System.out.println(hong.getName() + "의 본봉를 입력하세요");
		hong.setSalary(scanner.nextInt());
		
		System.out.println("이름을 입력하세요(강감찬)");
		kang.setName(scanner.next());
		System.out.println(kang.getName() + "의 본봉를 입력하세요");
		kang.setSalary(scanner.nextInt());
		
		
		/* 실급여 계산 */
		hong.setIncome(hong.getSalary());
		kang.setIncome(kang.getSalary());
		
		
		/* 출력 */
		System.out.println("=== " + hong.getName() + "의 6월 급여내역 ===");
		System.out.println("본봉 : " + hong.getSalary() + "만원");
		/*
		 * 인스턴스(의) 변수 : 인스턴스(hong, kang) 가 getter 와 setter 로 호출하는 필드값
		 * 클래스(의) 변수 : 클래스가 직접 호출하는 필드값
		 */
		System.out.println("세금 : " + (int) (hong.getSalary() * PayVo.TAX) + "만원");
		System.out.println("실급여 : " + hong.getIncome() + "만원");
		
		System.out.println("=== " + kang.getName() + "의 6월 급여내역 ===");
		System.out.println("본봉 : " + kang.getSalary() + "만원");
		System.out.println("세금 : " + (int) (kang.getSalary() * PayVo.TAX) + "만원");
		System.out.println("실급여 : " + kang.getIncome() + "만원");
		
		
		
	}
}
