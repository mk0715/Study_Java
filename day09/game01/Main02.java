package day09.game01;

public class Main02 {

	public static void main(String[] args) {
		// Warrior타입 변수로 getInfo()를 호출할 경우
		// Novice의 getInfo()는 무시됩니다.
		Warrior w1 = new Warrior();
		w1.id = "전사1";
		w1.level = 5;
		w1.hp = 100;
		w1.mp = 20;
		w1.exp = 35;
		w1.pdam = 10;
		w1.getInfo();

	}

}
