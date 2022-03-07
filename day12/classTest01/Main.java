package day12.classTest01;

public class Main {

	public static void main(String[] args) {
		Buyer b1 = new Buyer(10000);
		AppleSeller s1 = new AppleSeller();
		
		b1.bgetInfo();
		System.out.println();
		s1.sgetInfo();
		b1.Buy(s1, 3000);
		System.out.println();
		b1.bgetInfo();
		System.out.println();
		s1.sgetInfo();
		
		


	}

}
