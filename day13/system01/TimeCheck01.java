package day13.system01;

public class TimeCheck01 {
	public static void main(String[] args) {
		// 시작 시점
		Long start= System.currentTimeMillis();
		System.out.println(start);
		long all = 0;
		
		for(int i = 0; i<1000000000; i++) {
			all += i;
		}
		// 끝나는 시점
		Long end = System.currentTimeMillis();
		System.out.println(end);
		// 소요 시간 측정
		System.out.println(end - start);
	}
	
}
