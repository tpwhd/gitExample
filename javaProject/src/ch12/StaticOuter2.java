package ch12;

public class StaticOuter2 {
	static int data = 30;
	int data2 = 50;
	static class StaticInner2 {
		void msg() {
			System.out.println("data is " + data);
//			System.out.println("data is " + data2); //non-static 멤버는 사용 불가능
		}
	public static void main(String[] args) {
//		내부 static클래스 생성
		StaticOuter2.StaticInner2 in = new StaticOuter2.StaticInner2();
		in.msg();
		
		}
	}
}
