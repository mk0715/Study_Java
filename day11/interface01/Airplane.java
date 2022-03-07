package day11.interface01;

public class Airplane implements Vehicle {
	private int speed;
	private int fuel;
	private String user;
	private int amaxfuel = 1000;
	
	public Airplane(String user) {
		this.speed = 0;
		this.fuel = 1000;
		this.user = user;
	}
	
	public void Accel() {
		if(speed+100>=900) {
			speed = 900;
		}else {
			speed += 100;
			fuel -= 50;
		}
		
	}
	
	public void Break() {
		if(speed-50<=0) {
			speed = 0;
		}else {
			speed -= 50;
		}
		
	}
	
	public void refuel() {
		if(fuel+250>=amaxfuel) {
			fuel = amaxfuel;
		}else {
			fuel += 250;
		}
	}
	public void getStatus() {
		System.out.println("현재 속도 : " + speed);
		System.out.println("현재 연료 : " + fuel);
		System.out.println("현재 사용자 : " + user);
		System.out.println("--------------------");
	}

}

