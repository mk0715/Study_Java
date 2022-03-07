package day10.access01;

public class Parent {
	public int a;
	protected int b;
	private int c;
	// default 혹은 package friendly
	// 같은 패키지 내부에서만 접근 가능, protected와 private의 중간 강도
	int d;
	
	public Parent() {
		this.a = 1;
		this.b = 2;
		this.c = 3;
	}

}
