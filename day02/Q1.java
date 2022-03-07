package day02;

public class Q1 {
	public static void main(String[] args) {
		// 전위, 후위수식 -- 를 이용해 코드를 작성해주세요.
		// 단 전위식, 후위식은 Unary01.java에서 그랬듯
		// 실행 로직을 풀어서도 작성해주세요.
		int a = 15;
		// 후위식 + System.out.println()
		System.out.println(a--);
		// 1. System.out.println(a(15));
		// 2. a = a(15) - 1;
		// a값 확인
		System.out.println(a);
		// 전위식 + System.out.println()
		System.out.println(--a);
		// 1. a = a(14) - 1;
		// 2. System.out.println(a(13));
		// a값 확인
		System.out.println(a);
	}

}
