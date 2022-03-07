package day15.Collection01;

import java.util.ArrayList;
import java.util.List;

public class Lotto02 {
	public static void main(String[] args) {
		// List 역시 참조형 변수이기 때문에 비교시 주소값만 비교합니다.
		// 따라서 단순 == 비교가 아닌 리스트1.equals(리스트2)
		// 를 이용해 내부 요소 비교를 합니다.
		
		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		System.out.println(l1 == l2);
		System.out.println(l1.equals(l2));
		
		l1.add(1);
		l1.add(2);
		l2.add(2);
		l2.add(1);
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l1.equals(l2));
		
	}
	
}
