package day13.exception03;

public class Throws01 {
	
	public static void doIt(String[] s,int i) //throws
	{//ArrayIndexOutOfBoundsException{  // 최근버전에서는 throws랑 Array..를 안써도 실행가능.
		System.out.println(s[i]);
	}
	
	public static void main(String[] args) {
		String[] greetings = {"안녕", "hi", "니하오", "신짜오"};
		
		int i = (int)(Math.random() * 5); // 정수 0, 1, 2, 3, 4 중 
										  // 랜덤하게 발생
		
		try {
			doIt(greetings, i);
			
		} catch(Exception e) {
			System.out.println("main 지역에서 처리했습니다.");
		}
	}

}
