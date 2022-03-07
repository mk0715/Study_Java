package day08.equals01;

import java.util.Scanner;

public class equalsQ1 {
	public static void main(String[] args) {
		// 로그인 시스템을 구현해보겠습니다.
		// String id, String pw에 각각 아이디 비밀번호로 하고싶은
		// 문자열을 저장해주세요.
		// Scanner를 이용해 uid, upw에 각각 아이디 비밀번호를 입력받게
		// 세팅한 다음, id가 같고 pw가 다르면 "비밀번호가 틀립니다."
		// id와 pw가 모두 같다면 "id님 로그인을 환영합니다."
		// id가 틀리다면 "없는 아이디입니다." 라고 출력하게 코드를 작성해주세요.
		Scanner scan = new Scanner(System.in);
		System.out.println("id를 입력해주세요.");
		String uid = scan.nextLine();
		
		
		String id = "abc1234";
		String pw = "asdf789";
		
		if(uid.equals(id) == true) {
			System.out.println("pw를 입력해주세요.");
			String upw = scan.nextLine();
			if(upw.equals(pw) == true) {
				System.out.println(id + "님 로그인을 환영합니다.");
			}else {
				System.out.println("비밀번호가 틀립니다.");
			}
		}else if(uid.equals(id) == false) {
			System.out.println("없는 아이디입니다.");
		}
			
	}

}
