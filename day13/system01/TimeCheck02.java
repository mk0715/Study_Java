package day13.system01;

public class TimeCheck02 {
	public static void main(String[] args) {
		// tryCatch 구문의 소요시간을 구해주세요.
		// 여러분들이 직접 원하는 종류의 구문을 작성해주세요.
		
		// 시작지점.
		Long start = System.currentTimeMillis();
		System.out.println(start);
		
		int[] number = {1, 2, 3, 4, 5, 0};
		
		try {
			for(int i=0; i<1000000000; i++) {
				//System.out.println(number[i]);
			}
			System.out.println(number[4] / number[5]);
			
		} catch(ArrayIndexOutOfBoundsException |
				ArithmeticException a) { 
			//System.out.println("범위를 벗어난 인덱스번호를 입력했습니다.");
			//System.out.println("0으로 나눴습니다.");
		} catch(Exception e) {  
			//System.out.println("이외의 다른 에러가 발생했습니다.");
		}
		
		// 종료지점
		Long end = System.currentTimeMillis();
		System.out.println(end);
		// 소요시간 구하기
		System.out.println(end - start);
	}
	
}
