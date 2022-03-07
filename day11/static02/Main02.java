package day11.static02;

public class Main02 {

	public static void main(String[] args) {
		
		Asean a1 = new Asean(20,20,10);
		Asean a2 = new Asean(10,10,5);
		Asean a3 = new Asean(15,15,9);
		Asean a4 = new Asean(12,13,7);
		
		// Asean 조원 없이도 Asean 조별점수는 조회가능
		//System.out.println(Asean.teamproject);
		Asean.getInfo();
		System.out.println();
		a1.getAseanInfo();
		System.out.println();
		a2.getAseanInfo();
		System.out.println();
		a3.getAseanInfo();
		System.out.println();
		a4.getAseanInfo();
	}
	
	

}
