package day07.ClassTest;

public class Cat {
	// 고양이를 나타내는 정보 5개를 저장해주세요.
	
	public String name;
	public int age;
	public String color;
	public String sort;
	public int cnum;
	
	// 고양이 5개 정보를 콘솔에 출력해주는 메서드를 만들어주세요.
	
	public void cgetInfo() {
		System.out.println("고양이 이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("색상 : " + color);
		System.out.println("종류 : " + sort);
		System.out.println("고양이 번호 : " + cnum);
	}

}
