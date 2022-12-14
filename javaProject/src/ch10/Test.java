package ch10;

public class Test {
	static int a = 10; //static member
	int b = 20; //nonStatic member
	void print() { //nonStatic member
		System.out.println(a); //static => 이미 메모리에 올라와 있기 때문에 문제 없다.
		System.out.println(b); //nonStatic
	}
	public static void main(String[] args) {
		System.out.println(a);
		Test t = new Test(); //인스턴스화 (객체 생성)
		System.out.println(t.b);
//		t = null; //객체의 주소값을 초기화(주소값을 잃어버린다.)
//		System.out.println(t.b);
	}
}
