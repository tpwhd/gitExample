package ch06;

public class CallEx {

	public static void test2(int a) {
		System.out.println(a);
		
	}
	
	public static void main(String[] args) {
		System.out.println("시작 ");
		int a = 10;
		test(a); // a는 call by value 형식으로 호출, 메소드 호출
		
		test2(a);
		System.out.println("끝");
		
	}

	public static void test(int ab) {
		System.out.println("test method 호출");
		System.out.println(ab); // 메소드를 호출한 곳으로 복귀
		
	}
}
