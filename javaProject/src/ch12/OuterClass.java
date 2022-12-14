package ch12;

public class OuterClass {
	private static int x = 10;
	class Inner { //내부 클래스(중첩 클래스, 인스턴스 클래스)
		int getX() {
			return x; //외부클래스의 private 변수를 마음대로 사용가능
		}
	}
	
	public static void main(String[] args) {
		System.out.println(x);
		OuterClass e = new OuterClass();
		OuterClass.Inner in = e.new Inner();
		System.out.println(in.getX());
	}
}
