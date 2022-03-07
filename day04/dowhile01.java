package day04;

public class dowhile01 {

	public static void main(String[] args) {
		// do~while문은 while문과 기본적으로 똑같습니다.
		// 단, 첫 번째 바퀴에서 만큼은 조건비교 없이 바로 실행하고
		// 이후 두 번째 바퀴 이후는 각 바퀴마다 비교를 통해 추가 실행여부를
		// 결정합니다.
		int a = 10;
		
		do { // do 구문이 먼저 써집니다.
			a += 2;
			System.out.println("a는 5보다 작다???");
		}while(a<5); // 일반 while문과 달리 마지막에 ;이 붙습니다.

	}

}
