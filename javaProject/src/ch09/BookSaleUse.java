package ch09;

public class BookSaleUse {

	public static void main(String[] args) {
		BookSale b1 = new BookSale();
		b1.setBookName("Java");
		b1.setPress("길벗");
		b1.setAhthor("김철수");
		b1.setYear(2022);
		b1.setPrice(30000);
		b1.setAmount(500);
		b1.setMoney();
		b1.setRank(1);
		b1.print();
	}
}
