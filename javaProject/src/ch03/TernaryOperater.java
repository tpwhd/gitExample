package ch03;

public class TernaryOperater {
//3항 연산자
	public static void main(String[] args) {
		int x = 1;
		int y;
		y = (x == 1) ? 10 : 20;
		System.out.println(y);
		y = (x > 1) ? x++  : x + 20;
		System.out.println(y);
		
		
	}

}
