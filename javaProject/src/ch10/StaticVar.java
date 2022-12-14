package ch10;

public class StaticVar {
	static int a = 10;
	int b = 20; //non
	public static void main(String[] args) {
		System.out.println(StaticVar.a); //클래스 이름.static member 변수
		//System.out.println(b);
		StaticVar s = new StaticVar();
		System.out.println(s.b);
	}
}
