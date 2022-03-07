package day11.interface01;

// 인터페이스는 interface 선언을 사용합니다.
// 내부에는 상수 변수, 추상 메서드만을 선언할 수 있습니다.
// 애초에 구현(implements)을 전제로 설계되기 때문에
// 일반 변수, 메서드를 선언할 수 없습니다.
public interface Vehicle {
	// 최대 연료량
	int MAXGAS = 100;
	
	// 탈것이라면 가질 공통적 기능을 전부 추상메서드로 작성
	public void Accel(); // 가속
	public void Break(); // 감속
	public void refuel(); // 주유
	public void getStatus(); // 계기판 조회

}
