package ch18;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderEx2 {

	public static void main(String[] args) {
		int var = 0;
		//new InputStreamReader나 마찬가지
		Reader input = new InputStreamReader(System.in);
		System.out.println("입력하세요 : ");
		try {
			while(true) {
				var = input.read(); //1문자를 읽어드림
				if(var == 13) break;
				System.out.println(var + " ==> " + (char)var);
			}
			
			
			
		} catch (IOException e) {
		}
		
		
		
		
		
		
		
		
	}
}
