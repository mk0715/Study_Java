package day06;

public class Method05 {
		// mul 메서드를 선언해주세요.
		// 이 메서드는 여러분들이 임의로 이름붙인 변수 3개를 입력받아
		// 변수 3개를 곱한 값을 return 해줍니다.
	
	public static int mul(int a, int b, int c) {
		return a*b*c;
	}
	
	public static void info() {
		// info 메서드를 선언해주세요.
		// 이 메서드는 내부에서
		// "안녕하세요."
		// "자바 메서드 학습중입니다."
		// "3줄을 한번의 호출로 적습니다." 라는 문장을 출력해줍니다.
		System.out.println("안녕하세요.");
		System.out.println("자바 메서드 학습중입니다.");
		System.out.println("3줄을 한번의 호출로 적습니다.");
	}

	public static void main(String[] args) {
		
		int result = mul(3, 4, 5);
		System.out.println("mul 메서드의 결과값 : " + result);
		
		// 반복적으로 호출할 구문에 대해서는 완전한 문장을 실행하는 경우라도
		// method로 만드는 경우가 존재한다.
		info();
		info();

	}

}
