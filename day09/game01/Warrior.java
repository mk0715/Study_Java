package day09.game01;

public class Warrior extends Novice {
	// Novice 상속으로 체력, 마나, 레벨, 아이디 수치는 이미 기입됨.
	// 전사 클래스는 평민과 달리 물리공격력 수치를 부여받습니다.
	public int pdam;
	
	// getInfo() 함수를 Warrior에 맞게 수정합니다.
	// 현재 Novice에도 같은 이름의 함수가 존재함.
	public void getInfo() {
		System.out.println("아이디 : " + id);
		System.out.println("레벨 : " + level);
		System.out.println("경험치 : " + exp);
		System.out.println("체력 : " + hp);
		System.out.println("마나 : " + mp);
		System.out.println("물리공격력 : " + pdam);
	}
	
	public void attack() {
		System.out.println("몬스터를 사냥합니다.");
		exp += 2;
	}

}
