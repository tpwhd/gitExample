package ch02;

public class VarScope {
	static int x; //전역변수, x = 0;
	
	public static void main(String[] args) {
		int y = 0; //지역번수
		
		System.out.println("x = " + x); 
		//안의 +기호는 연결연산자로서 문자열과 변수등을 연결하는 역할을 한다
	   System.out.println("y = " + y);
	}

}
