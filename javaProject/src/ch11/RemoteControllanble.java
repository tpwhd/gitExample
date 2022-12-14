package ch11;

public interface RemoteControllanble extends Controllable {
	//인터페이스끼리는 extends로 상속받는다.
	void remotoOn();
	void remoteOff();
}
