package day12.exception02;

public class tryCatch03 {

	public static void main(String[] args) {
		// 다중catch는 블럭 내부에서 여러 유형의 예외가 발생할 수 있을 때
		// 각각 예외유형을 다르게 처리할 때 사용합니다.
		// 이때 catch구문을 여러 번 사용할 수 있습니다.
		int[] number = {1, 2, 3, 4, 5, 0};
		
		try {
			for(int i=0; i<3; i++) {
				System.out.println(number[i]);
			}
			System.out.println(number[4] / number[5]);
			
		} catch(ArrayIndexOutOfBoundsException a) { // 범위를 벗어났을 때만 처리.
			System.out.println("범위를 벗어난 인덱스번호를 입력했습니다.");
		//} catch(ArithmeticException ae) { // 0으로 나눠서 더이상 나눌수 없을때.
			//System.out.println("0으로 나눌 수 없습니다.");
		} catch(Exception e) {  // 어떤 유형의 예외가 발생해도 처리.(만능). 혹시 모르는 예외처리를 위해 마지막에 넣어주는것이 좋음.
			System.out.println("이외의 다른 에러가 발생했습니다.");
		}

	}

}
