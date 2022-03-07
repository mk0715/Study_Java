package day08.inheri01;

public class Main02 {
	public static void main(String[] args) {
		
		Traveler t1 = new Traveler();
		t1.name = "MK";
		t1.age = 24;
		t1.country = "Republic of Korea";
		t1.countrynum = 82;
		
		t1.getPersonInfo();
		System.out.println("----------------");
		// t1.getStudentInfo(); 이거는 Traveler가 Person을 상속받은것이지 Student를 상속받은것이 아니므로 실행되지않음.
		t1.gettravelInfo();
	}

}
