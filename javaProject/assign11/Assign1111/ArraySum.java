package Assign1111;

public class ArraySum {

	public static void main(String[] args) {
		int[] a;
		int b = 0;
		a = new int  [5];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		for(int  i = 0; i < a.length; i++) {
			b = b + a[i];
		}
		System.out.println("합계 : " + b);
	}

}
