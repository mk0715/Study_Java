package day09.game01;

public class Main03 {
	public static void main(String[] args) {
		Magician m1 = new Magician();
		m1.id = "마법사1";
		m1.level = 6;
		m1.hp = 80;
		m1.mp = 40;
		m1.exp = 20;
		m1.mdam = 25;
		m1.attack();
		m1.getInfo();
		
		Healer h1 = new Healer();
		h1.id = "힐러1";
		h1.level = 12;
		h1.hp = 150;
		h1.mp = 100;
		h1.exp = 132;
		h1.heal = 50;
		h1.getInfo();
	}

}
