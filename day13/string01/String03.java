package day13.string01;

import java.util.Scanner;

public class String03 {
	public static void main(String[] args) {
		// Scanner를 통해서 전체 문장을 입력받으세요.
		Scanner scan = new Scanner(System.in);
		System.out.println("문장을 입력해주세요 : ");
		String a = scan.nextLine();
		
		// 다음으로 문장내에서 찾고싶은 단어를 입력받으세요.
		System.out.println("찾고싶은 단어를 입력해주세요 : ");
		String b = scan.nextLine();
		
		// 문장내에 있는 단어들의 인덱스번호와, 몇 개가 검출되었는지
		// 출력해주는 코드를 작성해보세요.
		
		// 갯수 카운팅
		int num = 0;
		// 반복문 추가 실행 여부
		boolean bool = true;
		// 마지막으로 발견된 지점
		int fidx = -1;
			
		while(bool) {
			int get = a.indexOf(b, fidx+1);
			if(get == -1) {
				bool = false;
			}else {
				fidx = get;
				num++;
				System.out.println(get + "번에서 " + num + "번째 " + b + "가 검출되었습니다.");
			}	
			
		}
		System.out.println("총 " + num + "개의 결과가 검출되었습니다.");
	}

}
