package Assign1124;

	

public class StaticMethod2 {
	//멤버변수
	static int num = 10; //사번
	static String name = "홍길동"; //
	String email = "hong@gmail.com";
	String hp = "010-1234-5678";
	String addr = "서울 강남구 역삼동";
	
	
	public static void printA() {
		StaticMethod2 s = new StaticMethod2();
		System.out.println("사번 : " + StaticMethod2.num);
		System.out.println("이름 : " + StaticMethod2.name);
		System.out.println("이메일 : " + s.email);
		System.out.println("전화 : " + s.hp);
		System.out.println("주소 : " + s.addr + "\n");
	}
	
	public void printB() {
		StaticMethod2 s = new StaticMethod2();
		System.out.println("사번 : " + num);
		System.out.println("이름 : " + name);
		System.out.println("이메일 : " + s.email);
		System.out.println("전화 : " + s.hp);
		System.out.println("주소 : " + s.addr);	
		}
	public static void main(String[] args) {
		printA();
		StaticMethod2 s3 = new StaticMethod2();
		s3.printB();
	}
}
