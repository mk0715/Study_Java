package day06;

public class Continue03 {
	public static void main(String[] args) {
		// 다음은 학생들의 과목별 성적입니다.
		// math = 96, 23, 52, 82, 72, 31, 58
		// eng = 62, 42, 68, 31, 80, 77, 45
		// com = 10, 28, 39, 74, 65, 90, 98
		// 각 과목별 평균점수를 내주시되, 합격자 평균만 내주세요.
		// 합격점수는 60점 이상입니다.
		int math[] = {96, 23, 52, 82, 72, 31, 58};
		int eng[] = {62, 42, 68, 31, 80, 77, 45};
		int com[] = {10, 28, 39, 74, 65, 90, 98};
		
		int total1 = 0;
		int a = 0;
		
		for(int score1 : math) {
			if(score1<60) {
				continue;
			}
			total1 += score1;
			a += 1;
		}
		System.out.println("수학합격자 평균 : "+ total1/a);
		
		int total2 = 0;
		int b = 0;
		
		for(int score2 : eng) {
			if(score2<60) {
				continue;
			}
			total2 += score2;
			b += 1;
		}
		System.out.println("영어합격자 평균 : "+ total2/b);
		
		int total3 = 0;
		int c = 0;
		
		for(int score3 : com) {
			if(score3<60) {
				continue;
			}
			total3 += score3;
			c += 1;
		}
		System.out.println("컴퓨터합격자 평균 : "+ total3/c);
		
	}

}
