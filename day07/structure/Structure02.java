package day07.structure;

public class Structure02 {
	// Person 내부의 정보를 쉽게 조회하기 위한 메서드 제작
	public static void getInfo(Person p) {
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.pnum);
	}
	
	public static void main(String[] args) {
		Person a = new Person();
		a.name = "MK";
		a.age = 20;
		a.pnum = "010-2341-4325";
		
		Person b = new Person();
		b.name = "djk";
		b.age = 14;
		b.pnum = "010-3452-5632";
		
		getInfo(a);
		getInfo(b);
		
	}
	

}
