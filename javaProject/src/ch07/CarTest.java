package ch07;

public class CarTest {

	public static void main(String[] args) {
		Car myCar; //ObjectTest 타입의 myCar 선언
		myCar = new Car();  //myCar 안에 ObjectTest Class 넣어주기
		myCar.changeGear(1);
		myCar.speedUp();
		System.out.println(myCar);
		
		
	}
}
