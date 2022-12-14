package ch09;

public class ProductSale extends Product {
	private int price;
	private int amount;
	private int money;
	
	public void input(int code, String name, String company, String date, int price, int amount) {
		
		//부모의 private처리된 멤버변수에 값을 초기화할 떄는 setter를 활용
		setCode(code);
		setName(name);
		setCompany(company);
		setDate(date);
		
		//자녀쪽은 처리되었어도 얼마든 변수에 직접 접근 가능
		this.price = price;
		this.amount = amount;
	}
	
	public void calc() {
		money = price * amount;
	}
	
	public void print() {
		System.out.println("코드\t제품명\t제조사\t제조일자\t단가\t수량\t판매금액(단위 : 1000)");
		System.out.println(getCode() + "\t" + getName() + "\t" + getCompany() + "\t" + getDate() + "\t" + price + "\t" + amount + "\t" + money);
	}
	
}
