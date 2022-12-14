package ch04;

public class Star2 {

	public static void main(String[] args) {
		for(int a = 1; a < 5; a++) {
			for(int b = 4; b > 0; b--) {
				if(a < b) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}//if else
			}//inner for
			System.out.println("");
		}//outer for
	}
}
