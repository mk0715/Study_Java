package day10.game02;

public class Main02 {
	public static void main(String[] args) {
		// 자료형이 일치하지 않아도 상속관계라면
		// 부모 자료형 변수에 자식 객체를 대입할 수 있다.
		Monster m1 = new Orc();
		Monster m2 = new Troll();
		
		// 단 자식 자료형 변수에 부모 객체를 넣는것은 불가능하다.
		//Orc o1 = new Monster(2, 6);
		//Troll t1 = new Monster(3, 7);
		
		// 위의 조건을 이용해 부모 자료형을 요청하는 배열에는 자식을 넣을 수 있다.
		Orc o1 = new Orc();
		Orc o2 = new Orc();
		Troll t1 = new Troll();
		Troll t2 = new Troll();
		
		Monster[] mArr = {o1, o2, t1, t2};
		System.out.println(mArr);
		
		//int[] iArr = {"ㄱ", "ㄴ", 1, 2}; // int배열이라 "ㄱ", "ㄴ"의 String자료형에 오류가 난다.
		
		// 강제로 사용자가 자료형을 바꿔주는것을 casting이라고 합니다.
		// casting은 (바꿀자료형)기존자료; 로 처리합니다.
		//int num1 = 3.5; // 정수에 실수를 넣어서 에러
		int num2 = (int)3.5; // 실수 3.0을 정수화
		System.out.println(num2);
	}

}
