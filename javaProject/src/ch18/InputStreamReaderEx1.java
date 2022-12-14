package ch18;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderEx1 {
	//InputStream : 1바이트 단위로 읽음
	//InputStramReader : 문자 단위(2byte)로 읽음
	
	public static void main(String[] args) {
		InputStream is = System.in;
		
		//new ~Reader(Stream)
		InputStreamReader isr = new InputStreamReader(is); //2byte
		System.out.println("한글자만 입력해라잉 : ");
		try {
			int code = isr.read();
			System.out.println("code : " + code);
			char ch = (char) code;
			System.out.println("char : " + ch);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //글자의 코드값
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
