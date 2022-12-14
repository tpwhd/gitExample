package Assign1109;

public class Odd {

	public static void main(String[] args) {
		int p  = 0;
		for(int q= 0; q <= 10; q++) {
			if (q % 2 == 1) {
				p = p + q;
			}
		}
		System.out.println("1~10까지 홀수의 합은? : " + p);
	}
}