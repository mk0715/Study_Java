package day15.io01;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO01 {

	public static void main(String[] args) throws IOException {
		// 외부에 텍스트파일을 만들기 위해서 FileOutputStream을 사용합니다.
		// 변수를 만들고 거기에 파일 경로를 적습니다.
		// main메서드에 반드시 throws IOException을 작성해야 합니다.
		//FileOutputStream output = new FileOutputStream("G:/test.txt");
		
		// 단 좀더 간편하게 사용하기 위해서 FileWriter로 대체할 수 있다.
		FileWriter output = new FileWriter("G:/test2.txt");
		
		// 줄바꿈이 자동으로 안 되기 때문에 \n을 붙이면 됩니다.
		output.write("쓰고싶은 내용 작성\n");
		output.write("한줄더 작성합니다.");
		output.close();

	}

}
