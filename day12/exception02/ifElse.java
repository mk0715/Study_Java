package day12.exception02;

import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {
		// int a, b에 스캐너로 각각 정수 입력을 받아주세요.
		Scanner scan = new Scanner(System.in);
		System.out.println("1번 정수를 입력해주세요.");
		int a = scan.nextInt();
		System.out.println("2번 정수를 입력해주세요.");
		int b = scan.nextInt();
		
		// a / b의 결과를 콘솔창에 띄워주시되
		// if ~ else 문을 이용해 0으로 나누는 에러 발생이 일어나기 전에
		// 나누는 수에는 0을 입력할 수 없습니다 라고 경고만 띄우게 처리해주세요.
		
		if (b == 0) {
			System.out.println("나누는 수에는 0을 입력할 수 없습니다.");
		}else {
			System.out.println(a / b);
		}

	}

}
