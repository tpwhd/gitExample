package ch07;

public class Employee {
	private String name;
	private String part; //부서
	private String Position; //직위
	private int basic; //기본급
	private int bonus; //보너스(기본급의 300%)
	private int total; //총액(기본급 + 보너스)
	private int tax; //세액(총액의 3.3%)
	private int salary; //실수령액(총액 - 세액)
	
	//일반 메소드 처리
	public void input(String name, String part, String position, int basic) {
		this.name = name;
		this.part = part;
		Position = position;
		this.basic = basic;
	}
	
	public void calc() {
		bonus = basic * 3;
		total = basic + bonus;
		tax = (int)(total * 0.033);
		salary = total - tax;
		
	}
	
	//출력용도
	public void print() {
		System.out.println("이름 \t 부서 \t 직위 \t 기본급 \t 보너스"
				+ "\t 총액 \t 세액 \t 실수령액");
		System.out.println(name + "\t" + part  + "\t" + Position + "\t" + basic
				 + "\t" + bonus + "\t" + total + "\t" + tax+ "\t" + salary);
		
	}
	
}
