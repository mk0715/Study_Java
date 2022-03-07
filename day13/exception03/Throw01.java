package day13.exception03;

public class Throw01 {

	public static void main(String[] args) {
		// throw는 예외상황이 아니지만 예외를 강제로 발생시킵니다.
		int i = (int)(Math.random() * 10);
		
		try {
			if(i>3) {
				throw new ArrayIndexOutOfBoundsException(); // 새로운 예외 만들기
			}else {
				System.out.println("정상 범위 난수 발생");
			}
		}catch(Exception e) {
			System.out.println("없는 예외를 만들었습니다.");
			e.printStackTrace(); // 경고문 발생 시키기
		}finally {
			System.out.println("코드는 여기서 멈춥니다.");
		}

	}

}
