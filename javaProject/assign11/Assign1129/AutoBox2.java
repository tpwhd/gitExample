package Assign1129;

public class AutoBox2 {

	public static void main(String[] args) {
		//기본자료형 
		int num1 , num2, num3 = 50;
		
		//참조자료형
		Integer i1 = 30;
		Integer i2 = new Integer(40);
		Integer i3 = new Integer(50);
		
		num1 = i1;
		num2 = i2;
		i3 = num3;
		
		System.out.println("기본자료형 : " + num1 + "," + "객체자료형 : " + i1);
		System.out.println("기본자료형 : " + num2 + "," + "객체자료형 : " + i2);
		System.out.println("기본자료형 : " + num3 + "," + "객체자료형 : " + i3);
		
	}
}
