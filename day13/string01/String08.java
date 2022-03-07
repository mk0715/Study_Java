package day13.string01;

public class String08 {
	public static void main(String[] args) {
		// trim()은 공백이 아닌 문자가 시작하기 직전 모든 지점과
		// 공백이 아닌 문자로 끝난 이후 지점의 모든 공백을 제거합니다.
		String str = "              Hello       Java         ";  // 중간 공백은 비우지 않음.
		System.out.println(str.trim());
		
		// replace()를 이용해 공백 전체를 없애보세요.
		str = str.replace(" ", "");
		System.out.println(str);
		
		// trim과 replace()를 이용해 Hello Java 사이의 공백을 한 칸만 남겨보세요.
		str = str.replace(" ", "");
		str = str.replace("o", "o ");
		//System.out.println(str.trim().replace(" ", "")); // 공백이 짝수면 안띄어져 나올 수도 있음. trim을먼저 걸고 replace를 거는 형태.
		System.out.println(str);
	}
	
}
