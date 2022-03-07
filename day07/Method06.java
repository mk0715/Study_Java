package day07;

import java.util.Scanner;

public class Method06 {
	// 메서드를 만들어주세요.
	// 메서드의 이름은 getBmi 입니다.
	// double cm, double kg을 실수로 입력받으며
	// 입력받은 키, 체중을 토대로 bmi지수를 결과로 리턴해줍니다.
	// bmi공식은 (체중) / (신장(m))^2
	// 신장은 입력시는 cm(ex, 174.5)로 받고, 계산시는 m(1.745)로 합니다.
	
	public static double getBmi(double i, double j){
		return j / Math.pow(i/100, 2);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("키 : ");
		double height = scan.nextDouble();
		System.out.println("체중 : ");
		double weight = scan.nextDouble();
		
				
		double result = getBmi(height, weight);
		System.out.println("bmi 지수 : " + result );
		
		

	}

}
