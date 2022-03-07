package day10.game02;

public class Main {
	public static void main(String[] args) {
		// 전사와 오크가 전투를 하는 상황 만들기
		Warrior w1 = new Warrior("전사1");
		Orc o1 = new Orc(); // monster를 상속받은 모든 자료들은 메서드를 그냥 사용가능.
		Orc o2 = new Orc(); // monster를 상속받은 모든 자료들은 메서드를 그냥 사용가능.
		w1.getInfo();
		System.out.println();
		w1.huntMonster(o1);
		w1.huntMonster(o1);
		System.out.println();
		w1.huntMonster(o2);
		System.out.println();
		w1.getInfo();
		System.out.println();
		
		Troll t1 = new Troll(); // monster를 상속받은 모든 자료들은 메서드를 그냥 사용가능.
		w1.doubleAttack(t1);
		w1.doubleAttack(t1);
		w1.doubleAttack(t1);
		w1.doubleAttack(t1);
		w1.doubleAttack(t1);
		w1.doubleAttack(t1);
		w1.huntMonster(t1);
		w1.huntMonster(t1);
	}

}
