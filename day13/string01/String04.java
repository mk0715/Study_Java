package day13.string01;

public class String04 {
	public static void main(String[] args) {
		// length()는 문자열의 길이를 알 수 있습니다.
		// 정수로 몇 글자인지 알려줍니다.
		String name = "김수한무 거북이와 두루미 삼천갑자 동방삭 치치카포 사리사리센타";
		System.out.println(name.length());
		
		String report = "안녕하세요. 리포트 보고자는 김영수 입니다.";
		report = report.replace("김영수", "MK");
		System.out.println(report);
	}

}
