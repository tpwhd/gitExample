package ch09;

public class Scholar extends ScholarStudent {	
	//멤버변수
	private String category; //장학금 종류
	private int money; //장학금
	
	//일반 메서드
	public void input(String name, String num, String major, int year, String category, int money) {
		super.input(name, num, major, year); //부모쪽
		this.category = category; //자녀쪽
		this.money = money;
	}
	
	//출력
	public void print() {
		System.out.println("이름 \t 학번 \t 전공 \t 학년 \t 장학금 종류 \t 장학금");
		System.out.println(name + "\t " + num + "\t " + major + "\t " + year + "\t    " + category + "\t\t" + money);
	}
	
	public void print2() {
		System.out.println("이름 \t 학번 \t 전공 \t 학년");
		System.out.println(name + "\t " + num + "\t " + major + "\t" + year);
	}
	

}
