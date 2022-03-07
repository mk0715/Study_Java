package day11.final01;

public class Main {

	public static void main(String[] args) {
		// final 변수를 사용하기 위한 Country 객체 생성
		//Country country = new Country();
		// Country 객체 생성 없이 사용하는 방법 : static선언 추가로 하기
		System.out.println(Country.KOREA);
		// final로 정의되었기 때문에 수정 불가
		//country.KOREA = 50;
		System.out.println(Country.CHINA);
		System.out.println(Country.STATES);
		System.out.println(Country.CANADA);
		

	}

}
