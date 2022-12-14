package ch09;

public class ShapeMain {

	public static void main(String[] args) {
		ShapeCiccle c = new ShapeCiccle(5); //객체생성 겸 매걔변수(String 1개)가 있는 생성자 호출
		c.draw();
		System.out.println("원의 면적은 " + c.calculateArea() + "입니다.\n");
		
		ShapeTriangle t = new ShapeTriangle(4, 6);
		t.draw();
		System.out.println("삼각형의 면적은 " + t.calculateArea() + "입니다.\n");
		
		ShapeRectangle r = new ShapeRectangle(5, 8);
		r.draw();
		System.out.println("사각형의 면적은 " + r.calculateArea() + "입니다");
	}
}
