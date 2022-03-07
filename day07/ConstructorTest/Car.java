package day07.ConstructorTest;

public class Car {
	// 자동차 속성(변수) 만들기.
	public int fuel;
	public int speed;
	public String owner;
	
	// 자동차 생성자(new 키워드로 자동차 생성시 실행될 메서드)
	// return 자료형은 설정할 수 없음.
	// 생성시 자동으로 호출되기 때문에 무시하고 넘어갈 수 없음.
	public Car(int f, int s, String o) {
		fuel = f;
		speed = s;
		owner = o;
	}
	
	// 자동차 동작 추가하기
	public void getInfo() {
		System.out.println("현재 연료량 : " + fuel);
		System.out.println("현재 속도 : " + speed);
		System.out.println("현재 주인 : " + owner);
	}
	
	public void breakSpeed() {
		System.out.println("속도를 감속합니다.");
		speed -= 2;
		System.out.println("감속 후 속도는 " + speed + "km/h 입니다.");
	}
}
