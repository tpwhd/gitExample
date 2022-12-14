package Assign1121;

public class Employee2 {
	private String name;
	private String part; //부서
	private String position; //직위
	private int basic; //기본급
	private int bonus; //보너스(기본급의 300%)
	private int total; //총액(기본급 + 보너스)
	private int tax; //세액(총액의 3.3%)
	private int salary; //실수령액(총액 - 세액)
	
	//게터 세터
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getBasic() {
		return basic;
	}
	public void setBasic(int basic) {
		this.basic = basic;
	}
	public int getBonus() {
		bonus = basic * 3;
		return bonus;
	}
	public void setBonus(int bonus) {
		basic = basic * 3;
		this.bonus = bonus;
	}
	public int getTotal() {
		total = basic + bonus;
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTax() {
		tax = (int)(total * 0.033);
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public int getSalary() {
		salary = total - tax;
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void print() {
		System.out.println("이름 \t 부서 \t 직위 \t 기본급 \t 보너스 \t 총액 \t 세금 \t 실수령액");
		System.out.println(name + "\t " + part + "\t " + position + "\t " + basic + "\t " + 
		getBonus() + "\t " + getTotal() + "\t " + getTax() + "\t " + getSalary()); 
	}
	




}
