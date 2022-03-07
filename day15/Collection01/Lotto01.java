package day15.Collection01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lotto01 {
	public static void main(String[] args) {
		// 로또복권 추첨기를 만들어보겠습니다.
		// 로또복권 추첨기는 1이상 45이하의 범위에서 겹치는 숫자 없이
		// 6개의 숫자를 뽑습니다.
		// 순서를 정렬해서 출력하도록 만들어주세요.
		//List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		Random random = new Random();
		int result = 0;
		
		while(list2.size() < 6) {
			result = (random.nextInt(45) + 1);
			if(list2.contains(result)) {
				list2.remove(result);
			}else{
				list2.add(result);
			}
		}
		
		Collections.sort(list2);
		
		while(list2.contains(result)) {
			result = (random.nextInt(45) + 1);
		}
		
		
		System.out.println("추첨된 번호 : " + list2);
		System.out.println("2등당첨번호 : " + result);
	}

}
