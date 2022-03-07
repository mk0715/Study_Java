package day11.static02;

public class Asean {
	// 중간고사, 기말고사, 출석, 조별과제 점수를 변수로 정의해주세요.
	// 단, 조별과제는 모든 객체가 공유하는 점수입니다.
	private int midtest;
	private int finaltest;
	private int attendance;
	// public시 일반 변수에서 score 조회 가능
	// private시 static메서드에서만 조회 가능
	private static int teamproject = 15;
	
	// 생성자는 객체 생성시 중간고사, 기말고사, 출석점수를 받습니다. 
	public Asean(int midtest, int finaltest, int attendance) {
		this.midtest = midtest;
		this.finaltest = finaltest;
		this.attendance = attendance;
		
	}
	
	// getAseanInfo()를 정의해주세요. 이 메서드는 전체 변수값을 콘솔에 출력합니다.
	public void getAseanInfo() {
		System.out.println("중간고사 점수 : " + midtest);
		System.out.println("기말고사 점수 : " + finaltest);
		System.out.println("출석 점수 : " + attendance);
		System.out.println("조별과제 점수 : " + teamproject);
	}
	// static을 활용한  getInfo()를 정의해보겠습니다.
	public static void getInfo() {
		//System.out.println("중간고사 점수 : " + midtest);
		//System.out.println("기말고사 점수 : " + finaltest);
		//System.out.println("출석 점수 : " + attendance);
		System.out.println("조별과제 점수 : " + teamproject);
	}
	// Main.java를 생성해주시고 메인메서드 내부에서 구성원을 최소 4인으로 만드세요.

}
