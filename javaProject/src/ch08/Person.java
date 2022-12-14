package ch08;

public class Person {
	//멤버변수
	private String name; //"홍길동", "추신수", "이강호", "구자욱"
	private int height; //170, 190, 180, 175
	private int weight; //60, 100, 75, 72
	
	//this() = 다른 생성자 호출
	
	public Person() { //기본 생성자(default constructor)
		this("홍길동", 170, 60);
	}
	public Person(String name) {
		this(name, 190, 100);	
	}
	public Person(String name, int height) {
		this(name, height, 75);
	}
	public Person(String name, int height, int weight) { //name = "홍길동", height = 170, weight = 60
		this.name = name; //this.멤버변수 = 지역변수
		this.height = height;
		this.weight = weight;
	}
	
	//출력용도
	public void showInfo() {
		System.out.println("====신상 정보====");
		System.out.println("이름 : " + name);
		System.out.println("신장 : " + height);
		System.out.println("몸무게 : " + weight);
	}
	
	
	
}
