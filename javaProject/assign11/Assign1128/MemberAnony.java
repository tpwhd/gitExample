package Assign1128;

public class MemberAnony implements Member{

	static int num = 2;
	static String name = "김길동";
	static String email = "kim@gmail.com";

	public static void main(String[] args) {

		Member m = new Member() {

			@Override
			public void print() {
				System.out.println("----------------------");
				System.out.println("고객번호 : " + num);
				System.out.println("이름 : " + name);
				System.out.println("이메일 : " + email);
				System.out.println("----------------------");
			}
		};
		m.print();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub

	}
}
