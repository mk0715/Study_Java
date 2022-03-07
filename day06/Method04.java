package day06;

public class Method04 {
	
	public static void plus2(int c, int num) {
		System.out.println(c + num);
	}

	public static void main(String[] args) {
		// 중괄호 여닫는 부분을 "지역"이라고 합니다.
		// 중괄호가 닫히면 해당 "지역"과 지역 내 자료들은 모두 소멸됩니다.
		plus2(10, 20);
		//System.out.println(c);
		//System.out.println(num);

	}

}
