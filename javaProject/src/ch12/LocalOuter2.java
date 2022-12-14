package ch12;

public class LocalOuter2 {
	private int x = 20;
	int data = 50;
	void display() {
		class LocalInner2 {
			int value = 50;
			void msg() {
				System.out.println(value);
				System.out.println(data);
			}
		}
		LocalInner2 li = new LocalInner2();
		li.msg();
	}
	
	public static void main(String[] args) {
		LocalOuter2 lo = new LocalOuter2();
	}
}
