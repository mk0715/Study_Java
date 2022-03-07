package day02;

public class Binary01 {
	public static void main(String[] args) {
		// 이항 연산자는 양 변에 항목을 하나씩 취하는 연산자입니다.
		// 산술연산자는 우리가 잘 알고 있는 사칙연산 등을 활용하기 위한
		// 연산자이며 연산 우선순위도 그대로 계승합니다.
		// 단, % 연산자의 우선순위는 *, /와 동일합니다.
		// +, -, *
		System.out.println(3 + 5);
		System.out.println(17 - 21);
		System.out.println(2 * 3);
		// / 는 왼쪽 수를 오른쪽 수로 나눠 몫을 구합니다(정수 / 정수 = 정수)
		System.out.println(7 / 2);  // 3.5를 정수 결과로 바꿔서 출력
		System.out.println(7 / 2.0); // 최소 하나를 실수형으로 바꿔주면 우리가 알고있는 결과 가능.
		// % 는 정수 최대 몫을 구하고 남은 값을 출력합니다.
		System.out.println(10 % 4);
		// 연산의 우선순위는 그대로 존재합니다.
		System.out.println(10 + 6 % 4);
	}
}
