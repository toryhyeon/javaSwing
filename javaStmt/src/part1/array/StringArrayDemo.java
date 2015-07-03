package part1.array;

public class StringArrayDemo {
	public static void main(String[] args) {
		
		String[] arr; // String타입의 배열 선언
		arr = new String[3]; // 3처럼 항상 인덱스 사이즈를 입력해야 함.
		
		double[] douArr;
		douArr = new double[3];
		
		arr[0] = "1";
		arr[1] = "2";
		arr[2] = "3";
		arr[3] = "300";
		
		for(int i = 0; i < 3; i++){
			System.out.println(arr[i]);
		}
		/*
		 * java.lang.ArrayIndexOutOfBoundsException: 3
		 * 이 에러메시지는 배열의 크기를 벗어난
		 * 숫자만큼 입력된 에러를 나타냄
		 */
	}
}
