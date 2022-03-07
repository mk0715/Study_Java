package day04;

import java.util.Scanner;

public class while02 {
	public static void main(String[] args) {
		// 스캐너를 이용해서 String num 변수에
		// "문자열 형태인 숫자"를 입력받게 해 주세요.
		// 이 문자자료 num을 int loop 변수에 정수로 변환해 저장하세요.
		// loop 변수에 입력된 정수 횟수만큼
		// "반복문을 실행합니다." 라는 문장이 콘솔에 출력되도록
		// while문을 작성해주세요.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		String num = scan.nextLine();
		
		int loop = Integer.parseInt(num);
		int a = 0;
		
		while (a < loop) {
			a += 1;
			System.out.println("반복문을 실행합니다." + a);
		}
	}

}
