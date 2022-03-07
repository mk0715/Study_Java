package day08.Object01;

public class Main {

	public static void main(String[] args) {
		// 여기에 BasketballPlayer변수를 선언해서 조작해주세요.
		BasketballPlayer b1 = new BasketballPlayer("A",189,98);
		BasketballPlayer b2 = new BasketballPlayer("B",192,104);
		BasketballPlayer b3 = new BasketballPlayer("C",204,99);
		
		b1.shoot();
		b1.shoot();
		b1.dunkShoot();
		b1.getPoint();
		
		b2.dunkShoot();
		b2.shoot();
		b2.dunkShoot();
		b2.getPoint();
		
		b3.dunkShoot();
		b3.shoot();
		b3.dunkShoot();
		b3.getPoint();
	}

}
