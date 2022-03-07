package day07.ConstructorTest;

public class Main02 {

	public static void main(String[] args) {
		// 자동차 생성(생성자 요구자료 입력 X시 에러)
		//Car c1 = new Car();
		Car c1 = new Car(10, 100, "MK");
		
		// 자동차 정보 조회
		c1.getInfo();
		
		// 자동차 감속
		c1.breakSpeed();
		c1.breakSpeed();

	}

}
