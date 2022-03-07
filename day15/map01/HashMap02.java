package day15.map01;

import java.util.HashMap;

public class HashMap02 {

	public static void main(String[] args) {
		// 식당 메뉴판을 만들어보세요.
		// key는 음식이름, value는 가격(정수)로 저장해주세요.
		// 메뉴는 5개 이상 집어넣어주세요.
		// 메뉴를 3개 조회해서 화면에 출력해주세요.
		HashMap<String, Integer> menu = new HashMap<String, Integer>();
		
		menu.put("사과", 1000);
		menu.put("바나나", 1500);
		menu.put("메론", 3000);
		menu.put("딸기", 2000);
		menu.put("키위", 2500);
		
		System.out.println(menu.get("사과"));
		System.out.println(menu.get("메론"));
		System.out.println(menu.get("수박"));
		
		System.out.println(menu.containsKey("사과"));
		System.out.println(menu.containsKey("딸기"));
		System.out.println(menu.containsKey("참외"));
		

	}

}
