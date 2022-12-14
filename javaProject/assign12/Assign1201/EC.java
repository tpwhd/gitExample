package Assign1201;

public class EC {
	private int no;
	private String orderDate;
	private String product;
	private String cardName;
	private String cardNo;
	private int pay;
	
	public void input() {
	}
	
	//기본생성자
	public EC() {
		// TODO Auto-generated constructor stub
	}

	
	public EC(int no, String orderDate, String product, String cardName, String cardNo, int pay) {
		super();
		this.no = no;
		this.orderDate = orderDate;
		this.product = product;
		this.cardName = cardName;
		this.cardNo = cardNo;
		this.pay = pay;
	}



	//getter, setter
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public static int replace(String substring, String string) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static EC replace(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}
	 
	
	
	

}
