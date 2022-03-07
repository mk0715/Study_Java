package day10.game02;

public class Warrior {
	// 전사의 능력치를 변수로 세팅
	private int hp;
	private int exp;
	private int atk;
	private int mana;
	private String id;
	
	public Warrior(String id) {
		this.hp = 50;
		this.exp = 0;
		this.atk = 3;
		this.mana = 5;
		this.id = id;
	}
	
	//public void huntOrc(Orc o) {
		//o.setHp(o.getHp() - this.atk);
		//this.hp -= o.getAtk();
		//System.out.println("오크의 체력이 " + o.getHp() + "만큼 남았습니다.");
	//}
	
	// 직접 설계한 몬스터를 사냥하는 로직을 추가해주세요.
	//public void huntTroll(Troll t) {
		//t.setHp(t.getHp() - this.atk);
		//this.hp -= t.getAtk();
		//if (t.getHp()<=0) {
			//System.out.println("트롤이 죽었습니다.");
		//}else {
			//System.out.println("트롤의 체력이 " + t.getHp() + "만큼 남았습니다.");
			//System.out.println("체력이 " + this.hp + "만큼 남았습니다.");
		//}
		
	//}
	public void huntMonster(Monster m) {
		m.setHp(m.getHp() - this.atk);
		this.hp -= m.getAtk();
		if (m.getHp()<=0) {
			System.out.println("몬스터가 죽었습니다.");
		}else {
			System.out.println("몬스터의 체력이 " + m.getHp() + " 남았습니다.");
			System.out.println("체력이 " + this.hp + " 남았습니다.");
		}
		
	}
	
	// Warrior의 스킬을 하나 추가하겠습니다.
	// 스킬의 이름은 doubleAttack 이며 이 스킬은 마나 1을 차감하며
	// 현재 전사의 공격력의 2배 수치의 데미지를 몬스터에게 가합니다.
	// 마나가 부족하면 사용 불가능.
	
	public void doubleAttack(Monster m) {
		if (mana <=0) {
			System.out.println("마나가 부족해 스킬을 사용할 수 없습니다.");
		}else {
			m.setHp(m.getHp() - this.atk*2);
			this.hp -= m.getAtk();
			this.mana -= 1;
			System.out.println("몬스터의 체력이 " + m.getHp() + " 남았습니다.");
			System.out.println("체력이 " + this.hp + " 남았습니다.");
			System.out.println("마나가 " + this.mana + " 남았습니다.");
		}
	}
	
	public void getInfo() {
		System.out.println("현재 체력 : " + this.hp);
		System.out.println("현재 마나 : " + this.mana);
		System.out.println("현재 공격력 : " + this.atk);
		System.out.println("현재 경험치 : " + this.exp);
		System.out.println("현재 유저 : " + this.id);
	}

}
