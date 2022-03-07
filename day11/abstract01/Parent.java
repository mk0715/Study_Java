package day11.abstract01;

// 추상 클래스, abstract 선언이 붙은 클래스는 직접 객체 생성이 불가능하다.
public abstract class Parent {
	public int a;
	
	public Parent() {
		this.a = 5;
	}
	// 추상메서드, 아래와 같이 실행문 없이 작성한다.
	public abstract void getA();
}
