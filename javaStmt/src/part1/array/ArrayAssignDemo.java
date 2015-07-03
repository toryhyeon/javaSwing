package part1.array;

/*
 * @ Date 	: 20150615
 * @ Author : 최승현
 * @ Story	: 배열 할당시 선언과 동시에 할당하는 방식
 */
public class ArrayAssignDemo {
	public static void main(String[] args) {
		
		int[] intArr = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
		int sum = 0, sum2 = 0;
		
		// for 문으로 돌려서 100부터 1000까지 합을 출력하세요
		for(int i = 0; i < intArr.length; i++){
			sum += intArr[i];
		}
		System.out.println(sum);
		
		/*
		 * 확장된 for 문 문법
		 * 배열을 출력할 때 limit 값을 정할 필요없이
		 * 무조건 전체 출력을 한다면.. 리미트값 생략가능
		 */
		for(int i : intArr){
			sum2 += i;
		}
		System.out.println(sum2);
	}
}
