package ch10;

class T {
	private int num = 10;
	public final void print() { //method에 final을 붙히면 오버라이딩이 안된다
		System.out.println(num);
	}
}


public class FinalMethod2 extends T {
	int num = 100;

	public static void main(String[] args) {
		//상속관계가 만들어 졌을 때는 자식 클래스를 객체생성하면 부모클래스는 자동 생성된다.
		FinalMethod2 f = new FinalMethod2();
		f.print();
	}
}
