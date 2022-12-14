package ch08;

class Circle {
	//멤버변수(전역,필드)
	double radius;
	String color;
	
	//생성자
	public Circle(double r, String c) { //생성자는 멤버변수에 값을 초기화 시켜주는 용도로만 사용가능(리턴을 못해주기 때문에)
		radius = r;
		color = c;
	}
	public Circle(double r) {
		radius = r;
		color = "purple";
	}
	public Circle(String c) {
		radius = 21.0d;
		color = c;
	}
	public Circle() {
		radius = 3.5d;
		color = "sky blue";
	}
	public void print() {
		System.out.println("반지름 : " + radius);
		System.out.println("색깔 : " + color + "\n");
	}
}



public class CircleDemo {

	public static void main(String[] args) {
		Circle c1 = new Circle(21.0d, "pink");
		c1.print();
		
		Circle c2 = new Circle(3.14d);
		c2.print();
		
		Circle c3 = new Circle("mint");
		c3.print();
		
		Circle c4 = new Circle();
		c4.print();
	}
	
}
