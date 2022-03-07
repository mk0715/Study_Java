package day11.abstract01;

public class Main {

	public static void main(String[] args) {
		// new Parent 생성 불가
		//Parent p1 = new Parent();
		
		// 단, Parent를 상속받고, getA() 메서드를 구체화시킨
		// Child 타입으로는 객체 생성 및 사용 가능
		Child c = new Child();
		c.getA();

	}

}
