package day07.structure;

public class Structure01 {
	// 구조체는 클래스의 원시적인 형태입니다.
	// 구조체는 묶어서 호출해야 하는 자료들을 모아서 저장할 수 있도록 돕습니다.
	
	public static void main(String[] args) {
		Person a = new Person();
		a.name = "MK";
		a.age = 24;
		a.pnum = "010-1231-1234";
		
		Person b = new Person();
		b.name = "SMK";
		b.age = 24;
		b.pnum = "010-5037-9050";
		
		System.out.println(a);
		System.out.println(a.name);
		System.out.println(a.age);
		System.out.println(a.pnum);
		
		System.out.println(b);
		System.out.println(b.name);
		System.out.println(b.age);
		System.out.println(b.pnum);
		
		// 구조체의 문제점
		Person c = new Person();
		System.out.println(c.name);
		System.out.println(c.age);
		System.out.println(c.pnum);
				
		
	}

}
