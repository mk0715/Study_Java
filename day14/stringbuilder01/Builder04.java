package day14.stringbuilder01;

public class Builder04 {
	public static void main(String[] args) {
		// reverse()는 문자열을 인덱스 순으로 따졌을때
		// 역순으로 나열해줍니다.
		StringBuilder str = new StringBuilder("zyxwvut");
		str.reverse();
		System.out.println(str);
		
	}
	
}
