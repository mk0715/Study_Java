package day10.access02;

public class Main02 {
	public static void main(String[] args) {
		// 다른 패키지에서 상속받은 child02를 확인해보겠습니다.
		Child02 c = new Child02();
		
		// 1. public 접근
		System.out.println(c.a);
		// 2. protected 접근
		// protected는 같은 패키지, 혹은 다른 패키지면 상속관계일 때 접근가능.
		//System.out.println(c.b);
		//c.b = 3;
		c.setB(100);
		c.getB();
		
		// 3. default(상속관계, 패키지만 다름) // package friendly는 패키지가 다르면 상속관계여도 불가능.
		//System.out.println(c.d);
	}

}
