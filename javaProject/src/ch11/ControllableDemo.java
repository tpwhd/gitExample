package ch11;

public class ControllableDemo {

	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.turnOn();
		tv.turnOff();
		tv.remotoOn();
		tv.remoteOff();
		tv.repair();
		Controllable.reset(); //static메소드에는 클래스이름.메소드로 접근해야함.
		
		System.out.println();
		
		Computer com = new Computer();
		com.turnOn();
		com.turnOff();
		com.repair();
		Controllable.reset();
		
	}
}
