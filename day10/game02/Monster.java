package day10.game02;

public class Monster {
	// 몬스터가 가져야할 공통 변수와 공통 메서드를 만들어주세요.
	private int hp;
	private int atk;
	
	public Monster(int atk, int hp) {
		this.atk = atk;
		this.hp = hp;
	}
	
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public int getAtk() {
		return this.atk;
	}

}
