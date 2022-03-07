package day07.ClassTest;

public class Dog {
	// 강아지를 나타내는 정보 5개를 저장해주세요.
	
	public String name;
	public int age;
	public int add;
	public String size;
	public int dnum;
	
	// 강아지 5개 정보를 콘솔에 출력해주는 메서드를 만들어주세요.
	
	public void dgetInfo() {
		System.out.println("강아지 이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("우편번호 : " + add);
		System.out.println("크기 : " + size);
		System.out.println("강아지 번호 : " + dnum);
	}

}
