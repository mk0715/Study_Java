package day09.game01;

public class Novice {
	// 레벨, 체력, 아이디, 마나 수치를 변수로 만들어주세요.
	public int level;
	public int hp;
	public String id;
	public int mp;
	public int exp;
	
	// 메서드는 getInfo() 로, 콘솔에 변수 현황을 보여주는 메서드를 만들어주세요.
	public void getInfo() {
		System.out.println("아이디 : " + id);
		System.out.println("레벨 : " + level);
		System.out.println("경험치 : " + exp);
		System.out.println("체력 : " + hp);
		System.out.println("마나 : " + mp);
	}

}
