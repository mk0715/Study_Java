package day10.game02;

public class Instanceof01 {

	public static void main(String[] args) {
		// instanceof는 특정 변수가 특정 자료형과 상속관계인지 아닌지 검사합니다.
		// m변수는 Monster 타입이지만 Orc가 내장되어 있음
		Monster m = new Orc();
		
		// m 변수가 Orc 자료형과 관련이 있는지 확인
		System.out.println(m instanceof Orc);
		// m 변수가 Troll 자료형과 관련이 있는지 확인
		System.out.println(m instanceof Troll);

	}

}
