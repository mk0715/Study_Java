package day05;

public class enhancedFor02 {

	public static void main(String[] args) {
		// 다음은 학생들의 과목별 성적입니다.
		// math = 96, 23, 52, 82, 72, 31, 58
		// eng = 62, 42, 68, 31, 80, 77, 45
		// com = 10, 28, 39, 74, 65, 90, 98
		// 위 3개의 명칭으로 array를 만들어 담아주신 다음
		// 과목별 평균점수를 enhanced for문을 이용해 구한 다음
		// 콘솔창에 출력해주세요.
		
		int math[] = {96, 23, 52, 82, 72, 31, 58};
		int eng[] = {62, 42, 68, 31, 80, 77, 45};
		int com[] = {10, 28, 39, 74, 65, 90, 98};
		
		int total1 = 0;
		
		for(int score1 : math) {
			total1 += score1;
			}
		System.out.println("수학평균 : "+ total1/math.length);
		
		int total2 = 0;
		
		for(int score2 : eng) {
			total2 += score2;
			}
		System.out.println("영어평균 : "+ total2/eng.length);
		
		int total3 = 0;
		
		for(int score3 : com) {
			total3 += score3;
			}
		System.out.println("컴퓨터평균 : "+ total3/com.length);
			
		}

	}

