package ch09;

public class ShapeTriangle extends Shape {
	//멤버변수
	private int width;
	private int height;

	//getter, setter
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	//매걔변수가 있는 생성
	public ShapeTriangle(int width, int height) { //4, 6
		super("Triangle");
		this.width = width;
		this.height = height;
	}
	
	//부모클래스의 멤버메소드 오버라이딩
	@Override
	public double calculateArea() {
		return width * (height * 0.5);
	}
	
	@Override
	public void draw() {
		System.out.print("높이가 " + height + ", 밑변이 " + width + "인 삼각형");
		super.draw(); //부모쪽 draw()호출
	}
	
	
}
