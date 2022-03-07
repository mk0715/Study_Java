package day09.game01;

public class Magician extends Novice {
	public int mdam;
	
	public void getInfo() {
		System.out.println("아이디 : " + id);
		System.out.println("레벨 : " + level);
		System.out.println("경험치 : " + exp);
		System.out.println("체력 : " + hp);
		System.out.println("마나 : " + mp);
		System.out.println("마법공격력 : " + mdam);
	}
	
	public void attack() {
		System.out.println("몬스터를 사냥합니다.");
		exp += 2;
	}


}
