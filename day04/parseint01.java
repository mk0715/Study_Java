package day04;

public class parseint01 {

	public static void main(String[] args) {
		// 정수자료는 굳이 문자로 바꾸지 않아도
		// System.out.println()구문 내에서 +로 문자와 연결하면
		// 자동으로 문자로 변경됩니다.
		// 그러나 문자 전체가 정수로만 이루어진 문자열을
		// 정수로 치환하기 위해서는 별도의 문법을 사용합니다.
		String str = "2020";
		int year = Integer.parseInt(str);
		// Integer.parseInt(문자열) 을 집어넣으면 정수로 교환해줌.
		
		System.out.println(year + 1);
		System.out.println(str + 1);

	}

}
