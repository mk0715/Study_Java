package day03;

public class array01 {

	public static void main(String[] args) {
		// 배열은 일반 변수와 달리 하나의 변수명에 여러 값을 넣을 수 있습니다.
		// 배열은 자료형에 []를 붙이는 것으로 선언할 수 있습니다.
		// 배열은 크기를 정해서 생성할 수도 있고, 정하지 않고 생성할 수도 있습니다.
		// 배열에는 최대 크기 이상으로 자료를 넣을 수 없습니다.
		// 배열의 크기는 "배열의 길이"라고 표현합니다.
		// 배열명.length를 이용해 배열의 크기를 확인할 수 있습니다.
		
		// 배열의 선언 1(길이 확정 X)
		int a[] = {1, 2, 3, 4}; // a는 정수 '여러개'를 담을 수 있는 변수이다.
		System.out.println(a); // a변수에 1, 2, 3, 4가 들어감.  // System.out.println(a[0]); [x]는 python list처럼 몇번째 원소인지를 보여준다.
		// 배열의 선언 2(길이 확정 X)
		int[] b = {5, 6, 7, 8}; // b는 정수 '여러개'를 담을 수 있는 변수이다. // 결과값으로 출력되는 것은 스택에 힙데이터의 주소를 저장해놓은 것을 보여주는 것.
		System.out.println(b);
		
		// 배열의 생성(길이 확정) // 전부 0으로 채워짐
		int[] c = new int[8];
		System.out.println(c);
		
		// 배열의 길이는 .length로 알 수 있습니다.
		System.out.println(a.length);
		System.out.println(b.length);
		System.out.println(c.length);
		
		// 주소값이 아닌 배열 전체를 보고 싶은 경우 ?를 사용합니다.
		//System.out.println(a);
		//System.out.println(b);
		//System.out.println(c);
	}

}
