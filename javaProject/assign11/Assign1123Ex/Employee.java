package Assign1123Ex;

public class Employee {
	
	private int num;//사원번호
	public String name;//이름
	String address;//주소
	String email;//이메일주소
	protected int salary;//연봉
	private String rrn; //주민번호
	
	//getter(메인 메소드에서 자식 클래스에 있는 생성자에 Num과 Rrn에 값을 부여할 것이기 때문에 세터는 없어도 됨)
	public int getNum() {
		return num;
	}
	public String getRrn() {
		return rrn;
	}
	public Employee() {

	}
	
	//매걔변수가 있는 생성자
	public Employee(int num, String name, String address, String email, int salary, String rrn) {
		this.num = num;
		this.name = name;
		this.address = address;
		this.email = email;
		this.salary = salary;
		this.rrn = rrn;
	}
	
	//개발자를 위한 디버깅용 메소드
	@Override
	public String toString() {
		return "Employee [num=" + num + ", name=" + name + ", address=" + address + ", email=" + email + ", salary="
				+ salary + ", rrn=" + rrn + "]";
	}
}
