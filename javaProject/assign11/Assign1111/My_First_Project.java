package Assign1111;

import java.util.Scanner;

public class My_First_Project {

	public static void main(String[] args) {
		int menu = 0;
		int con = 0;
		
		Scanner sc = new Scanner(System.in);
		outer:
			
		while (true) {
	    System.out.println("==메뉴==");
		System.out.println("[1] 한식 ");
		System.out.println("[2] 양식 ");
		System.out.println("[3] 중식 ");
		System.out.print("원하는 나라의 음식[1~3]을 선택하세요. (종료 : 0) > ");
		String tmp = sc.next();
		con = Integer.parseInt(tmp);
		
			if (con == 0) {
				System.out.println("음식 고르기를 종료합니다.");
				break;
			}else if (con < 1 || con > 3) {
				System.out.println("번호를 다시 입력하세요. (종료 : 0)");
				continue;
			}
			if (con == 1) {
				for (;;) {
					System.out.println("[한식메뉴]");
					System.out.println("(1)김치찌개");
					System.out.println("(2)된장찌개");
					System.out.println("(3)삼겹살");
					System.out.println("(4)비빔밥");
				    System.out.println("한식 메뉴를 선택하세요 (한식 메뉴 선택 종료 : 0, 전체 종료 : 99)");
				    tmp = sc.next();
					menu = Integer.parseInt(tmp);
					if(menu == 0) break; //for문 종료
					System.out.println();
					if(menu == 99) break outer;//while문까지 종료
					switch(menu) {
					case 1:
						System.out.println("고객님은 김치찌개를 선택하셧습니다.");
						break outer;
					case 2:
						System.out.println("고객님은 된장찌개를 선택하셧습니다.");
						break outer;
					case 3:
						System.out.println("고객님은 삼겹살를 선택하셧습니다.");
						break outer;
					case 4:
						System.out.println("고객님은 비빔밥를 선택하셧습니다.");
						break outer;
					    } //switch
			        } // for
	           }else if (con == 2) {
	        	   for (;;) {
					System.out.println("[양식메뉴]");
					System.out.println("(1)돈까스");
					System.out.println("(2)비프 스테이크");
					System.out.println("(3)카레라이스");
				    System.out.println("양식 메뉴를 선택하세요 (양식 메뉴 선택 종료 : 0, 전체 종료 : 99)");
				    tmp = sc.next();
					menu = Integer.parseInt(tmp);
					if(menu == 0) break; //for문 종료
					if(menu == 99) break outer;//while문까지 종료
					switch(menu) {
					case 1:
						System.out.println("고객님은 돈까스를 선택하셧습니다.");
						break outer;
					case 2:
						System.out.println("고객님은 비프 스테이크를 선택하셧습니다.");
						break outer;
					case 3:
						System.out.println("고객님은 카레라이스를 선택하셧습니다.");
						break outer;
					} //switch
					
			        } //for
	        	   
	           }else if (con == 3) {
	        	   for (;;) {
					System.out.println("[중식메뉴]");
					System.out.println("(1)짜장면");
					System.out.println("(2)짬뽕");
					System.out.println("(3)탕수육");
				    System.out.println("중식 메뉴를 선택하세요 (중식 메뉴 선택 종료 : 0, 전체 종료 : 99)");
				    tmp = sc.next();
					menu = Integer.parseInt(tmp);
					if(menu == 0) break; //for문 종료
					if(menu == 99) break outer;//while문까지 종료
					switch(menu) {
					case 1:
						System.out.println("고객님은 짜장면을 선택하셧습니다.");
						break outer;
					case 2:
						System.out.println("고객님은 짬뽕을 선선택하셧습니다.");
						break outer;
					case 3:
						System.out.println("고객님은 탕수육을 선택하셧습니다.");
						break outer; 
				         } //switch
			        } //for
	           } //if
           } //while
 	 } //main
} //class