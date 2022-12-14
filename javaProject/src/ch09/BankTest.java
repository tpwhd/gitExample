package ch09;

class Bank {
	double getInterestRate() {
		return 0.0d;
	}
}

class BadBank extends Bank {
	@Override
	double getInterestRate() { //메소드 오버라이딩(재정의)
		return 10.0d;
	}
}

class NormalBank extends Bank {
	double getInterestRate() { //메소드 오버라이딩(재정의)
		return 5.0d;
	}
}


class GoodBank extends Bank {
	@Override
	double getInterestRate() { //메소드 오버라이딩(재정의)
		return 3.0;
	}
}



public class BankTest {

	public static void main(String[] args) {
		BadBank b1 = new BadBank(); //객체생성, 인스턴스화(주소값 부여)
		NormalBank b2 = new NormalBank();
		GoodBank b3 = new GoodBank();
		System.out.println("BadBank의 이자율 : " + b1.getInterestRate());
		System.out.println("NormalBank의 이자율 : " + b2.getInterestRate());
		System.out.println("GoodBank의 이자율 : " + b3.getInterestRate());
		
	}
}
