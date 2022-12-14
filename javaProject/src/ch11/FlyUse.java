package ch11;

public class FlyUse {

	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.takeOff();
		bird.fly();
		bird.land();
		
		Airplane air = new Airplane();
		air.takeOff();
		air.fly();
		air.land();
		
		System.out.println("================");
		
		//실무에서는
		Flyer f = new Bird(); //좌:부, 우:자 => 다형성기법
		f.takeOff();
		f.fly();
		f.land();
		
		f = new Airplane();
		f.takeOff();
		f.fly();
		f.land();
	}
}
