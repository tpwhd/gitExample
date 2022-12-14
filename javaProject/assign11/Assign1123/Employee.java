package Assign1123;

public class Employee {
	//멤버변수
	private int num; //사원번호
	public String name; //이름
	private String rrn; //주민번호
	String address; //주소
	String email; //이메일주소
	protected int salary;//연봉
	
	//게터 세터
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//게터 세터
	public String getRrn() {
		return rrn;
	}
	public void setRrn(String rrn) {
		this.rrn = rrn;
	}

	//기본생성자
	public Employee() { }
}
