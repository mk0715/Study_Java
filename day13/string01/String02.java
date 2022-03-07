package day13.string01;

public class String02 {
	public static void main(String[] args) {
		// indexOf()는 특정 문자열의 시작 인덱스 값을 반환합니다.
		// 만약 특정 문자열이 포함되어 있지 않다면 -1을 리턴합니다.
		String tomato = "tomato";
		int get = tomato.indexOf("to"); // 앞에 to 처리
		System.out.println(get);
		
		// 중복문자 처리
		get = tomato.indexOf("to", 1); // 뒤에 to를 처리, so 4번째
		System.out.println(get);
		
		// 없는 문자열 처리
		get = tomato.indexOf("banana");
		System.out.println(get);
	}

}
