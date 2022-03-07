package day04;

public class for01 {

	public static void main(String[] args) {
		// for문은 while문과는 다르게 몇 바퀴 돌릴지 정해진 상황에서
		// 사용하는 반복문입니다.
		// 문법은 
		// for (시작변수; 종료조건; 증감식){
		// 		실행구문;
		// } 으로 이루어져 있습니다.
		for(int i=1; i<=5; i++) { // 후위수식 1 출력후 1증가  // 1부터 시작해서 n보다 작거나 같다면 n바퀴. 0부터 시작하면 n보다 작다로 해야 n바퀴.
			System.out.println("for문을 이용한 반복문");
		}

	}

}
