package ch10;

//static => 메모리에 바로 로딩
//nonStatic => 객체생성 후에 롣ㅇ
public class A {
	//멤버 변수
	String name = "kim"; //nonStatic member
	static int n = 20; //static member
	
	//멤버 메소드
	public void print() {
		System.out.println(name);
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		//지역변수
		int a = 10;
		double b = 20.5d;
		System.out.println(a);
		System.out.println(b);
		System.out.println(n);
		A a1 = new A();
		System.out.println(a1.name); //nonStatic member는 반드시 객체 생성 이후에 사용가능하다.
	}
}
