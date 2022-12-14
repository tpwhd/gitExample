package ch07;

public class BookStoreUse {

	public static void main(String[] args) {
		BookStore b1 = new BookStore(); //객체생성, 생성자는 메소드이다.
		b1.setBookName("Java");
		b1.setAuthor("김선생");
		b1.setPress("영진");
		b1.setYear(2022);
		b1.setAmount(10);
	    b1.setPrice(30000);
	    b1.print();
	}
}
