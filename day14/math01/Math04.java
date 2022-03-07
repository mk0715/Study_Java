package day14.math01;

public class Math04 {
	public static void main(String[] args) {
		// Math.random()은 난수를 구해줍니다.
		double a = Math.random();
		System.out.println(a);
		
		// 범위를 제한하고 싶은 경우(0이상 6미만)
		int b = (int)(Math.random() * 6);
		System.out.println(b);
	}

}
