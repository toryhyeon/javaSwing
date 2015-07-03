package part1.whileloop;

public class SumTen {
	public static void main(String[] args) {
		/* while 10까지의 합 */
		int num = 0;
		int hap = 0;
		while(num < 11){
			hap += num;
			num++;
		}
		System.out.println("While 문 : 1부터 10까지 합 = " + hap);
		
		/* do-while 10까지의 합 */
		int count = 1;
		int sum = 0;
		do {
			sum += count;
			count++;
		} while (count<11);
		System.out.println("Do-While : 1부터 10까지 합 = " + sum);
		
		/* for 문 10까지의 합 */
		int total = 0;
		for (int i = 0; i <= 10; i++) {
			total += i;
		}
		System.out.println("For-Loop : 1부터 10까지 합 = " + total);
	}
}
