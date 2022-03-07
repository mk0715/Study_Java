package day07.ClassTest;

public class Main {

	public static void main(String[] args) {
		// Cat, Dog를 두개 씩 만들어서 정보를 저장하고
		// 저장된 정보를 콘솔에 출력해주세요.
		// 단 저장된 정보는 메서드를 활용합니다.
		
		Cat a = new Cat();
		a.name = "Abc";
		a.age = 4;
		a.color = "black";
		a.sort = "russian blue";
		a.cnum = 101;
		
		Cat b = new Cat();
		b.name = "Bkwl";
		b.age = 5;
		b.color = "white";
		b.sort = "Persian";
		b.cnum = 102;
		
		Dog c = new Dog();
		c.name = "Ceij";
		c.age = 10;
		c.add = 10384;
		c.size = "large";
		c.dnum = 201;
		
		Dog d = new Dog();
		d.name = "Dwlzk";
		d.age = 2;
		d.add = 18387;
		d.size = "small";
		d.dnum = 204;
		
		a.cgetInfo();
		System.out.println("---------------");
		b.cgetInfo();
		System.out.println("---------------");
		c.dgetInfo();
		System.out.println("---------------");
		d.dgetInfo();

	}

}
