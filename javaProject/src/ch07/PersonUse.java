package ch07;

public class PersonUse {

	public static void main(String[] args) {
		
		Person p1 = new Person(); //객체생성, 인스턴스화 => 메모리에 올리는 작업
		p1.setName("김철수");
		p1.setAge(20);
		p1.setHeight(180.0d);
		p1.print();
		System.out.println("이름 : " + p1.getName());
		System.out.println("나이 : " + p1.getAge());
	    System.out.println("신장 : " + p1.getHeight());
		
	}
}
