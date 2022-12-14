package ch09;

public class ScholarStudent {
	//멤버변수
	String name; //이름
	String num; //학번
	String major; //전공
	int year; //학년
	
	//기본생성자
	public ScholarStudent() {
		
	}
	
	//일반 메서드
	public void input(String name, String num, String major, int year) {
		this.name = name;
		this.num = num;
		this.major = major;
		this.year = year;
	}
	
	
}
