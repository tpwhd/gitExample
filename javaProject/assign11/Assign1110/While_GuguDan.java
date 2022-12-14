package Assign1110;

import java.util.Scanner;

public class While_GuguDan {

	public static void main(String[] args) {
		
		int i = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 단이 궁금하느냐 : ");
		int dan = sc.nextInt();		
		
		System.out.println("** " + dan + "단**");
		while (dan <= 9) {
			while(i <= 9) {
				
				System.out.println(dan + "x" + i + "=" +(dan * i));
				
				i++;
			}//inner
			dan++;
		}//outer
		sc.close();
   }
}