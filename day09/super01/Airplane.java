package day09.super01;

public class Airplane {
	// 비행기는 속도를 가집니다.
	public int speed;
	
	// 생성자는 속도를 0으로 맞춰줍니다.
	public Airplane(int speed) {
		this.speed = speed;
		
	}

	// fly() 메서드를 수행하면 속도가 500씩 붙습니다.
	// 단, 일반 비행기는 속도가 900 이상이 될 수 없습니다.
	public void fly() {
		if(speed + 500 >= 900) {
			speed = 900;
		}else {
			speed += 500;
		}
		System.out.println("시속 " + speed + "km/h로 비행중입니다.");
	}
	
	// break() 메서드를 수행하면 속도가 100씩 감속합니다.
	// 단, 브레이크 연산은 속도를 0 밑으로 내려주지 않습니다.
	public void speedbreak() {
		if(speed-100<=0) {
			speed = 0;
		}else {
			speed -= 100;
		}
		System.out.println("현재 시속은 " + speed + "km/h 입니다.");
	}
}
