package Assign1111;

import java.util.Scanner;

public class MFP_Upgrade {

	public static void main(String[] args) {
		
		int con = 0, menu = 0;
		
		Scanner sc = new Scanner(System.in);
		out :
		
		while(true) {
			System.out.println("==메뉴==");
			System.out.println("[1] 한식");
			System.out.println("[2] 일식");
			System.out.println("[3] 중식");
			System.out.println("[4] 양식");
			System.out.println("원하는 나라의 음식[1]~[4]을 고르세요 (종료 : 0) > ");
			
			String con1 = sc.next();
			con = Integer.parseInt(con1);
			
			    if(con == 0) {
			    	System.out.println("나라 선택을 종료합니다.");
			    	break;
			    }else if(con < 1 || con > 3) {
			    	System.out.println("번호를 잘못입력하셨습니다. (종료 : 0)");
			    	continue;
			    }
			        if(con == 1) {
			        	for(;;) {
			        		
			        		System.out.println("한식 메뉴를 선택하세요");
			        		System.out.println("(1) 비빔밥");
			        		System.out.println("(2) 불고기");
			        		System.out.println("(3) 신선로");
			        		
			        		String menu1 = sc.next();
			        		menu = Integer.parseInt(menu1);
			        		
			        		if(menu == 0) break; 
			        		else if(menu == 99) break;
			        		else if(menu == 1) {
			        			System.out.println("고객님은 비빔밥을 선택하셨습니다.");
			        			break out;
			        		}else if(menu == 2) {
			        			System.out.println("고객님은 불고기를 선택하셨습니다.");
			        			break out;
			        		}else if(menu == 3) {
			        			System.out.println("고객님은 신선로를 선택하셨습니다.");
			        			break out;
			        		} //inner if
			        	} //for		        
			        } //outer if
			        if(con == 2) {
			        	for(;;) {
			        		
			        		System.out.println("일식 메뉴를 선택하세요");
			        		System.out.println("(1) 스시");
			        		System.out.println("(2) 카츠 산도");
			        		System.out.println("(3) 스키야키");
			        		
			        		String menu1 = sc.next();
			        		menu = Integer.parseInt(menu1);
			        		
			        		if(menu == 0) break; 
			        		else if(menu == 99) break;
			        		else if(menu == 1) {
			        			System.out.println("고객님은 스시를 선택하셨습니다.");
			        			break out;
			        		}else if(menu == 2) {
			        			System.out.println("고객님은 카츠 산도를 선택하셨습니다.");
			        			break out;
			        		}else if(menu == 3) {
			        			System.out.println("고객님은 스키야키를 선택하셨습니다.");
			        			break out;
			        		} //inner if
			        	} //for		        
			        } //outer if
			        if(con == 3) {
			        	for(;;) {
			        		
			        		System.out.println("중식 메뉴를 선택하세요");
			        		System.out.println("(1) 꿔바로우");
			        		System.out.println("(2) 유린기");
			        		System.out.println("(3) 양꼬치엔 칭따오");
			        		
			        		String menu1 = sc.next();
			        		menu = Integer.parseInt(menu1);
			        		
			        		if(menu == 0) break; 
			        		else if(menu == 99) break;
			        		else if(menu == 1) {
			        			System.out.println("고객님은 꿔바로우를 선택하셨습니다.");
			        			break out;
			        		}else if(menu == 2) {
			        			System.out.println("고객님은 유린기를 선택하셨습니다.");
			        			break out;
			        		}else if(menu == 3) {
			        			System.out.println("고객님은 양꼬치엔 칭따오를 선택하셨습니다.");
			        			break out;
			        		} //inner if
			        	} //for		        
			        } //outer if
			        if(con == 4) {
				        	for(;;) {
				        		
				        		System.out.println("(1) 리조또");
				        		System.out.println("(2) 파스타");
				        		System.out.println("(3) 스테이크");
				        		System.out.println("양식 메뉴를 선택하세요");
				        		
				        		String menu1 = sc.next();
				        		menu = Integer.parseInt(menu1);
				        		
				        		if(menu == 0) break; 
				        		else if(menu == 99) break;
				        		else if(menu == 1) {
				        			System.out.println("고객님은 리조또를 선택하셨습니다.");
				        			break out;
				        		}else if(menu == 2) {
				        			System.out.println("고객님은 파스타를 선택하셨습니다.");
				        			break out;
				        		}else if(menu == 3) {
				        			System.out.println("고객님은 스테이크를 선택하셨습니다.");
				        			break out;
				        		} //inner if
				        	} //for
				        } //outer if 
		} //while
	} //main
} //class
