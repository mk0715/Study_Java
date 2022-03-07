package day14.arrays01;

import java.util.Arrays;

public class Sort01 {
	public static void main(String[] args) {
		// Arrays.sort(배열) 은 배열 내부 순수
		// 작은숫자일수록 0번 인덱스에 가깝게
		// 큰 숫자일수록 마지막 인덱스에 가깝게 배치합니다.
		int[] arr = {21, 60, 32, 44, 1, 59, 99, 89, 36};
		Arrays.sort(arr);
		System.out.println(arr); // 번지수만 출력
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		System.out.println(Arrays.toString(arr)); // 값들을 문자열 형식으로 return하기 위해 toString 사용.
		
	}
	
}
