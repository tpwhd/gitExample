package ch07;

public class StudentUse {

	public static void main(String[] args) {
		//객체생성
		Student s1 = new Student();
		
		//데이터 입력
		s1.setName("홍길동");
		s1.setMajor("컴퓨터");
		s1.setYear(3);
		s1.setNum("202211");
		s1.setPoint(4.1);
		s1.setMoney(400);
		
		s1.print(); //출력용도 메소드 호출
		
		System.out.println(s1);
	
	}
	
}
