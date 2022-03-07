package day09.game02;

public class Warrior {
	// 정보 입력(단, 사용자가 임의로 수치 변경하는 것을 막기 위해 private 설정)
	private int hp;
	private int atk;
	private int lv;
	private int exp;
	
	// 메서드는 아무리 사용해도 개발자의 의도대로 사용되도록 제한할 수 있기 때문에
	// 일반적으로 public으로 설정한다.
	
	public Warrior() {
		this.hp = 20;
		this.atk = 3;
		// 레벨, 경험치는 생성시 0으로
		this.lv = 1;
		this.exp = 0;
	}
	
	public void hunt() {
		System.out.println("전사가 사냥을 시작합니다.");
		hp -= 2;
		exp += 10;
		System.out.println("사냥 결과 체력은 " + hp + "가 되었고");
		System.out.println("누적경험치는 " + exp + "이 되었습니다.");
	}

}
