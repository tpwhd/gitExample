package Assign1123;

public class Manager extends Employee {

	//일반 메소드
	public void input( String address, String email, int salary) {
		this.address = address;
		this.email = email;
		this.salary = salary;
	}
	public void showInfo() {
		System.out.println("사원번호\t\t이름\t주소\t\t이메일 주소\t연봉\t\t주민번호");
		System.out.println(getNum() + "\t" + getName() + "\t" + address + "\t" + email + "\t" + 
				salary + "\t    " + getRrn());
		
	}
	
	
}
