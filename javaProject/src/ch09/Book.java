package ch09;

public class Book {
	//멤버변수
	private String bookName; //책이름
	private String ahthor; //저자
	private String press; //출판사
	private int year; //출판년도
	private int price; //단가

	//getter, setter
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAhthor() {
		return ahthor;
	}
	public void setAhthor(String ahthor) {
		this.ahthor = ahthor;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
