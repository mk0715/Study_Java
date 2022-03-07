package day14.math01;

public class Math06 {
	public static void main(String[] args) {
		// 가위바위보 게임을 만들어주세요.
		// Math.random()을 이용해 1/3의 확률로 가위 바위 보를 부여받으며
		// 가위 > 보, 바위 > 가위, 보 > 바위의 상성을 가집니다.
		// 같은 요소가 나오면 무승부입니다.
		
		int myValue = (int)(Math.random() * 3);
		
		int comValue = (int)(Math.random() * 3);
		
		// 0 가위 1 바위 2 보
		
		// int result = myValue - comValue; 를 써서 result = -2, result = 1 & myvalue = 1, result = 1 & myvalue = 2 이런식으로
		// 여러가지 상황을 나누어 짤 수도 있음.
		
		if(myValue == 0 & comValue == 0) {
			System.out.println("둘다 가위를 내서 무승부입니다.");
			
		}else if(myValue == 0 & comValue == 1) {
			System.out.println("바위를 내서 컴퓨터가 이겼습니다.");
		}else if(myValue == 0 & comValue == 2){
			System.out.println("가위를 내서 당신이 이겼습니다.");
		}
		
		if(myValue == 1 & comValue == 1) {
			System.out.println("둘다 바위를 내서 무승부입니다.");
			
		}else if(myValue == 1 & comValue == 2) {
			System.out.println("보를 내서 컴퓨터가 이겼습니다.");
		}else if(myValue == 1 & comValue == 0){
			System.out.println("바위를 내서 당신이 이겼습니다.");
		}
		
		if(myValue == 2 & comValue == 2) {
			System.out.println("둘다 보를 내서 무승부입니다.");
			
		}else if(myValue == 2 & comValue == 0) {
			System.out.println("가위를 내서 컴퓨터가 이겼습니다.");
		}else if(myValue == 2 & comValue == 1){
			System.out.println("보를 내서 당신이 이겼습니다.");
		}
	}

}
