package ch18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

//Stream : 데이터의 논리적인 통로, 바이트 단위
//프로그램 ==> 외부자원 : 출력스트림
//프로그램 <== 외부자원 : 입력스트림
public class MemberUse {

	public static void main(String[] args) {
		FileOutputStream fos = null; //파일저장
		ObjectOutput oos = null; //메모리에 있는 객체를 파일로 저장
		MemberDTO m1 = new MemberDTO("kim", "김길동", "1234", 30, "kim@gmail.com");
		
		try {
			fos = new FileOutputStream("C:\\test\\object.dat");
			//직렬화(s
			oos = new ObjectOutputStream(fos);
			oos.writeObject(m1);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//역직력화 (desrialization) : 파일 => 프로그램 => 메모리
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("C:\\test\\object.dat");
			ois = new ObjectInputStream(fis);
			MemberDTO dto1 = (MemberDTO)ois.readObject();
			System.out.println(dto1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
