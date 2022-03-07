package day10.access02;

import day10.access01.Parent;

public class Child02 extends Parent {
	// Child02의 getB메서드는 Parent의 b를 출력해줌.
	// getB()와 같이 내부 요소를 조회만 할 수 있고
	// 수정은 할 수 없도록 제한하는 메서드를
	// getter라고 합니다.
	public void getB() {
		System.out.println(b);
	}
	// setter는 수정을 돕는 메서드입니다.
	public void setB(int b) {
		// setter는 사용자의 선택폭을 제한할 때 씁니다.
		if (b > 0) {
			this.b = b;
		}
	}

}
