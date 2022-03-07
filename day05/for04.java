package day05;

public class for04 {

	public static void main(String[] args) {
		// 중첩 반복문은 반복문을 반복하는 구문입니다.
		// 실행 횟수는 바깥쪽 반복문 횟수 * 안쪽 반복문 횟수입니다.
		// 굉장히 응용될 여지가 많으므로 반드시 잘 익혀두셔야 합니다.
		for(int i=0; i<3; i++) { // 바깥쪽 반복문 열기
			
			for(int j=0; j<3; j++) { // 안쪽 반복문 열기
				System.out.println(i + j);
			} // 안쪽 반복문 닫기
			
		} // 바깥쪽 반복문 닫기

	}

}
