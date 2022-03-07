package day05;

import java.util.Scanner;

public class for03 {

	public static void main(String[] args) {
		// Scanner로 int count 변수에 정수를 입력받아주세요.
		// 입력된 count 횟수만큼 "Hello Java"를 출력하는
		// 반복문을 아래쪽에 작성해주세요.
		Scanner scan = new Scanner(System.in);
		System.out.println("반복횟수를 입력해주세요.");
		int count = scan.nextInt();
		System.out.println("for문 구간");
		for(int i=1; i<=count; i++) {
			System.out.println("Hello Java");
		}
		System.out.println("while문 구간");
		int a = 0;
		while (a<count) {
			a += 1;
			System.out.println("Hello Java");
		}

	}

}
