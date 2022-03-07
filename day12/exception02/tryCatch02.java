package day12.exception02;

public class tryCatch02 {
	public static void main(String[] args) {
		// 아까 exception01 내부의 여러 예외 유형 중 하나를 골라서
		// 예외가 발생할 수 있는 코드를 작성해주세요.
		// 발생할 예외에 대한 처리는 try~catch 블록을 활용합니다.
		String[] name = {"김자바", "제이에스피", "박스프링"};
		
		try {
			for(int i=0; i<4; i++) {
				System.out.println(name[i]);
			}
			System.out.println("이상 출석부 전체 목록이었습니다.");
		}catch(Exception e) {
			System.out.println("더 이상 학생이 없습니다.");
		}finally {
			System.out.println("집계가 끝났습니다.");
		}
		
		
	}

}
