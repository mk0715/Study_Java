package day15.Collection01;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
	public static void main(String[] args) {
		// List는 생성 자료형으로 ArrayList와 LinkedList를 받을 수 있으며
		// 기본적으로는 ArrayList를 쓰게 됩니다.
		// java.util의 List나 ArrayList를 사용할 수 있습니다.
		
		// 정수 자료를 받을 수 있는 리스트 생성(길이 가변적)
		List<Integer> list1 = new ArrayList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		System.out.println(list1);
		list1.add(10);
		System.out.println(list1);
		list1.add(1, 100); // 1번 인덱스에 100을 추가.
		System.out.println(list1);
		list1.set(1, 99); // 1번 인덱스에 있는 자료를 99로 교체.
		System.out.println(list1);
	}

}
