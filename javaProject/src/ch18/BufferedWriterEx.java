package ch18;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class BufferedWriterEx {

	public static void main(String[] args) {
		PrintStream ps = System.out;
		OutputStream os = ps;
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//이렇게 한줄로도 가능
		 try {
			bw.write("환영합니다.\n");
			bw.write("Java");
			bw.newLine(); //개행처리를 해주는 메소드
			bw.write("World!");
			bw.flush(); //버퍼에 남아 있는 모든 바이트를 출력
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
