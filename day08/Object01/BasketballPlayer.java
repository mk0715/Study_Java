package day08.Object01;

public class BasketballPlayer {
	// 농구선수의 정보를 정의해주세요.
	// 단, 키는 무조건 들어가도록 정의해주세요.
	public String name;
	public int cm;
	public int kg;
	public int score;
	
	// 생성자를 이용해 정보를 입력해야만 농구선수를 만들 수 있도록 해주세요.
	public BasketballPlayer(String n, int c, int k) {
		name = n;
		cm = c;
		kg = k;
		score = 0;
	}
	
	public void getInfo() {
		System.out.println("이름 : " + name);
		System.out.println("키 : " + cm);
		System.out.println("몸무게 : " + kg);
	}
	
	// 농구선수의 행동은 슛, 덩크슛이 있습니다.
	// 슛은 100% 성공합니다. 조건을 따지지 않습니다.
	// 덩크슛은 농구선수의 키가 일정 cm 이상일때만 성공하도록 조건문을 만들어주세요.
	// 스코어링 기능을 넣어주세요.
	// 슛을 성공할때마다 2점씩 점수 변수의 수치가 증가합니다.
	// getPoint() 메서드를 만들어주시고 여태까지 넣은 총점을 콘솔에 출력해주세요.
	public void shoot() {
		System.out.println(name + "가 슛을 성공하였습니다.");
		score += 2;
	}
	
	public void dunkShoot() {
		if(cm>190 & kg<100) {
			System.out.println(name + "가 덩크슛을 성공하였습니다.");
			score += 2;
		}else {
			System.out.println("실패하였습니다.");
		}
	}
	
	public void getPoint() {
		System.out.println(name + "의 점수는" + score + "입니다.");
	}

}
