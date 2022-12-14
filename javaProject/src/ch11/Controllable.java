package ch11;

public interface Controllable {
	//인터페이스에서 명시적 default(static) 메소드로의 구현은 jdk8부터 가능(실무에서는 아직 사용안한다고 함)
	default void repair() {
		System.out.println("장비를 수리한다.");
	}
	static void reset() {
		System.out.println("장비를 초기화 한다.");
	}
	
	//참고 : private 메소드 구현은 jdk9부터 사용가능
	void turnOn();
	void turnOff();
}
