package ch18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx2 {

	public static void main(String[] args) {
		//Buffered계열(Reader계열(Stream)) 형태로 구성
		
		//new BufferedReader(new Reader객체(System.in));
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("문자열 한줄만 입력해라잉? : ");
		try {
			String str = reader.readLine(); //한 라인을 읽어드림
			System.out.println(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("[프로그램 종료]");
		
		
		
	}
}