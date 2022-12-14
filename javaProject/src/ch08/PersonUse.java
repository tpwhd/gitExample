package ch08;

public class PersonUse {

	public static void main(String[] args) {
		Person p1 = new Person(); //객체과 동시에 기본생성자 호출
		p1.showInfo();
		
		Person p2 = new Person("추신수"); //Person(String) 형태의 생성자 호출
		p2.showInfo();
		
		Person p3 = new Person("이강호", 180); //Person(String, int) 형태의 생성자 호출
		p3.showInfo();
		
		Person p4 = new Person("구자욱", 175, 72); //Person(String, int, int) 형태의 생성자 호출
		p4.showInfo();
		
		Person p5 = new Person("이몽룡", 23040);
		
		p5.showInfo();
	}
}
