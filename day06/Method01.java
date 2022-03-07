package day06;

public class Method01 {
	// method는 자주 사용할 코드를 특정한 이름으로 붙여둔것입니다.
	// method 내부에는 불완전한 코드가 들어옵니다.
	// method는 이 불완전한 코드를 완성시키기 위한 자료를 요청할 수 있습니다.
	// method는 실행 결과물을 약속해야 사용할 수 있고, 실행결과물이
	// 있다면 return문을 이용해 약속된 실행결과물을 호출 위치로 보내줍니다.
	// method는 main 바깥에 작성합니다.
	
	public static void add(int a) { // method를 만들어도 굳이 실행할 필요는없음.
		// void는 결과물 없음을 의미함. System.out.println();에서 이미 출력하도록 지정되었음.
		// add라는 이름을 main메서드 내부 영역에서 호출해야 실행될 코드.
		// int a 자료를 호출시에 제공해야 내부 문장을 실행할 수 있다.
		System.out.println(a + 1); 
	}
	public static void main(String[] args) {
		add(500); // System.out.println(); 굳이 안써도 위에서 이미 출력하도록 지정댐.
	}

}
