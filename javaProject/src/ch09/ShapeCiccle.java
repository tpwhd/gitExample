package ch09;

public class ShapeCiccle extends Shape {
	private int radius; //5

	//getter, setter
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public ShapeCiccle() { }
	
	//매걔변수가 있는 생성자
	public ShapeCiccle(int radius) { //5
		super("Circle"); //부모생성자 호출
		this.radius = radius;
	}
	
	//부모클래스의 멤버메소드 오버라이딩
	public double calculateArea() {
		return radius * radius * Math.PI;
	}
	
	public void draw() {
		System.out.print("반지름이 " + radius + "인 원");
		super.draw(); //부모쪽 draw()를 호출
	}
	
}
