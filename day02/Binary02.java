package day02;

public class Binary02 {

	public static void main(String[] args) {
		// 비교 연산자는 크게 대소비교와 단순비교로 나뉩니다.
		// 단순비교는 ==(같다), !=(같지않다)이며 숫자가 아닌 자료형간 비교가 가능합니다.
		// 단, 단순비교도 동등한 자료유형간에만 비교가 가능합니다.
		// 대소비교는 >, <, >=, <= 이며 숫자끼리만 비교가 가능합니다.
		// 컴퓨터는 비교연산자를 명제로 인식하며
		// 참(true) 거짓(false)을 판단해 결과로 나타냅니다.
		System.out.println(3>5);
		System.out.println(12<=12);
		
		System.out.println("a" != "b");
		System.out.println("a" == "a");
		System.out.println(5 == 5);
		
	}
}
