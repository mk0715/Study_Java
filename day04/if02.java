package day04;

import java.util.Scanner;

public class if02 {

	public static void main(String[] args) {
		// 주어진 변수 a에 스캐너로 정수값을 입력받도록 만들어주세요
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력해주세요.");
		int a = scan.nextInt();
		// 입력받은 정수가 0이상이면 "0보다 크거나 같습니다."를 콘솔창에
		if (a>=0) {
			System.out.println("0보다 크거나 같습니다.");
		}
		// 그렇지 않다면 "0보다 작습니다."를 콘솔창에 출력하는 코드를
		// if 블럭 2개를 이용해 구현해주세요.
		if (a<0) 
			System.out.println("0보다 작습니다."); // if문안의 문장이 한줄이라면 중괄호 생략가능. 두줄 이상시 첫줄 뒤에는 if문안의 문장으로 실행되는 것이 아님.
		
			

	}

}
