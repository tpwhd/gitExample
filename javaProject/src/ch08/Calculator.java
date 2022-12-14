package ch08;

public class Calculator {
	//멤버변수
	private int left;
	private int right;
	
	//기본생성자(지금까지는 JVM이 만들어줌)
	//매걔변수가 있는 생성자를 만들면 기본생성자가 나오지 않으므로 기본 생성자를 만들어주는 습관을 만들도록
	public Calculator() { //메소드이지만 클래스 이름과 같은 메소드(특별한 메소드)
		System.out.println("기본생성자 호출...");
	}
	
	//매걔변수가 있는 생성자
	//오버로딩
	public Calculator(int left, int right) {
		System.out.println("매걔변수가 있는 생성자 호출...");
		this.left = left;
		this.right = right;
	}

	//게터 세터
	public int getLeft() {
		return left;
	}

	public void setLeft(int left) {
		this.left = left;
	}

	public int getRight() {
		return right;
	}

	public void setRight(int right) {
		this.right = right;
	}
	public void sum() {
		System.out.println(left+right);
	}
	public void avg() {
		System.out.println((left+right) / 2);
	}
}
