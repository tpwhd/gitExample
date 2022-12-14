package ch04;

public class BreakEx4 {

	public static void main(String[] args) {
		int n = 1;
		while (n <= 10) {
			System.out.println(n + "Hello World");
			n++;
			if (n == 8) {
				break; //n값이 8일 때 빠져나감
			}
		}
		
	}

}
