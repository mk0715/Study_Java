package day09.game01;

public class Main {

	public static void main(String[] args) {
		// 초보자 생성 및 확인
		Novice n1 = new Novice();
		n1.id = "초보자1";
		n1.level = 1;
		n1.hp = 20;
		n1.mp = 5;
		n1.exp = 10;
		n1.getInfo();

	}

}
