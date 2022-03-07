package day14.stringbuilder01;

public class Builder02 {

	public static void main(String[] args) {
		// setCharAt()은 문자열에서 입력한 인덱스번호의 문자를
		// 다른 문자로 교체해줍니다.
		// insert()는 뒤로 밀어내 공간을 확보했지만 setCharAt()은
		// 그냥 덮어씌워버립니다.
		// 단, setCharAt()은 한 글자만 교체할 수 있습니다.
		StringBuilder str = new StringBuilder("abcdefg");
		// setCharAt()으로 변경하는 단일 문자는 홀따옴표 ' 로 여닫는 부분을
		// 작성해야 합니다.
		str.setCharAt(5, 'z');
		System.out.println(str);

	}

}
