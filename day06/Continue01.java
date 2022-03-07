package day06;

public class Continue01 {
	public static void main(String[] args) {
		// continue문은 스킵기능을 생각하시면 됩니다.
		// 돌던 바퀴 즉시 종료, 그러나 다음 바퀴를 곧바로 실행합니다.
		// 전체적으로 반복문이 종료되는 break와 혼동하지 않도록 주의해주세요.
		
		for(int i=1; i<10; i++) {
			if(i==6 || i==8) {
				System.out.println("출력되지 않는 숫자입니다.");
				continue;
			}
			System.out.println("이번 숫자는 : " + i + "입니다.");
		}
	}

}
