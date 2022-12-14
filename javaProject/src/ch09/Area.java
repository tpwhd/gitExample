package ch09;

public class Area {
	//멤버변수
	private int width; //int 기본으로 0으로 초기화, 30
	private int length; //0, 20
	
	//생성자
	public Area() { }
	
	//매걔변수가 있는 생성자
	public Area(int width, int lenght) {
		super();
		this.width = width;
		this.length = lenght;
	}

	//getter, setter
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLenght() {
		return length;
	}

	public void setLenght(int lenght) {
		this.length = lenght;
	}
	
	//일반 메소드
	public int getArea() {
		return length * width;
	}
	
	
	
}
