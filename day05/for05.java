package day05;

public class for05 {
	public static void main(String[] args) {
		// 구구단을 출력하는 코드를 작성해주세요.
		// 구구단은 2 ~ 9단까지 출력하면 됩니다.
		// 중첩 반복문을 사용해서 작성해주세요.
		
		for(int i=2; i<=9; i++) {
			System.out.println(i+"단 입니다.");
			for(int j=1; j<=9; j++) {
				System.out.println(i+" * "+j+" = "+i*j);
			}
			System.out.println("---------------------");
		}
	}

}
