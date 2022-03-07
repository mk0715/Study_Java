package day12.exception02;

import java.util.Scanner;

public class tryCatch01 {

	public static void main(String[] args) {
		// try~catch 구문은 크게 예외가 발생할 구문을 적는 try블록과
		// 예외 발생시 처리할 catch 구문으로 나뉩니다.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1번 정수를 입력해주세요.");
		int a = scan.nextInt();
		System.out.println("2번 정수를 입력해주세요.");
		int b = scan.nextInt();
		
		try {
			// 예외가 발생할 구문을 적는 블록. 반드시 catch가 하단에
			// 추가로 작성되어야 한다.
			System.out.println(a / b);
			System.out.println("계산 끝!");
		}catch(Exception e) {
			// catch블록은 try블록에서 예외 발생시 넘어옵니다.
			System.out.println("나누는 숫자는 0이 될 수 없습니다.");
		}

	}

}
