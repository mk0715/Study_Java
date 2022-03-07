package day02;

public class casting {

	public static void main(String[] args) {
		// 서로 다른 자료형 간에는 원래 연산이 불가능합니다.
		// 그렇지만 편의상 컴퓨터가 자동으로 자료형을 보정해 주는 경우가
		// 있는데, 이것을 가리켜 자료형 변환이라고 합니다.
		// 자동 형 변환인 promotion과 강제 형 변환인 casting이 있습니다.
		// 자동 형 변환은 작은데이터를 큰 데이터로 바꾸는 경우 발생하며,
		// 강제 형 변환은 큰 데이터를 작은 데이터로 바꿀때 사용합니다.
		int a = 5;
		double b = 7.12;
		System.out.println(a + b); // 자동 형 변환 , int -> double
		System.out.println(a + (int)b);  // 강제 형 변환 (바꿀형태)바꿀자료
		// 강제 형 변환, double -> int
	}

}
