package ch03;

public class StringExam {

	public static void main(String[] args) {
		String str = "Hello " + "java"; //+는 문자열을 연결(연결연산자)
		System.out.println(str);
		str = 123 + "C"; //숫자 + 문자열 => 숫자여도 문자열로 변환
		System.out.println(str);
		
		str += "Programmer"; //str = str + "Programmer"
		System.out.println(str);
		
	}

}
