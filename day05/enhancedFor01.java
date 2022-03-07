package day05;

public class enhancedFor01 {
	public static void main(String[] args) {
		// 향상된 for문은 반복문 진행시 타겟으로 배열을 집어넣습니다.
		// 이 경우 반복실행 횟수는 배열의 내부 요소 갯수만큼입니다.
		int[] arr1 = {100, 211, 339, 475, 591};
		
		for(int a: arr1) {
			System.out.println(a);
		}
	}

}
