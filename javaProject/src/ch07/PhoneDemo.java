package ch07;

//한개의 파일에 2개 이상의 class 파일을 작성시에는 public class의 클래스 이름으로 저장, public처리
//나머지 클래스는 default로 처리
class Phone {
	String model;
	int value;
	void print() {
		System.out.println(value + "만원 짜리 " + model + "폰");
	}
}


public class PhoneDemo {

	public static void main(String[] args) {
		Phone myPhone = new Phone(); //객체 생성
		myPhone.model = "갤럭시 22";
		myPhone.value = 100;
		myPhone.print();
		
		Phone yourPhone = new Phone();
		yourPhone.model = "iPhone";
		yourPhone.value = 150;
		yourPhone.print();
	}
}
