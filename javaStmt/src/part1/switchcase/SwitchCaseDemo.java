package part1.switchcase;

public class SwitchCaseDemo {
	public static void main(String[] args) {
		int sample = 3;
		
		switch (sample) {
		case 1:	System.out.println("1"); break;
		case 2:	System.out.println("2"); break;
		case 3:	System.out.println("3"); break;
		default:System.out.println("1부터 3까지 범위의 숫자가 아닙니다.");
			break;
		}
	}
}
