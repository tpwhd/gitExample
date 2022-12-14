package ch06;

public class OverloadEx1 {

	public static void main(String[] args) {
		print(10.5);
		print("Hello");
	    print(100);
	    print("Hi ", "Java");
	}

	private static void print(double a) {
		System.out.println(a);
	}
	
	private static void print(String b) {
		System.out.println(b);
	}
	
	private static void print(int c) {
		System.out.println(c);
	}
	
	private static void print(String a, String b) {
		System.out.println(a +
				b);
	}


	
}
