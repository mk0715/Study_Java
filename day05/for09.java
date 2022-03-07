package day05;

import java.util.Scanner;

public class for09 {

	public static void main(String[] args) {
		// 피라미드형 별을 찍어보겠습니다.
		// 아래와 같은 별을 찍을 수 있도록 코드를 작성해주세요.
		//    *
		//   **
		//  ***
		// ****
		// 중첩 반복문의 어느곳이 세로, 가로를 담당하는지 생각해보세요.
		Scanner scan = new Scanner(System.in);
		System.out.println("몇개?");
		int a = scan.nextInt();
		
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=a-i; j++) {
				System.out.print(" "); // 공백찍기
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*"); // *찍기
			} // 두개 합쳐야하므로 같은 큰 for문안에서 실행되어야함
		System.out.println();
		}
		

	}

}
