package day15.map01;

import java.util.HashMap;

public class HashMap01 {
	
	public static void main(String[] args) {
		// Map 자료형의 대표 자료형은 HashMap입니다.
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("MK","자바");
		map.put("김영수", "JSP");
		map.put("코로나", "바이러스");
		System.out.println(map);
		
		// 자료조회시는 .get(키값)으로 조회합니다.
		System.out.println(map.get("김영수"));
		System.out.println(map.get(0)); // 존재하지 않아 null로 출력.
		
		// containsKey로 키값이 존재하는지 조회
		System.out.println(map.containsKey("MK"));
		System.out.println(map.containsKey("MJ"));
		
		// remove는 key를 이용해서 key=value를 삭제합니다.
		map.remove("김영수");
		System.out.println(map);
		
		// .size()는 크기를 알려줍니다. 정수로 몇개의 key=value쌍이 저장되었는지
		// 확인할 수 있습니다.
		System.out.println(map.size());
	}

}
