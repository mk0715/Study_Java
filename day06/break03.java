package day06;

import java.util.Scanner;

public class break03 {

	public static void main(String[] args) {
		// Scanner로 정수를 입력받으세요.
		// 1~n까지 차곡차곡 순서대로 더해나갔을때
		// 1부터 몇 까지 더해야 입력된 정수를 초과하는지 계산해주는 프로그램을
		// 작성해주세요.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int a = scan.nextInt();
		
		int num = 0;
		int total = 0;
		while (a>=total) {
			num += 1;
			total += num;
			System.out.println("1부터 "+num+"까지의 총합은 : "+ total+"입니다.");
			}
		System.out.println("목표값 : " + a);
		System.out.println("총 합: "+total);
		System.out.println("몇까지 더했나? : " + num);
		}
	}
