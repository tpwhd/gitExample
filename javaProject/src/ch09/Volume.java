package ch09;

public class Volume extends Area {
	//멤버변수
	private int height;
	
	//기본생성자
	public Volume() { }
	
	//
	public Volume(int height, int length, int width) { //height = 10, length = 20, width = 30
		super(width, length);
		this.height = height;
	}
	
	public int getVolume() {
		return getArea() * height; 
	}

	
}
