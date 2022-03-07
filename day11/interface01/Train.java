package day11.interface01;

// implements 키워드 활용 (클래스에서 인터페이스 구현)
public class Train implements Vehicle {
	private int speed;
	private int fuel;
	private String user;
	private int tmaxfuel = 300;
	
	public Train(String user) {
		this.speed = 0;
		this.fuel = 300;
		this.user = user;
	}
	
	public void Accel() {  // implements 쓴다음에 커서 갖다대서 add unimplemented methods 선택하면 나옴.
		if(speed+30>=300) {
			speed = 300;
		}else {
			speed += 30;
			fuel -= 20;
		}
		
	}
	
	public void Break() {
		if(speed-15<=0) {
			speed = 0;
		}else {
			speed -= 15;
		}
		
	}
	
	public void refuel() {
		if(fuel+100>=tmaxfuel) {
			fuel = tmaxfuel;
		}else {
			fuel += 100;
		}
	}
	public void getStatus() {
		System.out.println("현재 속도 : " + speed);
		System.out.println("현재 연료 : " + fuel);
		System.out.println("현재 사용자 : " + user);
		System.out.println("--------------------");
	}

}
