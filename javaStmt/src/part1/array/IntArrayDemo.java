package part1.array;

public class IntArrayDemo {
	public static void main(String[] args) {
		int sum = 0;
		
		int[] arr; // 배열의 선언
		arr = new int[3]; // 배열의 객체 선언 !!주의 할당이 아닙니다.
		int[] arr2 = new int[3]; // 한 줄로 선언과 객체생성
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[2] = 3;
		
		for(int i = 0; i < 3; i++){
			sum += arr2[i];
		}
		System.out.println(sum);
		
		/*
		 * 배열을 이용해서 11 부터 20까지의 합을 구하세요.
		 * arr3 배열을 선언하시고 출력해주세요.
		 */
		
		int[] arr3 = new int [10];
		arr3[0] = 11;
		arr3[1] = 12;
		arr3[2] = 13;
		arr3[3] = 14;
		arr3[4] = 15;
		arr3[5] = 16;
		arr3[6] = 17;
		arr3[7] = 18;
		arr3[8] = 19;
		arr3[9] = 20;
		
		sum = 0;
		
		for(int i = 0; i < 10; i++){
		//	System.out.print(arr3[i] + "\t");
			sum += arr3[i];
		}
		System.out.println(sum);
	}
}
