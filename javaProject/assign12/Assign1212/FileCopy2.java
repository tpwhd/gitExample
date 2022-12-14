package Assign1212;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStream;

public class FileCopy2 {

	//프로그램 ==> 파일(출력스트림이 필요)
	public static void main(String[] args) {
		String str = "";
		BufferedReader reader = null;
		BufferedWriter writer = null;
		String file1 = "C:\\test\\abc.txt"; //원본파일
		String file2 = "C:\\test\\abcCopy'.txt"; //복사본

		OutputStream os=null;
		try {
			os = new FileOutputStream("C:\\test\\abc.txt");
			System.out.println("입력하세요 : ");
			while (true) {
				int ch=System.in.read();//1byte 읽음
				if(ch==13) break;
				os.write(ch);//파일에 1바이트 저장
			}
			reader = new BufferedReader(new FileReader(new File(file1)));
			writer = new BufferedWriter(new FileWriter(new File(file2)));
			while (true) {
				str = reader.readLine(); //한 라인을 읽음 
				if(str == null) break; //내용이 없으면 종료
				//파일을 기록할 때도 \r\n을 써주어야함.
				// \r carriage return(캐리지 리턴
				// \n new line(줄바꿈)
				writer.write(str + "\r\n");
			}
			System.out.println("파일복사가 완료 되었습니다.");
			System.out.println("저장되었습니다.");
		} catch (Exception e) {
			System.out.println("파일저장이 실패했습니다.");
			e.printStackTrace();
		}
			finally {
				try {
					if(reader != null) reader.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				try {
					if(writer != null) reader.close();
				} catch (Exception e2) {
					e2.printStackTrace();

				}
			}
	}
}
		


