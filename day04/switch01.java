package day04;

public class switch01 {

	public static void main(String[] args) {
		// switch ~ case 구문은 변수에 들어있는 자료가 case문에 제시된
		// 자료와 일치하는지 여부로 논리식을 실행합니다.
		// switch(변수){
		// case 값1:
		//		실행문;
		// case 값2...
		// }
		// 와 같이 작성합니다.
		// 마지막에 default 문을 작성시 if ~ else문의 else처럼 기능합니다.
		
		int a = 5;
		switch(a) { // switch문은 해당되는 구문에 가서 밑에꺼 까지 전부출력하기 때문에
		case 1:
			System.out.println("one");
			break; // 각 케이스 종료시마다 작성해야 코드가 줄줄이 실행되지 않음.
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		default:  // default는 넣어도 되고 안넣어도 되는데 else처럼 전부다 아닐경우 출력.
			System.out.println("??????");
			break; // default구문에는 break필요없는데 코드 일관성을 위해서 넣는 경우 존재.
		}
	}

}
