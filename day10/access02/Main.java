package day10.access02;

import day10.access01.Child;

public class Main {
	public static void main(String[] args) {
		// 패키지가 다른(access01에 있는) Child를 생성
		Child c = new Child();
		// 1. public 접근제한자
		System.out.println(c.a);
		// 2. protected 접근제한자
		//System.out.println(c.b);
		// 3. private 접근제한자
		//System.out.println(c.c);
		
		// 4. default // 패키지가 달라서 실행 x.
		//System.out.println(c.d);
	}

}
