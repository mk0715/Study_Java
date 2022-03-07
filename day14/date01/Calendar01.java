package day14.date01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendar01 {
	public static void main(String[] args) {
		// Date에 비해 Calendar을 쓰면 날짜계산이 좀 더 편합니다.
		Calendar cal = Calendar.getInstance();
		// import는 전부 java.util로 해주세요.
		cal.setTime(new Date());
		// 날짜표시를 연도 - 월 - 일자로 표시하기 위한 세팅
		// import는 java.text로 해주세요.
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		// 현재 시간을 연도-월-일 양식으로 표시
		System.out.println(df.format(cal.getTime()));
		
		// 오늘 날짜에서 90일 뒤의 날짜 구하기
		cal.add(Calendar.DATE, 90); // calendar.xxxx 를 넣는거에 따라 단위가 바뀜.
		System.out.println(df.format(cal.getTime()));
	}

}
