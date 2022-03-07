package day05;

import java.util.Scanner;

public class for06 {

	public static void main(String[] args) {
		// Scanner로 정수를 입력받게 해 주세요.
		// 입력받은 정수의 제곱 형태의 직사각형이 찍히도록
		// 중첩 반복문을 작성해주세요.
		// ex) 3 입력시
		// ***
		// ***
		// *** 과 같이 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("한 변의 너비를 입력해주세요.");
		int a = scan.nextInt();
		for (int i=1; i<=a; i++) {
			System.out.println();
			for (int j=1; j<=a; j++) {
				System.out.print("*");

			}
		}

	}

}
