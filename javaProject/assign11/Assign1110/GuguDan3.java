package Assign1110;

public class GuguDan3 {

	public static void main(String[] args) {
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println("** " + dan + "단 **");
			for(int n = 1; n <= 9; n++) {
				System.out.print(+ dan + " x " + n + " = " + dan * n + "\t");
			}
			System.out.println();
		}
	}
}
