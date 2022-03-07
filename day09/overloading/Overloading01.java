package day09.overloading;

public class Overloading01 {
	// 아래 메서드 2개는 모두 이름이 plus 입니다.
	// 단 하나는 2개의 int를, 하나는 3개의 int를 입력해야 실행됩니다.
	// 오버로딩 1
	public static void plus(int a, int b) {
		System.out.println(a + b);
	}
	// 오버로딩 2
	public static void plus(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	// 오버로딩 3
	public static void plus(double a, double b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		plus(3, 4);
		plus(10, 20, 30);
		plus(3.0, 5.0);

	}

}
