package day06;

public class Method02 {
	public static int add2(int a) {
		return a + 1; // System.out.println();로 변환하는거와 차이점은 main에 출력할때 함수를 불러온다고 해서 console창에 표시되지않음.
					  // return은 method를 호출한 곳에 결과물을 가져다줌.
	}

	public static void main(String[] args) {
		// 반환자료가 void가 아닌 경우는 호출 위치에
		// return문 오른쪽 자료를 그대로 갖다놓습니다.
		// 자료를 반환하는것이 꼭 console창에 표시됨을 의미하지는 않습니다.
		int b = add2(10); // 위에 int에 10을 갖다주고 return에 의해서 add2(10)에 11을 갖다줌. b라는 변수에 11저장.
		System.out.println(b + 100); // b가 11로 저장되었기 때문에 b를 가공해서 출력가능.

	}

}
