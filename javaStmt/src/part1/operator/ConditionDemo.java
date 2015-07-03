package part1.operator;

public class ConditionDemo {
	public static void main(String[] args) {
		int val1 = 1, val2 = 2;
		if((val1 == 1) && (val2 != 2)){ // val1 이 1 이면서 val2 가 2 인 경우 (교집합)
			System.out.println("val1 이 1 이면서 val2 가 2 인 경우 입니다.");
		} else	if((val1 == 1) || (val2 != 2)){ // val1 이 1 이거나 val2 가 2 인 경우 (합집합)
			System.out.println("val1 이 1 이거나 val2 가 2 인 경우 입니다.");
		}	
	}
}
