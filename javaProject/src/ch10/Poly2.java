package ch10;

class Pa {
	String name = "홍길동";
	String email = "hong@gmail.com";
	public void print() {
		System.out.println("이름 : " + name);
		System.out.println("이메일"
				+ " : " + email);
		
	}
}

class Ch extends Pa {
	int num = 10;
	@Override
	public void print() {
		System.out.println("사번 : " + num);
		super.print(); //부모쪽 print() 호출
	}
}

public class Poly2 {

	public static void main(String[] args) {
		String Tel = "010-1234-5678" ;
		String Address = "서울 강남구 역삼동";
		Pa c = new Ch(); //다형성(좌:부 우:자)
		c.print();
	    System.out.println("전화번호 : " + Tel);
	    System.out.println("주소 : " + Address);
	    
	}
}
