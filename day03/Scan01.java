package day03;

import java.util.Scanner;

public class Scan01 {

	public static void main(String[] args) {
		// 코드 실행 중 사용자의 입력을 받는 경우 스캐너 기능을 사용합니다.
		// Scanner 부분에 마우스를 대고 import를 해주면 됩니다.
		Scanner scan = new Scanner(System.in);
		
		// 정수 한 글자를 입력받음
		int a = scan.nextInt();
		
		// 입력받은 정수 출력
		System.out.println(a);

	}

}
