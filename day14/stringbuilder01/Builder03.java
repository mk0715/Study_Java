package day14.stringbuilder01;

public class Builder03 {
	public static void main(String[] args) {
		// toString()은 내부 자료를 String으로 바꿔줍니다.
		// StringBuilder 자료형은 엄밀히 말하면 String이 아니기 때문에
		// 다시 형 변환을 해줘야 합니다.
		StringBuilder str = new StringBuilder("가나다라마바사");
		// 자료형 불일치
		//String hangul = (String)str;
		// String으로 교환
		String hangul = str.toString();
		
		System.out.println(hangul);
		
		// String 자료형을 StringBuilder형으로 교환해보세요.
		StringBuilder str2 = new StringBuilder(hangul);
		System.out.println(str2);
	}
	
}
