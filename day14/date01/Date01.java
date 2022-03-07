package day14.date01;

import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		// Date는 자바 내부에서 날짜를 다루기 위해 필요한 클래스입니다.
		// 한달이 무조건 30일이 아니고 28 ~ 31까지 경우에 따라 날짜수가
		// 배정되기 때문에 이 클래스를 써야 날짜를 복잡한 계산 없이도
		// 출력할 수 있습니다.
		// Date는 java.util에 있는것으로 import해야 사용할 수 있습니다.
		Date now = new Date();
		System.out.println(now);
		// 오늘 날짜
		System.out.println(now.getDate());
		// 오늘 요일(0 일요일 1 월요일 ~ 6 토요일)
		System.out.println(now.getDay());
		// 오늘 월(0 1월 1 2월 ~ 11 12월)
		System.out.println(now.getMonth());
		// 오늘 년도(100이 2000년)
		System.out.println(now.getYear());
		

	}

}
