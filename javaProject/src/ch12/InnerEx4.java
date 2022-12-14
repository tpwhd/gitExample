package ch12;

class Outer {
	class InstanceInner { //내부클래스
		int a = 100; //non-static
	}
	static class StaticInner { //static 내부클래스
		int a = 200; //non-static
		static int b = 300;
	}
	void myMethod() { //멤버메소드
		class LocalInner { //지역중첩클래스
			int a = 400; //non-static
		}
		LocalInner i = new LocalInner();
		System.out.println("i.a : " + i.a);
	} //end method
}




public class InnerEx4 {

	public static void main(String[] args) {
		Outer oc = new Outer();
		Outer.InstanceInner i = oc.new InstanceInner();
		
		System.out.println("i.a : " + i.a);
		System.out.println("Outer.StaticInner.b : " + Outer.StaticInner.b);
		
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println("sia : " + si.a);
		
		
	}
}
