package part1.operator;

public class ComparisionDemo2 {
	public static void main(String[] args) {
		int val01 = 1, val02 = 2;
		
		/*
		 다중의 if 문을 한가지 로직으로 합쳐야 할 경우라면,
		 if else 구문을 사용한다.
		 */
		
		if(val01 == val02){ // val01 과 val02의 값이 같다면...
			System.out.println("val01 과 val02의 값이 같다");
		}else
		if(val01 != val02){ // val01 과 val02의 값이 다르다면..
			System.out.println("val01 과 val02의 값이 다르다");
		}else
		if(val01 > val02){ // val01 이 val02 보다 크다면..
			System.out.println("val01 이 val02 보다 크다");
		}else
		if(val01 < val02){ // val01 이 val02 보다 작다면..
			System.out.println("val01 이 val02 보다 작다");
		}
	}
}
