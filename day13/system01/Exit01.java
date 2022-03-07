package day13.system01;

public class Exit01 {
	public static void main(String[] args) {
		// System.exit()은 break문처럼 실행 즉시 프로그램 실행을 중단합니다.
		System.out.println("실행중 1");
		System.out.println("실행중 2");
		System.out.println("실행중 3");
		System.out.println("실행중 4");
		System.exit(0); // 0 정상 종료(에러발생X), 0이외 비정상종료(에러발생O)
		System.out.println("실행중 5");
		System.out.println("실행중 6");
	}
}
