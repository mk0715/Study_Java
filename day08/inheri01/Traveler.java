package day08.inheri01;

public class Traveler extends Person {
	public String country;
	public int countrynum;
	
	public void gettravelInfo() {
		getPersonInfo();
		System.out.println("출신 국가는 " + country + "입니다.");
		System.out.println("국가 번호는 " + countrynum + "입니다.");
	}

}
