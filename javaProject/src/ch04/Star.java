package ch04;

public class Star {

	public static void main(String[] args) {
		for(int a = 1; a <= 5; a++) {
			for(int b = 1; b <= a; b++) {
				System.out.print("*");
			}// inner for
			System.out.println();
		}//outer for
		System.out.println("******");
		for(int a = 5; a >= 1; a--) {
			for(int b = 1; b <= a; b++) {
				System.out.print("*");
			}// inner for
			System.out.println();
		}//outer for
	}
}
