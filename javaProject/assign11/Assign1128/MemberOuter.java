package Assign1128;

public class MemberOuter {
	static int num = 1;
	static String name = "홍길동";
	static String email = "hong@gmail.com";
	
	static class MemberInner {
		void print() {
			System.out.println("------------------------");
			System.out.println("고객번호 : " + num);
			System.out.println("이름 : " + name);
			System.out.println("이메일 : " + email);
			System.out.println("------------------------");
		}
		public static void main(String[] args) {
			MemberInner m2 = new MemberInner();
			m2.print();
		}
			
		
	}
}
