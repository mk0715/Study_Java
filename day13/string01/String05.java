package day13.string01;

import java.util.Scanner;

public class String05 {
	public static void main(String[] args) {
		// .length()와 charAt() 을 활용해 입력된 전체 문자열을
		// 한 글자씩 출력하는 로직을 작성해보세요.
		// 문자열은 Scanner로 입력받습니다.
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요.");
		String a = scan.nextLine();
		
		int i = 0;
		int count = 0;
		int num = a.length();
		
		for(i=1;i<=num;i++) {
			char get = a.charAt(count);
			count++;
			System.out.println(get);
		}
		
		
	}
	
}
