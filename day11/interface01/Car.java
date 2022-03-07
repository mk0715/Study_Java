package day11.interface01;

// 인터페이스를 구현(상속이 아님!)하기 위해서는 implements 키워드를 쓴다.
// extends가 아님에 주의해주세요.
// 인터페이스 내부의 추상 메서드를 구현하기 위한 조치를 취해야 한다.

public class Car implements Vehicle {
	// 자동차가 가져야 하는 변수들 설정하기.
	// 현재속도, 현재연료량, 차주
	private int speed;
	private int fuel;
	private String user;
	
	public Car(String user) {
		this.speed = 0;
		this.fuel = 100;
		this.user = user;
	}
	
	public void Accel() {
		// 한 번 가속시 속도가 10씩 늘어나게 해 주세요.
		// 연료는 한 번 가속에 1씩 소비합니다.
		// 단 속도는 200km/h를 초과할 수 없습니다.
		if(speed+10>=200) {
			speed = 200;
		}else {
			speed += 10;
			fuel -= 1;
		}
		
	}
	
	public void Break() {
		// 한 번 감속시 속도가 10씩 줄어들게 해주세요.
		// 단 속도는 0km/h미만이 될 수 없습니다.
		if(speed-10<=0) {
			speed = 0;
		}else {
			speed -= 10;
		}
		
	}
	
	public void refuel() {
		// 연료를 다시 채울경우 30씩 채워집니다.
		// 단, 연료 최대값은 Vehicle.MAXGAS를 이용해 제한해주세요.
		if(fuel+30>=MAXGAS) {
			fuel = MAXGAS;
		}else {
			fuel += 30;
		}
	}
	public void getStatus() {
		System.out.println("현재 속도 : " + speed);
		System.out.println("현재 연료 : " + fuel);
		System.out.println("현재 사용자 : " + user);
		System.out.println("--------------------");
	}

}
