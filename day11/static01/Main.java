package day11.static01;

public class Main {
	public static void main(String[] args) {
		Static01 s1 = new Static01();
		Static01 s2 = new Static01();
		Static01 s3 = new Static01();
		
		// static 변수는 생성 없이도 사용할 수 있다.
		System.out.println(Static01.num2);
		
	}

}
