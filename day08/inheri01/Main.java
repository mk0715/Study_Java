package day08.inheri01;

public class Main {

	public static void main(String[] args) {
		// Student가 Person을 상속했기 때문에
		// Student는 Person의 자원을 사용할 수 있습니다.
		Student s1 = new Student();
		s1.name = "MK";
		s1.age = 20;
		s1.major = "컴퓨터공학";
		
		
		s1.getPersonInfo();
		s1.getStudentInfo();

		
	}

}
