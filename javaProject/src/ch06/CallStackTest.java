package ch06;

public class CallStackTest {

	public static void main(String[] args) {
		fitstMethod();
	}//프로그램 끝

	public static void fitstMethod() {
		secondMethod();
	}

	public static void secondMethod() {
		System.out.println("seconMethod()");
	
	}
}
