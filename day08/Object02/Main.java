package day08.Object02;

import java.util.Scanner;

import day08.Object01.BasketballPlayer;

public class Main {

	public static void main(String[] args) {
		BasketballPlayer b1 = new BasketballPlayer("A", 180, 98); // 빨간줄에 마우스 갖다대면 Import기능이 나옴.
		Scanner scan = new Scanner(System.in);
		
		b1.getInfo();
		b1.shoot();
		b1.dunkShoot();
		b1.getPoint();

	}

}
