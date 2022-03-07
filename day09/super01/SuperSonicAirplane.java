package day09.super01;

public class SuperSonicAirplane extends Airplane {
	// 초음속 비행기도 마찬가지로 속도를 사용합니다.
	// 따라서 변수는 추가로 정의하지 않습니다.
	
	public SuperSonicAirplane(int speed) { // () 안에 int speed를 받아서
		// Airplane의 생성자는 상속되지 않습니다.
		// 따라서 부모쪽의 생성자라는 의미로
		// super(); 를 사용하며, 이때 부모쪽에 넘겨줄 speed도
		// 함께 받아서 처리해줍니다.
		super(speed); // super()안에 넣어줌.
	}
	
	public void fly() {
		// 속도 900 이하인 경우 일반 비행 모드 호출
		if(speed + 500 <= 900) {
			super.fly(); // Airplane에 있는 fly() 호출위해 super사용.
		}else {
			// 속도 900 이상 1300 이하인 경우 초음속 비행으로 호출
			if(speed + 300 >= 1300) {
				speed = 1300;
			}else {
				speed += 300;
			}
			System.out.println("초음속 비행 속도 : " + speed + "km/h");
		}
		
	}

}
