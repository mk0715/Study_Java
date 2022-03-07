package day01;

public class dataInt {
	public static void main(String[] args) {
		// 정수형을 나타낼 수 있는 자료형은 크게 4가지 입니다.
		// byte, short, int, long형입니다.
		// 변수 선언시 지정 자료형을 위의 키워드로 쓰면 됩니다.
		byte a = 127; // byte 용량 작기 때문에 127까지만 출력가능.
		short b = 32500; // short 의 용량도 작기때문에 33000전까지 가능.
		int c = 3;
		long d = 4; // 저장하려는 데이터의 범위에 맞춰서 용량 아끼면서 저장 가능.
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}

}
