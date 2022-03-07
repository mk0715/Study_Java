package day15.Collection01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto03 {

	public static void main(String[] args) {
		// 로또복권 당첨 시뮬레이터를 만들어주세요.
		// 1. 당첨번호 6개를 뽑습니다.
		// 2. 추첨번호 6개를 뽑습니다.
		// 3. 당첨번호와 추첨번호를 비교해서 일치하면 반복 중지
		// 4. 일치하지 않으면 반복횟수 1 추가하고 다시 추첨후 비교합니다.
		
		int count = 0;
		List<Integer> lotto = new ArrayList<>();
		List<Integer> getNums = new ArrayList<>();
		while(lotto.size() != 6) {
			int getNum = (int)(Math.random() * 45) + 1;
			if(!lotto.contains(getNum)) {
				lotto.add(getNum);
			}
		}
		Collections.sort(lotto);
		System.out.println("추첨된 번호 : " + lotto);
		
		while(!lotto.equals(getNums)) {
			count++;
			getNums.clear();
			while(getNums.size() != 6) {
				int getNum = (int)(Math.random() * 45) + 1;
				if(!getNums.contains(getNum)) {
					getNums.add(getNum);
				}
			}
			Collections.sort(getNums);
			System.out.println("이번에 뽑힌 번호 : " + getNums);
		}
		System.out.println("추첨번호 : " + lotto);
		System.out.println("당첨번호 : " + getNums);
		System.out.println("총 로또복권을 " + ((long)count * 1000)
				+ "원 사고서야 1등에 당첨되었습니다.");
	}
}
