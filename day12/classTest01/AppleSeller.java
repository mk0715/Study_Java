package day12.classTest01;

public class AppleSeller {
	// 정보로 매출, 사과개수, 사과가격(상수)를 가집니다.
	public int sales;
	public int sellernumber;
	public static final int Price = 1000;
	
	// 사과 판매 메서드를 만들어주세요.
	// 이 메서드는 바이어의 금액을 입력받으면
	// 입력받은 금액 / 사과가격 을 통해 사과갯수를 산출합니다.
	// 계산된 사과개수를 차감합니다.
	// 입력받은 금액만큼 매출을 증가시킵니다.
	// return문을 이용해 얻어낸 사과갯수를 호출한 위치에 돌려줍니다.
	public AppleSeller() {
		this.sales = 0;
		this.sellernumber = 20;
	}
	
	public int Sell(int money) {
		int applenumber = money/Price;
		this.sellernumber -= applenumber;
		this.sales += money;
		return applenumber;
	}
	

	// 사과 장수의 상태 조회 메서드를 만들어주세요.
	// 콘솔창에 매출, 남은 사과개수, 설정된 사과가격을 보여줍니다.
	public void sgetInfo() {
		System.out.println("매출 : " + sales);
		System.out.println("남은 사과 개수 : " + sellernumber);
		System.out.println("사과 1개당 가격 : " + Price);
	}
	
}
