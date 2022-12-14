package ch09;

public class Shape extends Object { 
	//멤버변수
	private String name; //"Circle"
	
	//기본생성자
	public Shape() { }
	
	//매걔변수가 있는 생성자
	public Shape(String name) {
		super(); //Object 클래스의 기본생성자 호출
		this.name = name;
	}
	
	//getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double calculateArea() {
		return 0;
	}
	
	public void draw() {
		System.out.println("도형을 그립니다");
	}
	
}
