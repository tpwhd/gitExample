package ch12;

abstract class Action {
	public abstract void exec(); //추상메소드
	
	
}

public class ActionExam extends Action {
	
	@Override
	public void exec() {
		System.out.println("I am Child");
	}
	
	public static void main(String[] args) {
		Action a = new ActionExam() { //익명 내부 클래스 
			String name = "kim";
			
			@Override
			public void exec() {
				System.out.println("나는 " + name + "이다.");
			}
		
		
		}; //익명 내부 클래스으 마지막 중괄호 다음에는 세미콜론(;)이 명시 되어야한다.
		
			
		
	}
	}

