package day14.stringbuilder01;

public class Builder01 {

	public static void main(String[] args) {
		// StringBuilder는 String 클래스와 로직차이로 인해
		// 속도 개선이 되었습니다. 일부 기능은 String의 기능과 겹칩니다.
		StringBuilder a = new StringBuilder("abefg"); 
		// 2번부터의 모든 자료를 다 1칸씩 뒤로 밀고 확보된 공간에 cd입력
		a.insert(2, "cd");
		
		
		System.out.println(a);

	}

}
