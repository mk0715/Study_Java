package day15.io01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileIO02 {
	public static void main(String[] args) throws IOException {
		// 외부 파일을 읽어올때는 BufferedReader자료형을 사용합니다.
		BufferedReader input = new BufferedReader(new FileReader("G:/test2.txt"));
		
		System.out.println(input);
		while(true) {
			String line = input.readLine();
			if(line == null) {
				break;
			}
			System.out.println(line);
		}
		
	}

}
