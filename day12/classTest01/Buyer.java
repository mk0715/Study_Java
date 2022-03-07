package day12.classTest01;

public class Buyer {
	// 사과개수, 보유금액
	public int buyernumber;
	public int money;
	
	
	// 사과 구매 메서드를 호출하면, 파라미터로 셀러 타입을 입력받습니다.
	// 셀러의 사과판매 메서드를 호출한 다음, 결과물로 나오는 사과갯수를
	// 자기 자신의 사과갯수에 추가하고, 보유 금액은 셀러에게 사과를 구매한
	// 금액만큼 차감됩니다.
	public Buyer(int money) {
		this.buyernumber = 0;
		this.money = money;
		System.out.println(this.money + "원을 가진 구매자 생성완료.");
	}
	
	public void Buy(AppleSeller appleseller, int money) {
		int result = appleseller.Sell(money);
		this.buyernumber += result;
		this.money -= money;
		
	}


	// 상태조회 메서드를 호출하면
	// 현재 바이어가 가진 사과개수와 보유금액을 콘솔창에 출력해줍니다.
	public void bgetInfo() {
		System.out.println("가진 사과 개수 : " + buyernumber);
		System.out.println("보유금액 : " + money);
	}

}
