package day08.equals01;

public class equalsTest {

	public static void main(String[] args) {
		// 문자열을 저장하는 경우 일반적으로 같은 문자열에 대해서는
		// 자바는 메모리 절약을 위해 같은 주소를 공유합니다.
		String str1 = "Hello Java";
		String str2 = "Hello Java";
		System.out.println(str1 == str2);
		
		// 단, 문자열을 만들때 new 키워드를 사용하면 
		// 설령 같은 문자열을 만들어도 항상 새로운 주소를 배정합니다.
		String str3 = new String("Hello Java");
		String str4 = new String("Hello Java");
		System.out.println(str3 == str4);
		
		// 위와 같이 주소비교를 하는게 일반적 비교연산자이고
		// 주소비교 없이 문자만 비교할 때는 .equals()를 사용합니다.
		System.out.println(str3.equals(str4));
		System.out.println(str1.equals(str3));

	}

}
