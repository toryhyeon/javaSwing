package lang;

import java.util.Arrays;

public class StringClass {
	public static void main(String[] args) {
		String fruit = "apple,banna,cherry,orange";
		String[] fruits = fruit.split(",");
		for (int i = 0; i < fruits.length; i++) {
		//	System.out.print(fruits[i] + "\t");
		}
		System.out.println("Arrays 로 출력");
	//	String[] fruits2 = fruit.split(",",2); // 공벽을 다 주지 않고 지정값만 줌
		System.out.println(Arrays.toString(fruit.split(",")));
	}
}
