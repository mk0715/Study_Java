package day01;

public class variable {

	public static void main(String[] args) {
		// 변수는 일종의 자료를 담을 수 있는 박스라고 생각하면 됩니다.
		// 자료를 담기 전에 어떤 자료가 담길지 미리 약속을 해야 합니다.
		int a; // 나는 a라는 박스에 정수를 넣을 예정이다.(아직 넣지 않음)
		a = 5; // a박스에 5라는 값을 담겠다.
		int b, c;  // b와  c라는 박스에 정수를 넣을 예정이다.
		b = 10; // b박스에 10을 담겠다.
		c = 15; // c박스에 15를 담겠다.
		System.out.println(a); // a변수 내부 자료 5 출력
		System.out.println(b); // b변수 내부 자료 10 출력
		System.out.println(c); // c변수 내부 자료 15 출력
		a = 20; // a변수 내부에 20 입력 (기존의 5는 삭제)
		System.out.println(a); // a변수 내부 자료 20 출력 
	}

}
