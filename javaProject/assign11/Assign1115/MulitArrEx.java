package Assign1115;

import java.util.Scanner;

public class MulitArrEx {
		public static void main(String[] args) {
			String[][] words = {{"chair","의자"} //words[0][0], word[0][1]
		,{"computer","컴퓨터"} //words[1][0], word[1][1]
		,{"Integer","정수"}}; //words[2][0], word[2][1]
			
		String a = "-1";
		
		Scanner sc = new Scanner(System.in);
		outer:
		
		for(;;) {
			for(int i = 0; i < words.length; i++) {
			System.out.printf("문제%d %s의 뜻은? 프로그램 종료 => -1 :", i+1, words[i][0]);
			String tmp = sc.next();
			sc.close();
			if(tmp.equals(words[i][1])) {
				System.out.printf("정답입니다.%n%n");
			}else if(tmp.equals(a)) {
				System.out.println("프로그램을 종료합니다.");
				break outer;
			}
			else System.out.printf("틀렸습니다. 정답은 %s입니다. %n%n", words[i][1]);
		     } //inner for
			
		} // outer for
	} //main
} //class
