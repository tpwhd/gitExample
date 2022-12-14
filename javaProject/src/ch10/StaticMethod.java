package ch10;

public class StaticMethod {
	//멤버변수
	static int a = 10;
	int b = 20;
	
	public static void printA() { //static member method
		System.out.println(a);
		StaticMethod b = new StaticMethod();
	}
	
	public void printB() {
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		printA();
		StaticMethod b = new StaticMethod();
		b.printB();
		//printB(); main 바깥에 있는 멤버형 nonStatic 메소드이기 때문에
		//반드시 인스턴스화 이후에 사용해야한다
}
}