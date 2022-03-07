package day03;

public class logical02 {
	public static void main(String[] args) {
		// &&, ||는 Short circuit 연산자라고 부릅니다.
		// &, |와 똑같이 작동하되, 왼쪽의 조건식으로 모든 조건식이 확정이 되면
		// 추가적인 연산을 생략합니다.
		System.out.println((1+3 > 4) && (0 < 3/0));
		System.out.println((5 > 4) || (0 < 2/0));
	}

}
