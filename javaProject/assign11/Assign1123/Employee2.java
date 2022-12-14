package Assign1123;

public class Employee2 {
	 private int num; //사원번호
	 public String name; //이름
	 String address; //주소
	 String email; //이메일주소
	 protected int salary; //연봉
	 private String rrn; //주민번호
	 
	 //게터 세터
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getRrn() {
		return rrn;
	}
	public void setRrn(String rrn) {
		this.rrn = rrn;
	}

	public Employee2() {}

}
