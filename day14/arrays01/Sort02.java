package day14.arrays01;

import java.util.Arrays;

public class Sort02 {
	public static void main(String[] args) {
		// sort는 단순히 숫자에만 작동하지 않습니다.
		// 문자에도 제한적으로 작동합니다.
		// ASCII 코드 규칙에 따라 작동합니다.
		// ""(NULL) = 0번, " "(띄어쓰기) = 21번, "0" ~ "9" = 48~57번, "A" = 65번, "a" = 97번 
		String[] arr = {"apple", "Apple", "Banana", "giraffe", "Zet"};
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}
	
}
