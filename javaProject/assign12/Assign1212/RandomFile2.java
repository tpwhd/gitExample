package Assign1212;

import java.io.RandomAccessFile;

public class RandomFile2 {

	public static void main(String[] args) {
		String str = "UserID : kim";
		try {//r:읽기전용, w:쓰기전용, rw:읽기,쓰기
			RandomAccessFile file=new RandomAccessFile("c:\\test\\rand2.txt", "rw");
			//getFilePointer : 파일포인터(파일을 어디까지 읽었는지 가리킴)
			System.out.println(file.getFilePointer());//0
			file.seek(10);//10번째 인덱스 부터
			System.out.println(file.getFilePointer());//8
			file.write("park".getBytes()); //인덱스8번 위치에서 기존내용을 덮어쓰게 된다.
			System.out.println(file.length()); //문자길이 확인(한글은 3바이트 길이값을 가짐)
			System.out.println(file.getFilePointer());
			while (file.getFilePointer() < file.length()) { //파일의 내용보다 파일포인터의 위치값이 적으면 반복
				str=file.readLine();
			
				str = new String(str.getBytes("8859_1"),"utf-8");
			}
			System.out.println(file.length());
			System.out.println(file.getFilePointer());
			file.close();//파일 저장 시점
			System.out.println("파일이 저장되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
