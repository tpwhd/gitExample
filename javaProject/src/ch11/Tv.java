package ch11;

public class Tv implements Controllable, RemoteControllanble {

	public void remotoOn() {
		System.out.println("리모콘으로 TV를 켠다.");

	}

	public void remoteOff() {
		System.out.println("리모콘으로 TV를 끈다.");
		// TODO Auto-generated method stub

	}

	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV를 켠다.");

	}

	public void turnOff() {
		System.out.println("TV를 끈다.");
		// TODO Auto-generated method stub

	}

}
