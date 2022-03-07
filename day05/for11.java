package day05;

public class for11 {

	public static void main(String[] args) {
		// 중첩 반복문을 이용해서 다음 방정식의 정수 해를 모두 구하세요.
		// 4x + 5y = 60
		for(int i=1; i<=15; i++) {
			for(int j=1; j<=12; j++) {
				if(4*i + 5*j == 60) {
					System.out.println("x의 해 : "+ i);
					System.out.println("y의 해 : "+ j);
					System.out.println("--------------");
				}
			}
		}

	}

}
