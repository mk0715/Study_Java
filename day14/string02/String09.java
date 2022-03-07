package day14.string02;

public class String09 {
	public static void main(String[] args) {
		// valueOf()는 기본 데이터 타입의 값들을 문자로 바꿔서 출력해줍니다.
		int a = 10;
		// String.valueOf(바꿀자료);
		String b = String.valueOf(a);
		System.out.println(b);
		
		double c = 3.5;
		String d = String.valueOf(c);
		// a, c는 정수 + 실수
		System.out.println(a + c);
		// b, d는 문자열 + 문자열
		System.out.println(b + d);
		
	}
	
}
