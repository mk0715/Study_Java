package day08.inheri01;

// Student는 Person의 정보를 확장합니다. 따라서 Person을 상속 받는다는
// 표시로 extends 부모클래스명을 적어줍니다.
public class Student extends Person {
	// 공통속성(이름, 나이)이 아닌 학생만의 개별속성만 정의
	public String major;
	
	// 학생의 자기소개
	public void getStudentInfo() {
		// 상속받은 자식은 부모쪽의 요소를 전부 가져다 쓸 수 있다.
		getPersonInfo();
		System.out.println("전공은 " + major + "입니다.");
	}

}
