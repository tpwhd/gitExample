package ch04;

import java.util.Scanner;

//중첩 if문
public class Nested_If {

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 정수를 입력하세요 : ");
		a = sc.nextInt();
		System.out.print("범위로 쓸 정수를 입력하세요 : ");
		b = sc.nextInt();
		sc.close();
		
		if (a > b) {
			if((a % 2) == 0) {
				System.out.println(a+"은(는) "+b+"보다 큰 짝 수");
		    }else  {
	       		System.out.println(a+"은(는) "+b+"보다 큰 홀 수");
		    }
		}else {
			if((a % 2) == 0) {
				System.out.println(a+"은(는)"+b+"보다 작은 짝 수");
			}else {
				System.out.println(a+"은(는)"+b+"보다 작은 홀 수");
				
			}
		}
		
		
		
		
		
		
		
	}

}
